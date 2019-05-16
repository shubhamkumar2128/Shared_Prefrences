package com.example.shared_prefrences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Second extends AppCompatActivity {

    Button load, prev;
    EditText etname, etpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        load = findViewById(R.id.loadbtn);
        prev = findViewById(R.id.prevbtn);
        etname = findViewById(R.id.etonee);
        etpass = findViewById(R.id.ettwoo);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
                String name = sharedPreferences.getString("username", "");
                String pass = sharedPreferences.getString("pass", "");
                etname.setText(name);
                etpass.setText(pass);

            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Second.this, MainActivity.class));
            }
        });
    }
}
