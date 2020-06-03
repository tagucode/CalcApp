package jp.techacademy.satoshi.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import android.util.Log

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var cast =  intent.getStringExtra("castAns").toDouble()
        var castAns = String.format("%.8f", cast)

        var regexEnd = Regex("""0+$""")
        val regexPeriod = Regex(".0+\$")

        castAns = regexEnd.replace(castAns, "")
        castAns = regexPeriod.replace(castAns, "")
        castAns = castAns.removeSuffix(".")

       messageText.text = castAns
    }
}
