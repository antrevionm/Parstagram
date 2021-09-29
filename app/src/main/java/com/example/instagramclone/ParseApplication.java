package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("5SZABVFWf9Wmq8L9Fhpu2UHLWXTbc9K6puv21mOD")
                .clientKey("vOGQKsarfMoIPc6JS5SoHCSevoV6gAeRY88bo1TI")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

