package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var consumer1:Consumer=Consumer(1,"Ura",19)
    var consumer2:Consumer=Consumer(2,"Dima",21)
    var consumer3:Consumer=Consumer(3,"Oksana",20)
    var consumer4:Consumer=Consumer(4,"Dog",12)
    var consumerList:MutableList<Consumer> = mutableListOf(consumer1,consumer2,consumer3)
    var admin1:Admin= Admin(1,"George",consumerList)
    var admin2:Admin= Admin(2,"Cat",consumerList)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        admin2.consumerList.add(consumer4)
        findViewById<TextView>(R.id.text).text=admin1.ToStr()+admin2.ToStr()
    }
}