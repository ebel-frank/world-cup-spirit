package com.spiritofcup.aapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.spiritofcup.aapp.databinding.ActivityMainBinding
import com.spiritofcup.aapp.databinding.ActivitySplashBinding
import kotlin.math.roundToInt

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val timer = object : CountDownTimer(10000, 1) {
            override fun onTick(p0: Long) {
                val progress = 100 - (p0 / 100.0).roundToInt()
                binding.progressLevel.text = "$progress%"
                binding.progressBar.setProgress(progress, true)
            }

            override fun onFinish() {
                binding.progressLevel.text = "100%"
                binding.progressBar.progress = 100
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }

        }
        timer.start()

    }
}