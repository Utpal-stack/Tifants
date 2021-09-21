package com.example.tifants.Activities;

import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;
import com.codemybrainsout.onboarder.AhoyOnboarderCard;
import com.example.tifants.R;

import java.util.ArrayList;
import java.util.List;

public class OnboardActivity extends AhoyOnboarderActivity {
    private int iconWidth=100;
    private int iconHeight=100;
    private int marginTop=30;
    private int marginLeft=30;
    private int marginRight=30;
    private int marginBottom=30;
    List<AhoyOnboarderCard> cardList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AhoyOnboarderCard ahoyOnboarderCard1 = new AhoyOnboarderCard("Platform", "All-in-one integrated system.", R.drawable.platform);
        AhoyOnboarderCard ahoyOnboarderCard2 = new AhoyOnboarderCard("Attendance", "Stay connected with teachers", R.drawable.attendance);
        AhoyOnboarderCard ahoyOnboarderCard3 = new AhoyOnboarderCard("Billing", "Go paperless with Billing", R.drawable.bill);

        ahoyOnboarderCard1.setBackgroundColor(R.color.black_transparent);
        ahoyOnboarderCard2.setBackgroundColor(R.color.black_transparent);
        ahoyOnboarderCard3.setBackgroundColor(R.color.black_transparent);

        List<AhoyOnboarderCard> pages = new ArrayList<>();

        pages.add(ahoyOnboarderCard1);
        pages.add(ahoyOnboarderCard2);
        pages.add(ahoyOnboarderCard3);

        for (AhoyOnboarderCard page : pages) {
            page.setTitleColor(R.color.white);
            page.setDescriptionColor(R.color.grey_200);
            //page.setTitleTextSize(dpToPixels(12, this));
            //page.setDescriptionTextSize(dpToPixels(8, this));
            //page.setIconLayoutParams(width, height, marginTop, marginLeft, marginRight, marginBottom);
        }

        setFinishButtonTitle("Get Started");
        showNavigationControls(true);
        setGradientBackground();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            setFinishButtonDrawableStyle(ContextCompat.getDrawable(this, R.drawable.rounded_button));
        }

        setOnboardPages(pages);
    }

    @Override
    public void onFinishButtonPressed() {
        Intent intent=new Intent(OnboardActivity.this, chooseLogin.class);
        startActivity(intent);
        finish();
    }
}