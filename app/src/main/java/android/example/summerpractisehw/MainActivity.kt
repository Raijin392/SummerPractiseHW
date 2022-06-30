package android.example.summerpractisehw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameField : EditText
    private lateinit var growthField : EditText
    private lateinit var weightField : EditText
    private lateinit var ageField : EditText
    private lateinit var result : TextView
    private lateinit var button: Button

    private val exceptionError : String = "The data was entered incorrectly, please try again"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameField = findViewById(R.id.et_name)
        growthField = findViewById(R.id.et_growth)
        weightField = findViewById(R.id.et_weight)
        ageField = findViewById(R.id.et_age)
        result = findViewById(R.id.result)
        button = findViewById(R.id.button)

        button.setOnClickListener {

            if (nameField.text.toString() == "" || growthField.text.toString() == ""
                || weightField.text.toString() == "" || ageField.text.toString() == "") {

                result.text = exceptionError
            }
            else if (growthField.text.toString().toInt() <= 0 || growthField.text.toString().toInt() >= 250
                || weightField.text.toString().toDouble() <= 0 || weightField.text.toString().toDouble() >= 250
                || ageField.text.toString().toInt() <= 0 || ageField.text.toString().toInt() >= 150) {

                result.text = exceptionError
            } else {
                var runningSpeedResult : Double
                val valueOfName = nameField.text.toString().first().code
                val growth = growthField.text.toString().toInt()
                val weight = weightField.text.toString().toDouble()
                val age = ageField.text.toString().toInt()

                runningSpeedResult = (valueOfName / weight) * (growth / age)
                result.text = "Your running speed: $runningSpeedResult"
            }

        }

    }
}