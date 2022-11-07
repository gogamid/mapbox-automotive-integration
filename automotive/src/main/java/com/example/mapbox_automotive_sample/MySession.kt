package com.example.mapbox_automotive_sample

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session
import com.mapbox.maps.*

@OptIn(MapboxExperimental::class)
class MySession : Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        return MapScreen(carContext)
    }
}
