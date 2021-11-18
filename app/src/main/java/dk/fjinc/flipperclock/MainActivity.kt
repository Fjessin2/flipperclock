package dk.fjinc.flipperclock

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import dk.fjinc.flipperclocklibrary.CountDownClock
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()


        countdownClockSecond.setCountdownListener(object: CountDownClock.CountdownCallBack {
            override fun countdownAboutToFinish() {
                Log.d("here","Countdown second is about to finish")
            }

            override fun countdownFinished() {
                Log.d("here", "Countdown second finished")
                countdownClockSecond.startCountDown(4200000)
            }
        })

        countdownClockSecond.startCountDown(7000)



    }

    override fun onPause() {
        super.onPause()

        countdownClockSecond.resetCountdownTimer()
    }
}
