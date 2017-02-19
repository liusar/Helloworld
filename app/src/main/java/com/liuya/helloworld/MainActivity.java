package com.liuya.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv_helloworld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        registListener();
    }

    private void initViews() {
        tv_helloworld = (TextView)findViewById(R.id.tv_helloworld);
    }

    private void registListener() {
        tv_helloworld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is my testdemo helloworld", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
