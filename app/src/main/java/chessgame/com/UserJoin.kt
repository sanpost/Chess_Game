package chessgame.com

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UserJoin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.join_user)

        val watchButton = findViewById<Button>(R.id.watchButton)
        val joinButton = findViewById<Button>(R.id.joinButton)

        joinButton.setOnClickListener {
            val intent = Intent(this, UserJoin::class.java)
            startActivity(intent)
        }

        watchButton.setOnClickListener {
            val intent = Intent(this, UserWatch::class.java)
            startActivity(intent)
        }
    }


    }

