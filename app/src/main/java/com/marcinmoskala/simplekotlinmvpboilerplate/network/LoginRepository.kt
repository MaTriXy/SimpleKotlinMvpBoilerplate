package com.marcinmoskala.simplekotlinmvpboilerplate.network

import com.marcinmoskala.simplekotlinmvpboilerplate.network.LoginResponse
import io.reactivex.Observable

interface LoginRepository {

    fun attemptLogin(email: String, pass: String): Observable<LoginResponse>

    class MockLoginRepository : LoginRepository {
        override fun attemptLogin(email: String, pass: String): Observable<LoginResponse> = when {
            email.endsWith(".pl") -> throw Error("Invalid Email")
            else -> Observable.just(LoginResponse("TokenToken"))
        }
    }

    companion object {
        fun lazyGet(): Lazy<LoginRepository> = lazy { MockLoginRepository() }
    }
}