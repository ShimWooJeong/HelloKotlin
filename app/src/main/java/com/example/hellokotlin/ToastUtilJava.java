package com.example.hellokotlin;

import android.widget.Toast;

public class ToastUtilJava {
    // FlowControlJavaActivity onObject = new ... ()
    // onObject.toast_short(message);

    public static void toast_short(String s) {
        //MainApplication aObj = new MainApplication();
        Toast.makeText(MainApplication.get_appContext(), s, Toast.LENGTH_SHORT).show();
    }

    public static void toast_long(String s) {
        Toast.makeText(MainApplication.get_appContext(), s, Toast.LENGTH_LONG).show();
    }
}
