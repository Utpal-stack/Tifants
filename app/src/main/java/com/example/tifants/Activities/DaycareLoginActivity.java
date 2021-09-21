package com.example.tifants.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tifants.Fragments.DaycareLoginFragment;
import com.example.tifants.Fragments.ParentLoginFragment;
import com.example.tifants.R;

public class DaycareLoginActivity extends AppCompatActivity {
    Button daycareTab;
    Button parentTab;
    androidx.fragment.app.Fragment fragment=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daycare_login);
        daycareTab=(Button)findViewById(R.id.DaycareTab);
        getSupportActionBar().hide();
        parentTab=(Button)findViewById(R.id.parentsTab);
        fragment=new DaycareLoginFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, fragment).commit();
        daycareTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DaycareLoginActivity.this, "Daycare Clicked", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(DaycareLoginActivity.this, "ParentTab Clicked", Toast.LENGTH_SHORT).show();
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