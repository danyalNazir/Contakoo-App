package com.example.contakoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OpenWebsiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_website);

        Button buttonURL=(Button) findViewById(R.id.buttonURL);
        Button buttonBack=(Button) findViewById(R.id.buttonBackWebsite);
        EditText editTextWebsiteURL=(EditText)  findViewById(R.id.editTextWebsiteURL);

        buttonURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse(editTextWebsiteURL.getText().toString());
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OpenWebsiteActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}