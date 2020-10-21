package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    DatabaseHelper db;
    Button login, register;
    EditText nama, alamat, username, password, passwordkon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DatabaseHelper(this);

        nama    = (EditText)findViewById(R.id.editText_namaRegis);
        alamat    = (EditText)findViewById(R.id.editText_alamatRegis);
        username    = (EditText)findViewById(R.id.editText_usernameRegis);
        password    = (EditText)findViewById(R.id.editText_passwordRegis);
        passwordkon    = (EditText)findViewById(R.id.editText_passwordKonRegis);
        login       = (Button)findViewById(R.id.btn_loginRegis);
        register       = (Button)findViewById(R.id.btn_registerRegis );

        //klik login
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent  = new Intent(Register.this, Login.class);
                startActivity(loginIntent);
                finish();
            }
        });

        //klik register
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNama  = nama.getText().toString();
                String strAlamat  = alamat.getText().toString();
                String strUsername  = username.getText().toString();
                String strPassword  = password.getText().toString();
                String strPasswordKon  = passwordkon.getText().toString();
                if (strPassword.equals(strPasswordKon)){
                    Boolean daftar  = db.insertUser(strNama, strAlamat, strUsername, strPassword);
                    if (daftar == true){
                        Toast.makeText(getApplicationContext(), "Daftar Berhasil", Toast.LENGTH_SHORT).show();
                        Intent loginIntent  = new Intent(Register.this, Login.class);
                        startActivity(loginIntent);
                        finish();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Daftar Gagal", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Password Dan Password Konfirmasi Tidak Sama", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}