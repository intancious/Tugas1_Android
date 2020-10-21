package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;

public class List<DataFilter> extends AppCompatActivity {
    DatabaseHelper db;
    Button logout;
    Button bacK;
    EditText nama,alamat,username,password;
    ListView li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        nama    = (EditText) findViewById(R.id.editText_namaRegis);
        alamat  = (EditText) findViewById(R.id.editText_alamatRegis);
        username    = (EditText)findViewById(R.id.editText_usernameRegis);
        password    = (EditText) findViewById(R.id.editText_passwordRegis);
        li      = (ListView)findViewById(R.id.list);
        DatabaseHelper db = new DatabaseHelper(this);

        //untuk Kembali
        Button viewData = findViewById(R.id.bacK);
        viewData.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(List.this, MainActivity.class));
            }
        });
    }
}
