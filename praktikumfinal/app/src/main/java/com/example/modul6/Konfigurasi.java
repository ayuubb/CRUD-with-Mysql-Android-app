package com.example.modul6;

    class Konfigurasi {
        //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
        static final String URL_ADD = "http://192.168.43.200/android/insert.php";
        static final String URL_GET_ALL = "http://192.168.43.200/android/read.php";
        static final String URL_GET_MHS = "http://192.168.43.200/android/select.php?id=";
        static final String URL_UPDATE_MHS = "http://192.168.43.200/android/update.php";
        static final String URL_DELETE_MHS = "http://192.168.43.200/android/delete.php?id=";
        //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Script PHP
        static final String KEY_MHS_ID = "id";
        static final String KEY_MHS_NAMA = "nama";
        static final String KEY_MHS_JURUSAN = "jurusan";
        static final String KEY_MHS_EMAIL = "email";
        //JSON Tags
        static final String TAG_JSON_ARRAY = "result";
        static final String TAG_ID = "id";
        static final String TAG_NAMA = "nama";
        static final String TAG_JURUSAN = "jurusan";
        static final String TAG_EMAIL = "email";
        //ID Mahasiswa
//mhs itu singkatan dari Mahasiswa
        static final String MHS_ID = "mhs_id";
    }