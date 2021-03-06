package com.syahputrareno975.ayolesapp.ui.activity.register

import com.syahputrareno975.ayolesapp.model.queryModel.Query
import com.syahputrareno975.ayolesapp.model.student.RegisterRequest
import com.syahputrareno975.ayolesapp.model.student.RegisterResponse
import com.syahputrareno975.ayolesapp.service.RetrofitService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class RegisterActivityPresenter: RegisterActivityContract.Presenter {

    private val subscriptions = CompositeDisposable()
    private val api : RetrofitService = RetrofitService.create()
    private lateinit var view: RegisterActivityContract.View

    override fun register(r: RegisterRequest) {
        view.showProgress(true)
        val subscribe = api.register(Query(r.toSchema()))
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({result : RegisterResponse? ->
                view.showProgress(false)
                if (result != null){
                    if (result.Errors.isNotEmpty()){
                        var message = ""
                        for (i in result.Errors){
                            message += i.Message
                        }
                        view.showError(message)
                    }
                    view.onRegister(result)
                }
            },{t : Throwable ->
                view.showProgress(false)
                view.showError(t.message!!)
            })

        subscriptions.add(subscribe)
    }

    override fun subscribe() {}

    override fun unsubscribe() {
        subscriptions.clear()
    }

    override fun attach(view: RegisterActivityContract.View) {
        this.view = view
    }
}