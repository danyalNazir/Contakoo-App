package com.example.contakoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button CallButton=(Button) findViewById(R.id.buttonMakeCall);
        Button MessageButton=(Button)  findViewById(R.id.buttonSendMessage);
        Button EmailButton=(Button)  findViewById(R.id.buttonSendEmail);
        Button WebsiteButton=(Button)  findViewById(R.id.buttonWebsite);
        TextView textView=(TextView) findViewById(R.id.mainText);

        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MakeCallActivity.class);
                startActivity(intent);
            }
        });
        MessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SendMessageActivity.class);
                startActivity(intent);
            }
        });
        EmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SendEmailActivity.class);
                startActivity(intent);
            }
        });
        WebsiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,OpenWebsiteActivity.class);
                startActivity(intent);
            }
        });
    }
}