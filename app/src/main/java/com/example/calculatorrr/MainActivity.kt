package com.example.calculatorrr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var button2:Button
    lateinit var button3:Button
    lateinit var button4:Button
    lateinit var button5:Button
    lateinit var button6:Button
    lateinit var button7:Button
    lateinit var button8:Button
    lateinit var button9:Button
    lateinit var button0:Button

    lateinit var gamosaxuleba: TextView

    lateinit var gayofa:Button
    lateinit var gamravleba:Button
    lateinit var shekreba:Button
    lateinit var gamokleba:Button
    lateinit var clear:Button
    lateinit var gamotvla:Button



    var mimatebamimdinareobs=false
    var gamoklebamimdinareobs=false
    var gamravlebamimdinareobs=false
    var gayopamimdinareobs=false
    var number=0
    var number2=0
    var moqmedebamimdinareobs=false

    fun onClick(view: View){
        when(view){
            button1->{gamosaxuleba.text=gamosaxuleba.text.toString()+1}
            button2->{gamosaxuleba.text=gamosaxuleba.text.toString()+2}
            button3->{gamosaxuleba.text=gamosaxuleba.text.toString()+3}
            button4->{gamosaxuleba.text=gamosaxuleba.text.toString()+4}
            button5->{gamosaxuleba.text=gamosaxuleba.text.toString()+5}
            button6->{gamosaxuleba.text=gamosaxuleba.text.toString()+6}
            button7->{gamosaxuleba.text=gamosaxuleba.text.toString()+7}
            button8->{gamosaxuleba.text=gamosaxuleba.text.toString()+8}
            button9->{gamosaxuleba.text=gamosaxuleba.text.toString()+9}
            button0->{gamosaxuleba.text=gamosaxuleba.text.toString()+0}

            shekreba->{
                if (moqmedebamimdinareobs==false){
                    number=gamosaxuleba.text.toString().toInt()
                    mimatebamimdinareobs=true
                    gamosaxuleba.text=""
                    moqmedebamimdinareobs=true}
            }
            gamotvla->{
                if (mimatebamimdinareobs==true){
                    number2=gamosaxuleba.text.toString().toInt()
                    gamosaxuleba.text=(number+number2).toString()
                    mimatebamimdinareobs=false
                    moqmedebamimdinareobs=false
                }
                else if (gamoklebamimdinareobs==true){
                    number2=gamosaxuleba.text.toString().toInt()
                    gamosaxuleba.text=(number-number2).toString()
                    gamoklebamimdinareobs=false
                    moqmedebamimdinareobs=false
                }
                else if (gamravlebamimdinareobs==true){
                    number2=gamosaxuleba.text.toString().toInt()
                    gamosaxuleba.text=(number*number2).toString()
                    gamravlebamimdinareobs=false
                    moqmedebamimdinareobs=false
                }
                else if (gayopamimdinareobs==true){
                    number2=gamosaxuleba.text.toString().toInt()
                    gamosaxuleba.text=(number/number2).toString()
                    gayopamimdinareobs=false
                    moqmedebamimdinareobs=false
                }
            }
            gamokleba->{
                if (moqmedebamimdinareobs==false){
                    number=gamosaxuleba.text.toString().toInt()
                    gamoklebamimdinareobs=true
                    moqmedebamimdinareobs=true
                    gamosaxuleba.text=""}
            }
            gamravleba->{
                if (moqmedebamimdinareobs==false){
                    number=gamosaxuleba.text.toString().toInt()
                    gamravlebamimdinareobs=true
                    gamosaxuleba.text=""
                    moqmedebamimdinareobs=true}
            }
            gayofa->{
                if (moqmedebamimdinareobs==false){
                    number=gamosaxuleba.text.toString().toInt()
                    gayopamimdinareobs=true
                    gamosaxuleba.text=""
                    moqmedebamimdinareobs=true}
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById(R.id.button1)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
        button4=findViewById(R.id.button4)
        button5=findViewById(R.id.button5)
        button6=findViewById(R.id.button6)
        button7=findViewById(R.id.button7)
        button8=findViewById(R.id.button8)
        button9=findViewById(R.id.button9)
        button0=findViewById(R.id.button0)

        gayofa=findViewById(R.id.gayofabutton)
        gamravleba=findViewById(R.id.gamravlebabutton)
        shekreba=findViewById(R.id.mimatebabutton)
        gamokleba=findViewById(R.id.gamoklebabutton)
        clear=findViewById(R.id.washlabutton)
        gamotvla=findViewById(R.id.gamotvlabutton)


    }
}