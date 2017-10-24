package mg.etech.mobile.etechappkotlin

import io.reactivex.Observable

/**
 * Created by mahery.haja on 23/10/2017.
 */
interface TestSA {
    fun getName():String
    fun getTextObservable(): Observable<String>
}