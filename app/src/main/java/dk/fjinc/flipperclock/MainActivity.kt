package dk.fjinc.flipperclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        countdownClockFirst.setCountdownListener(object: CountDownClock.CountdownCallBack {
            override fun countdownAboutToFinish() {
                Log.d("here","Countdown first is about to finish")
            }

            override fun countdownFinished() {
                Log.d("here", "Countdown first finished")
                countdownClockFirst.startCountDown(15000)
            }
        })

        countdownClockFirst.startCountDown(15000)

        countdownClockSecond.setCountdownListener(object: CountDownClock.CountdownCallBack {
            override fun countdownAboutToFinish() {
                Log.d("here","Countdown second is about to finish")
            }

            override fun countdownFinished() {
                Log.d("here", "Countdown second finished")
                countdownClockSecond.startCountDown(70000)
            }
        })

        countdownClockSecond.startCountDown(70000)

        countdownClockThird.setCountdownListener(object: CountDownClock.CountdownCallBack {
            override fun countdownAboutToFinish() {
                Log.d("here","Countdown third is about to finish")
            }

            override fun countdownFinished() {
                Log.d("here", "Countdown third finished")
                countdownClockThird.startCountDown(570000)
            }
        })

        countdownClockThird.startCountDown(570000)
    }

    override fun onPause() {
        super.onPause()

        countdownClockFirst.resetCountdownTimer()
        countdownClockSecond.resetCountdownTimer()
        countdownClockThird.resetCountdownTimer()
    }
}
