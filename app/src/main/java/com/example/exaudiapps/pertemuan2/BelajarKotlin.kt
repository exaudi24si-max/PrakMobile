package com.example.exaudiapps.pertemuan2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.exaudiapps.R

class BelajarKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // --- HUBUNGKAN KE XML BARU ---
        setContentView(R.layout.activity_belajar_kotlin)
        
        // Kode logika Anda (hasilnya lihat di Logcat)
        Log.d("PrakMobile", "=== HASIL BELAJAR KOTLIN ===")
        val angka = 15
        Log.d("PrakMobile", "hasil dari 15 + 10 = ${angka + 10}")

        val nilai = 10
        if (nilai % 2 == 0) Log.d("PrakMobile", "Bilangan Genap")
        else Log.d("PrakMobile", "Bilangan Ganjil")

        val kampusKu: Array<String> = arrayOf("Kampus", "Politeknik", "Caltex", "Riau")
        for (kampus in kampusKu) {
            Log.d("PrakMobile", "Daftar Kampus: $kampus")
        }
        Log.d("PrakMobile", "============================")
    }
}
