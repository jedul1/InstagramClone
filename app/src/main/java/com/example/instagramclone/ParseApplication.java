package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kNUEpNz92XHeRWTcOqWsAXWZiJw3auH5xYLy2JbA")
                .clientKey("Pts2ywwlooBUg4IoX2XosKWWdDUXIYzylgctrUYX")
                .server("https://parseapi.back4app.com")
                .build()
        );




    }
}
