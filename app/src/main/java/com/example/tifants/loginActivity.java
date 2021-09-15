package com.example.tifants;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    Button daycareTab;
    Button parentTab;
    androidx.fragment.app.Fragment fragment=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        daycareTab=(Button)findViewById(R.id.DaycareTab);
        getSupportActionBar().hide();
        parentTab=(Button)findViewById(R.id.parentsTab);
        fragment=new DaycareLoginFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, fragment).commit();
        daycareTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(loginActivity.this, "Daycare Clicked", Toast.LENGTH_SHORT).show();
                try {
                    fragment = new DaycareLoginFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment, fragment).commit();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        parentTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(loginActivity.this, "ParentTab Clicked", Toast.LENGTH_SHORT).show();
                try {
                    fragment = new ParentLoginFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment, fragment).commit();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public void loadFragment(Fragment fragment){

    }


}