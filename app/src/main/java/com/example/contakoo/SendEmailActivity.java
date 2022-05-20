package com.example.contakoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class SendEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);

        Button buttonEmail=(Button) findViewById(R.id.buttonEmail);
        Button buttonBack=(Button) findViewById(R.id.buttonBackEmail);
        EditText editTextEmailAddress=(EditText)  findViewById(R.id.editTextEmailAddress);
        EditText editTextEmailSubject=(EditText) findViewById(R.id.editTextEmailSubject);

        buttonEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("mailto:");
                Intent intent = new Intent(Intent.ACTION_SEND,uri);
                intent.setData(uri);
                intent.setType("*/*");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{ editTextEmailAddress.getText().toString()});
                intent.putExtra(Intent.EXTRA_SUBJECT, editTextEmailSubject.getText().toString());
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SendEmailActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}