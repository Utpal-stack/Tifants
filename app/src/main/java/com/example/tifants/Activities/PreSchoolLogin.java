package com.example.tifants.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tifants.Fragments.DaycareLoginFragment;
import com.example.tifants.Fragments.ParentLoginFragment;
import com.example.tifants.Fragments.PreSchoolParentLoginFragment;
import com.example.tifants.Fragments.PrincipleLoginFragment;
import com.example.tifants.R;

public class PreSchoolLogin extends AppCompatActivity {
    Button schoolTab;
    Button parentTab;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preschool_login);
        schoolTab=findViewById(R.id.pre_schoolTab);
        parentTab=findViewById(R.id.pre_parentsTab);
        fragment=new PrincipleLoginFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.preSchool_fragment, fragment).commit();
        schoolTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreSchoolLogin.this, "SchoolTab Clicked", Toast.LENGTH_SHORT).show();
                try {
                    fragment = new PrincipleLoginFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.preSchool_fragment, fragment).commit();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        parentTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PreSchoolLogin.this, "ParentTab Clicked", Toast.LENGTH_SHORT).show();
                try {
                    fragment = new PreSchoolParentLoginFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.preSchool_fragment, fragment).commit();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }
}