package com.adobe.marketing.mobile.reactnative.places;

import com.facebook.react.bridge.*

class AEPPlacesModule(reactContext: ReactApplicationContext): NativeAEPPlacesSpec(reactContext) {
    val placesImpl = AEPPlacesModule(reactContext)
    override fun getName(): String {
        return AEPPlacesImpl.NAME
    }

    override fun extensionVersion(promise: Promise) {
        placesImpl.extensionVersion(promise)
    }

    override fun getNearbyPointsOfInterest(locationMap: ReadableMap, limit: Int, promise: Promise) {
        placesImpl.getNearbyPointsOfInterest(locationMap, limit, promise)
    }

    override fun processGeofence(geofence: ReadableMap, transitionType: Int) {
        placesImpl.processGeofence(geofence, transitionType)
    }

    override fun getCurrentPointsOfInterest(promise: Promise) {
        placesImpl.getCurrentPointsOfInterest(promise)
    }

    override fun getLastKnownLocation(promise: Promise) {
        placesImpl.getLastKnownLocation(promise)
    }

    override fun clear() {
        placesImpl.clear()
    }

    override fun setAuthorizationStatus(authStatus: String) {
        placesImpl.setAuthorizationStatus(authStatus)
    }
}