package com.example.shared_prefrences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button save, activityB;
    EditText etname, etpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = findViewById(R.id.savebtn);
        activityB = findViewById(R.id.bbtn);
        etname = findViewById(R.id.etone);
        etpass = findViewById(R.id.ettwo);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username", etname.getText().toString());
                editor.putString("pass", etpass.getText().toString());
                editor.commit();

            }
        });
        activityB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
startActivity(new Intent(MainActivity.this,Second.class));
            }
        });
    }
}
