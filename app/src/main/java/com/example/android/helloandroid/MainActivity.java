package com.example.android.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //make status bar transparent
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            w.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }

        setContentView(R.layout.activity_main);
    }

    // Open map at the company's geolocation
    public void openMap(View view) {
        Intent mapIntent = new Intent(Intent.ACTION_VIEW);
        mapIntent.setData(Uri.parse("geo:0,0?q=" + getString(R.string.company_lat) + "," + getString(R.string.company_long) + "(" + getString(R.string.company_name) + ")"));
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

    // Open dialer with the company's phone no
    public void openDialer(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + getString(R.string.company_telephone)));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Open the company's website in the browser
    public void openBrowser(View view) {
        Uri webpage = Uri.parse("http://" + getString(R.string.company_web));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Open the mail app with the company's e-mail address as a recipient
    public void openMail(View view) {
        Intent mailIntent = new Intent(Intent.ACTION_SENDTO);
        mailIntent.setData(Uri.parse("mailto:" + getString(R.string.company_email))); // only email apps should handle this
        if (mailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mailIntent);
        }
    }

    // Open the company's Facebook page in the browser
    public void openFacebook(View view) {
        Uri webpage = Uri.parse(getString(R.string.company_facebook));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Open the company's Twitter page in the browser
    public void openTwitter(View view) {
        Uri webpage = Uri.parse(getString(R.string.company_twitter));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Open the company's LinkedIn page in the browser
    public void openLinkedIn(View view) {
        Uri webpage = Uri.parse(getString(R.string.company_linkedin));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Open the company's Instagram page in the browser
    public void openInstagram(View view) {
        Uri webpage = Uri.parse(getString(R.string.company_instagram));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    // Open the company's Google+ page in the browser
    public void openGoogle(View view) {
        Uri webpage = Uri.parse(getString(R.string.company_google));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
