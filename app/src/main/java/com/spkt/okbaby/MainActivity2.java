package com.spkt.okbaby;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    View view3, view4, view5, view6, view7, view8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        anhXa();

        view3.post(new Runnable()
        {
            @Override
            public void run()
            {
                ViewGroup.LayoutParams params = view3.getLayoutParams();
                params.height = view3.getWidth();

                view3.setLayoutParams(params);
                view4.setLayoutParams(params);
                view5.setLayoutParams(params);
                view6.setLayoutParams(params);
                view7.setLayoutParams(params);
                view8.setLayoutParams(params);
            }
        });
    }

    private void anhXa() {
        view3 = (View) findViewById(R.id.view3);
        view4 = (View) findViewById(R.id.view4);
        view5 = (View) findViewById(R.id.view5);
        view6 = (View) findViewById(R.id.view6);
        view7 = (View) findViewById(R.id.view7);
        view8 = (View) findViewById(R.id.view8);
    }
}