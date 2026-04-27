package com.example.exaudiapps

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exaudiapps.databinding.ActivityFourthBinding
import com.example.exaudiapps.databinding.ActivityMainBinding
import com.example.exaudiapps.databinding.ActivityThirdBinding
import com.example.exaudiapps.pertemuan2.SecondActivity
import com.example.exaudiapps.pertemuan3.ThidActivity
import com.example.exaudiapps.pertemuan4.FourthActivity
import com.example.exaudiapps.pertemuan5.FifthActivity
import com.example.exaudiapps.pertemuan6.AuthActivity
import com.example.exaudiapps.pertemuan7.SevenActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPref = getSharedPreferences("user_pref", MODE_PRIVATE)

        binding.btnP2.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        binding.btnP3.setOnClickListener {
            startActivity(Intent(this, ThidActivity::class.java))
        }
        binding.btnP4.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("name", "Politeknik Caltex Riau")
            intent.putExtra("from", "Rumbai")
            intent.putExtra("age", 25)
            startActivity(intent)
        }
        binding.btnP5.setOnClickListener {
            startActivity(Intent(this, FifthActivity::class.java))
        }
        binding.btnP6.setOnClickListener {
            startActivity(Intent(this, AuthActivity::class.java))
        }
        binding.btnP7.setOnClickListener {
            startActivity(Intent(this, SevenActivity::class.java))
        }
        binding.bntLogout.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle("Konfirmasi")
                .setMessage("Apakah Anda yakin ingin melanjutkan?")
                .setPositiveButton("Ya") { dialog, _ ->
                    sharedPref.edit() {
                        clear()
                        apply()
                    }
                    finish()
                    dialog.dismiss()
                    Log.e("Info Dialog", "Anda memilih Ya!")

                }
                .show()
        }
    }
}