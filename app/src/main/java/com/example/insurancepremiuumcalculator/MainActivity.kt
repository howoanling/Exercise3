package com.example.insurancepremiuumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calbtn = findViewById<Button>(R.id.buttonCalculate)
        calbtn.setOnClickListener{
            if(spinnerAge.selectedItem.toString().equals("Less than 17")){
                val totalPremium =  60
                textViewPremium.text = "Insurance Premium : RM " + totalPremium

            }else if(spinnerAge.selectedItem.toString().equals("17 to 25")){
                if(radioButtonMale.isChecked && checkBoxSmoker.isChecked){
                    val totalPremium =  70 + 50 + 100
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium

                }else if(radioButtonMale.isChecked){
                    val totalPremium =  70 + 50
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }else if (radioButtonFemale.isChecked && checkBoxSmoker.isChecked){
                    val totalPremium =  70 + 100
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }else if (radioButtonFemale.isChecked){
                    val totalPremium =  70
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }
            }else if(spinnerAge.selectedItem.toString().equals("26 to 30")){
                if(radioButtonMale.isChecked && checkBoxSmoker.isChecked){
                    val totalPremium =  90 + 100 + 150
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium

                }else if(radioButtonMale.isChecked){
                    val totalPremium =  90 + 100
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }else if (radioButtonFemale.isChecked && checkBoxSmoker.isChecked){
                    val totalPremium =  90 + 150
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }else if (radioButtonFemale.isChecked){
                    val totalPremium =  90
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }
            }else if(spinnerAge.selectedItem.toString().equals("31 to 40")){
                if(radioButtonMale.isChecked && checkBoxSmoker.isChecked){
                    val totalPremium =  120 + 150 + 200
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium

                }else if(radioButtonMale.isChecked){
                    val totalPremium =  120 + 150
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }else if (radioButtonFemale.isChecked && checkBoxSmoker.isChecked){
                    val totalPremium =  120 + 200
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }else if (radioButtonFemale.isChecked){
                    val totalPremium =  120
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }
            }else if(spinnerAge.selectedItem.toString().equals("41 to 55")){
                if(radioButtonMale.isChecked && checkBoxSmoker.isChecked){
                    val totalPremium =  150 + 200 + 250
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium

                }else if(radioButtonMale.isChecked){
                    val totalPremium =  150 + 200
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }else if (radioButtonFemale.isChecked && checkBoxSmoker.isChecked){
                    val totalPremium =  150 + 250
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }else if (radioButtonFemale.isChecked){
                    val totalPremium =  150
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }
            }else if(spinnerAge.selectedItem.toString().equals("More than 55")){
                if(radioButtonMale.isChecked && checkBoxSmoker.isChecked){
                    val totalPremium =  150 + 200 + 300
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium

                }else if(radioButtonMale.isChecked){
                    val totalPremium =  150 + 200
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }else if (radioButtonFemale.isChecked && checkBoxSmoker.isChecked){
                    val totalPremium =  150 + 300
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }else if (radioButtonFemale.isChecked){
                    val totalPremium =  150
                    textViewPremium.text = "Insurance Premium : RM " + totalPremium
                }
            }

        }

        val rstbtn = findViewById<Button>(R.id.buttonReset)
        rstbtn.setOnClickListener {
            spinnerAge.setSelection(0)
            radioButtonMale.isChecked = false
            radioButtonFemale.isChecked=false
            checkBoxSmoker.isChecked = false
            textViewPremium.text = "Insurance Premium :  "
        }


    }
}
