package mg.etech.mobile.etechappkotlin

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import java.util.concurrent.TimeUnit

/**
 * Created by mahery.haja on 23/10/2017.
 */
object TestSAImpl: TestSA {

    val textPublish = PublishSubject.create<String>()

    init {
        Observable
                .interval(1000, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe{
                    textPublish.onNext("this is so great too")
                }
    }

    override fun getName() = "This is great"

    override fun getTextObservable():Observable<String> {
        return textPublish
    }
}