    package com.example.signin

    import android.annotation.SuppressLint
    import android.app.Activity
    import android.content.Intent
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.Button
    import android.widget.EditText
    import android.widget.Toast
    import androidx.activity.result.contract.ActivityResultContracts

    class SignUp : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_sign_up)

            val name = findViewById<EditText>(R.id.name)
            val signUpId = findViewById<EditText>(R.id.textId)
            val signUpPassword = findViewById<EditText>(R.id.upPassword)

            val signUpBtn = findViewById<Button>(R.id.signUpButton)

            signUpBtn.setOnClickListener {
                if ( name.text.isEmpty() || signUpId.text.isEmpty() || signUpPassword.text.isEmpty()) {
                    Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
                } else {
                    intent.putExtra("id", signUpId.text.toString())
                    intent.putExtra("password", signUpPassword.text.toString())
                    setResult(RESULT_OK, intent)
                    finish()

                }
            }
        }
    }