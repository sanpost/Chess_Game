package chessgame.com

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    // do logowania wstepnego
    private val validEmail = "test"
    private val validPassword = "test"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText: EditText = findViewById(R.id.editTextTextEmailAddress)
        val passwordEditText: EditText = findViewById(R.id.editTextTextPassword)
        val loginButton: Button = findViewById(R.id.button2)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email == validEmail && password == validPassword) {
                val intent = Intent(this@MainActivity, UserJoin::class.java)
                startActivity(intent)
                finish()
            } else {
                // Błędne logowanie - wyświetlenie komunikatu Toast
                Toast.makeText(this, "Błędne dane logowania", Toast.LENGTH_SHORT).show()
            }
        }

    }
}