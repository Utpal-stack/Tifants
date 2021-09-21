package com.example.tifants.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tifants.R;

public class chooseLogin extends AppCompatActivity {
    Button daycareBtn;
    Button preschoolBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_login);

        getSupportActionBar().hide();
        daycareBtn=findViewById(R.id.daycare_btn);
        preschoolBtn=findViewById(R.id.prescoolbtn);
        daycareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseLogin.this,DaycareLoginActivity.class));
            }
        });
        preschoolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooseLogin.this,PreSchoolLogin.class));
            }
        });
    }
}