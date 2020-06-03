package jp.techacademy.satoshi.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.setOnClickListener(this)
        minusButton.setOnClickListener(this)
        timesButton.setOnClickListener(this)
        divisionButton.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        var cast =
            when {
                (v.id) == R.id.plusButton -> 1
                (v.id) == R.id.minusButton -> 2
                (v.id) == R.id.timesButton -> 3
                (v.id) == R.id.divisionButton -> 4
                else -> 5
        }
        var valueRight = rightText.getText().toString().toBigDecimal()
        var valueLeft = leftText.getText().toString().toBigDecimal()

        intent.putExtra("cast", cast)
        intent.putExtra("valueRight", valueRight)
        intent.putExtra("valueLeft", valueLeft)

        Log.d("debug1","${valueRight}")
        Log.d("debug1","${valueLeft}")
        Log.d("debug1","${cast}")
        startActivity(intent)

    }
}
