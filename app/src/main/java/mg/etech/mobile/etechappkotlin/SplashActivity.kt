package mg.etech.mobile.etechappkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(){

    val nom: String = "entier"
    val testSA: TestSA = TestSAImpl
    private var disposable: CompositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        txtSplashHello.text = "Bonjour le monde $nom"

        btnSplashEssai.setOnClickListener{
            txtSplashHello.text = txtSplashHello.text.toString() + testSA.getName()
        }

    }

    override fun onPostResume() {
        super.onPostResume()
        testSA
                .getTextObservable()
                .subscribe {
                    txtSplashHello.text = txtSplashHello.text.toString() + testSA.getName()
                }
                .let { disposable.add(it) }
        Log.d("mahery-haja", "On resume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("mahery-haja", "Before pause called ${disposable.size()} ")

        disposable?.clear()
        Log.d("mahery-haja", "On pause called ${disposable.size()} ")
    }
}

