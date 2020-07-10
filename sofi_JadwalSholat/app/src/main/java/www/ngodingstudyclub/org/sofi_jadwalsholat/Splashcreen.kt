package www.ngodingstudyclub.org.sofi_jadwalsholat

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Splashcreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashcreen)

        val timerThread = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(3000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    val intent = Intent(this@Splashcreen, MainActivity::class.java)
                    startActivity(intent)

                    finish()
                }
            }
        }
        timerThread.start()
    }
}