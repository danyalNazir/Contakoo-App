package com.example.contakoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button CallButton=(Button) findViewById(R.id.buttonMakeCall);
        Button MessageButton=(Button)  findViewById(R.id.buttonMessage);
        Button EmailButton=(Button)  findViewById(R.id.buttonEmail);
        Button WebsiteButton=(Button)  findViewById(R.id.buttonWebsite);

        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MakeCallActivity.class);

                startActivity(intent);
            }
        });

    }
}