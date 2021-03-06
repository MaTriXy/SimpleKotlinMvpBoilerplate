package com.marcinmoskala.simplekotlinmvpboilerplate.presentation.login

import com.marcinmoskala.simplekotlinmvpboilerplate.model.User
import com.marcinmoskala.simplekotlinmvpboilerplate.presentation.common.BaseView

interface LoginView: BaseView {
    var progressVisible: Boolean
    var email: String
    var password: String
    var emailErrorId: Int?
    var passwordErrorId: Int?
    var loginButtonClickedCallback: ()->Unit
    val emailRequestFocus: ()->Unit
    val passwordRequestFocus: ()->Unit
    fun pass(user: User)
}