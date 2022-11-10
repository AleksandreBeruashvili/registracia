package com.example.shualeduriss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name=findViewById<EditText>(R.id.editTextTextPersonName3)
        val surname=findViewById<EditText>(R.id.editTextTextPersonName4)
        val mail=findViewById<EditText>(R.id.editTextTextEmailAddress3)
        val ID=findViewById<EditText>(R.id.editTextTextPassword3)
        val pas1=findViewById<EditText>(R.id.editTextTextPassword4)
        val pas2=findViewById<EditText>(R.id.editTextTextPassword5)
        val check=findViewById<CheckBox>(R.id.checkBox)
        val Button=findViewById<Button>(R.id.button)

        Button .setOnClickListener{
          val rname=name.text.toString()
          val rsurname=surname.text.toString()
          val rmail=mail.text.toString()
          val rID=ID.text.toString()
          val rpas1=pas1.text.toString()
          val rpas2=pas2.text.toString()

            if (rname=="" || rsurname=="" || rmail=="" || rpas1=="" || rpas2=="" || rID==""){
            Toast.makeText(applicationContext,"გრაფა ცარიელია",Toast.LENGTH_LONG).show()
        }else if("@gmail.com" !in rmail || rmail=="@gmail.com") {
            Toast.makeText(applicationContext, "მეილი არასწორია", Toast.LENGTH_LONG).show()
        }else if(pas1.length()< 8 ) {
            Toast.makeText(applicationContext,"პარპლი არასწორიაა",Toast.LENGTH_LONG).show()
        }else if(rpas1!=rpas2){
            Toast.makeText(applicationContext,"გამეორებული პაროლი არასწორია",Toast.LENGTH_LONG).show()
        }else if(ID.length()!=11){
            Toast.makeText(applicationContext,"აიდი არასწორია ",Toast.LENGTH_LONG).show()
        }else if(name.length()<3) {
            Toast.makeText(applicationContext, "სახელი არასწორია", Toast.LENGTH_LONG).show()
        }else if(surname.length()<5) {
            Toast.makeText(applicationContext, "გვარი არასწორია", Toast.LENGTH_LONG).show()
        }else if(!check.isChecked) {
            Toast.makeText(applicationContext, "ყუთი არაა მონიშნული", Toast.LENGTH_LONG).show()
        } else{
            Toast.makeText(applicationContext, "თქვენ დარეგისტრირდით", Toast.LENGTH_LONG).show()
        }
        }
    }
}