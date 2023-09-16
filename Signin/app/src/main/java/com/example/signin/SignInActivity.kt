package com.example.signin

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import kotlin.math.sign

class SignInActivity : AppCompatActivity() {

    private lateinit var resultLauncher: ActivityResultLauncher<Intent>
    private lateinit var signId : EditText
    private lateinit var signPassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        signId = findViewById<EditText>(R.id.id)
        signPassword = findViewById<EditText>(R.id.password)
        val loginBtn = findViewById<Button>(R.id.loginButton)
        val upBtn = findViewById<Button>(R.id.upButton)

        resultNext()

        loginBtn.setOnClickListener {
                    if (signId.text.isEmpty() || signPassword.text.isEmpty()) {
                        Toast.makeText(this, "아이디/비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "로그인 성공!", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, HomeActivity::class.java)
                        val id = signId.text.toString()
                        intent.putExtra("ID", id)
                        startActivity(intent)

                    }

        }
        upBtn.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            resultLauncher.launch(intent)
        }
    }
    private fun resultNext() {
        resultLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {

                val editId = result.data?.getStringExtra("id")
                val editPassword = result.data?.getStringExtra("password")

                signId.text = Editable.Factory.getInstance().newEditable(editId)
                signPassword.text = Editable.Factory.getInstance().newEditable(editPassword)
            }
        }
    }

}