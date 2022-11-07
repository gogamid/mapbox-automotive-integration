package com.example.mapbox_automotive_sample

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.navigation.model.PlaceListNavigationTemplate
import com.mapbox.maps.MapInitOptions
import com.mapbox.maps.MapboxExperimental
import com.mapbox.maps.extension.androidauto.MapboxCarMap


class MapScreen(carContext: CarContext) : Screen(carContext) {
    private val mapInitOptions = MapInitOptions(
        context = carContext
    )

    @OptIn(MapboxExperimental::class)
    private val mapboxCarMap = MapboxCarMap().setup(carContext, mapInitOptions)


    override fun onGetTemplate() =
        PlaceListNavigationTemplate.Builder().setTitle("Test").setLoading(true).build()
}
