package com.example.tugas1;

public class Model {
    String nama, alamat , username, password;

    public String getNama() {return nama; }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Model(String nama, String alamat, String username, String Password) {
        this.nama = nama;
        this.alamat = alamat;
        this.username = username;
        this.password = password;

    }
}
