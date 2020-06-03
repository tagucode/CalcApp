package jp.techacademy.satoshi.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import android.util.Log


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var valueLeft =  intent.getStringExtra("valueLeft", "0")
        var valueRight =  intent.getStringExtra("valueRight", "0.0")
        var cast =  intent.getIntExtra("cast", 0)

        var valueLeft = valueLeft.toBigDecimal()

        when(cast){
            1 -> messageText.text = "${valueLeft + valueRight}"
            2 -> messageText.text = "${valueLeft - valueRight}"
            3 -> messageText.text = "${valueLeft * valueRight}"
            4 -> messageText.text = "${valueLeft / valueRight}"
            else -> messageText.text = "再実行をお願いします。"
        }

        Log.d("debug2", "${valueRight}")
        Log.d("debug2", "${valueLeft}")
        Log.d("debug2", "${cast}")
        Log.d("debug2", "${valueLeft - valueRight}")
    }
}
