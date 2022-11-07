package com.example.mapbox_automotive_sample

import androidx.car.app.CarAppService
import androidx.car.app.validation.HostValidator

class MainCarService : CarAppService()  {
    override fun createHostValidator() = HostValidator.ALLOW_ALL_HOSTS_VALIDATOR

    override fun onCreateSession() = MySession()

}