package com.example.hellokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {
    int clickCount;
    TextView txtActivityStartTime, txtCountBtnClicks;
    Button btnClickMe;
    final long startTime = System.currentTimeMillis();
    TextView txtElapsedTime;
    long elapsedSeconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        txtActivityStartTime = findViewById(R.id.txtActivityStartime);
        txtCountBtnClicks = findViewById(R.id.txtCountBtnClicks);
        btnClickMe = findViewById(R.id.btnClickMe);

        txtElapsedTime = findViewById(R.id.txtElapsedTime);

        clickCount = 0;
        //startTime = System.currentTimeMillis();

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                txtCountBtnClicks.setText("Button clicks = " + clickCount);

                String sTimeStamp = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);

                elapsedSeconds = (System.currentTimeMillis() - startTime);
                txtElapsedTime.setText( elapsedSeconds/1000.0 + " seconds elapsed");
            }
        });
        String sTimeStamp = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);
        txtActivityStartTime.setText("Activity start time = " + sTimeStamp);
    }

}