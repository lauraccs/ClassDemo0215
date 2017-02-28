package com.example.lauraccs.laurademo0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityA extends AppCompatActivity {

    private ImageButton btA;
    private ImageButton btB;
    private ImageButton btC;
    private ImageButton btD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        initialView();
        initialListener();
    }

    private void initialView(){
        btA = (ImageButton) findViewById(R.id.btA);
        btB = (ImageButton) findViewById(R.id.btB);
        btC = (ImageButton) findViewById(R.id.btC);
        btD = (ImageButton) findViewById(R.id.btD);
    }

    private void initialListener() {
        btA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ActivityA.class);
                startActivity(intent);
            }
        });

        btB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ActivityB.class);
                startActivity(intent);
            }
        });

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ActivityC.class);
                startActivity(intent);
            }
        });

        btD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ActivityD.class);
                startActivity(intent);
            }
        });
    }



}
