package com.example.bai4_nhom2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun Roller(view : View){

        var diceImage:ImageView = findViewById(R.id.diceImage)

        val numRandom = Dice(6).roll()

        var arr = arrayOf(R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)

        diceImage.setImageResource(arr[numRandom - 1])

        print(numRandom)

        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        toast.show()
    }

}
class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}