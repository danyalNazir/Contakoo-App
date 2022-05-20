package com.example.contakoo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        Button buttonMessage=(Button)  findViewById(R.id.buttonMessage);
        Button buttonBack=(Button) findViewById(R.id.buttonBackMessage);
        EditText editTextMessage=(EditText) findViewById(R.id.editTextMessage);


        buttonMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("smsto:" + editTextMessage.getText().toString());
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                startActivity(intent);
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SendMessageActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}