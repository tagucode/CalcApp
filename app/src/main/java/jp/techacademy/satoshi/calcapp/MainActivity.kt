package jp.techacademy.satoshi.calcapp

import android.support.v7.app.AppCompatActivity
import android.support.design.widget.Snackbar
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
        if(leftText.getText().toString().equals("") == false && rightText.getText().toString().equals("") == false){
        val intent = Intent(this, SecondActivity::class.java)
        var valueLeft = leftText.getText().toString().toDouble()
        var valueRight = rightText.getText().toString().toDouble()
        var cast: Double = 0.0

        if((v.id) == R.id.plusButton) {
            cast = valueLeft + valueRight
        } else if((v.id) == R.id.minusButton) {
            cast = valueLeft - valueRight
        } else if((v.id) == R.id.timesButton) {
            cast = valueLeft * valueRight
        } else if((v.id) == R.id.divisionButton) {
            cast = valueLeft / valueRight
        }

        Log.d("debug",valueLeft.toString())
        Log.d("debug",valueLeft.toString())
        val castAns = cast.toString()

        intent.putExtra("castAns", castAns)
        startActivity(intent)

        } else {
            Snackbar.make(v,"両方の入力欄に計算したい値を入力してください。", Snackbar.LENGTH_LONG).show()
        }

    }
}
