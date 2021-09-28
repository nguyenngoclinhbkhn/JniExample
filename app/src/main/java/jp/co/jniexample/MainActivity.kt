package jp.co.jniexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    init {
        System.loadLibrary("keys")
    }

    external fun getStringHello(): String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnJni)?.setOnClickListener {
            findViewById<TextView>(R.id.txtJni)?.text = getStringHello()
        }
    }
}