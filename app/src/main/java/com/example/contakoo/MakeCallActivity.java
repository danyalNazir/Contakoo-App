package com.example.contakoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MakeCallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_call);

        Button buttonCall=(Button)  findViewById(R.id.ButtonCall);
<<<<<<< HEAD
        Button buttonBack=(Button) findViewById(R.id.ButtonBackCall);
=======
        Button buttonBack=(Button) findViewById(R.id.ButtonBack);
>>>>>>> e77077e1a711dcd7b6b08e3a80caf17c124119a3
        EditText editTextCall=(EditText) findViewById(R.id.editTextPhone);


        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:" + editTextCall.getText().toString());
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MakeCallActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}