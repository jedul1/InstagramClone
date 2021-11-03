package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;

public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kNUEpNz92XHeRWTcOqWsAXWZiJw3auH5xYLy2JbA")
                .clientKey("Pts2ywwlooBUg4IoX2XosKWWdDUXIYzylgctrUYX")
                .server("https://parseapi.back4app.com")
                .build()
        );




    }
}
