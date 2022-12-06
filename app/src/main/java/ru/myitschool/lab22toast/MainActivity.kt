package ru.myitschool.lab22toast

import android.content.res.Configuration
import android.graphics.drawable.GradientDrawable.Orientation
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        showMessage(getString(R.string.ncreate))
    }
    override fun onStart() {
        super.onStart()
        showMessage(getString(R.string.nstart))
    }

    override fun onResume() {
        super.onResume()
        showMessage(getString(R.string.nresume))
    }



    override fun onDestroy() {
        super.onDestroy()
        if (resources.configuration.orientation != Configuration.ORIENTATION_LANDSCAPE) return
        showMessage(getString(R.string.ndestroy))
    }


    private fun showMessage(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show()
    }
}