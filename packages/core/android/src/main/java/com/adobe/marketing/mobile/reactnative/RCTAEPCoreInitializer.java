package com.adobe.marketing.mobile.reactnative;

import com.adobe.marketing.mobile.MobileCore;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.startup.Initializer;

import java.util.Collections;
import java.util.List;

public class RCTAEPCoreInitializer implements Initializer<Void> {
    private static final String TAG = "RCTAEPCoreInitializer";

    @NonNull
    @Override
    public Void create(@NonNull Context context) {
        Log.d(TAG, "Initializing Mobile Core SDK via Android Startup Library");
        Application application = (Application) context.getApplicationContext();
        
        MobileCore.setApplication(application);
        return null;
    }

    @NonNull
    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }
}
