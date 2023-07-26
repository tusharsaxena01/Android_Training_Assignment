package com.example.assignments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Assignment4_main extends AppCompatActivity {

    Button btn_message,btn_playStore,btn_googleMap,btn_shareApp,btn_gmail,btn_music,btn_web,btn_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment4_main);

        btn_call = findViewById(R.id.btn_call);
        btn_web = findViewById(R.id.btn_web);
        btn_music = findViewById(R.id.btn_music);
        btn_gmail = findViewById(R.id.btn_gmail);
        btn_shareApp = findViewById(R.id.btn_shareApp);
        btn_googleMap = findViewById(R.id.btn_googleMap);
        btn_playStore = findViewById(R.id.btn_playStore);
        btn_message = findViewById(R.id.btn_message);

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel: 123"));
                startActivity(callIntent);
            }
        });

        btn_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://google.com"));
                startActivity(i);
            }
        });

        btn_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spotifyIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("spotify:playlist:7CpuEnbCLIXwI6LEcbBOYP?si=KuQC9t0AR_OhcQIN3iCMaw"));
                startActivity(spotifyIntent);
            }
        });

        btn_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, "bit21csl07@bit.ac.in");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Test");
                intent.putExtra(Intent.EXTRA_TEXT, "This is a sample email");
                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });

        btn_shareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });

        btn_googleMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?saddr=20.344,34.34&daddr=20.5666,45.345"));
                startActivity(intent);
            }
        });

        btn_playStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("market://details?id=com.spotify.music"));
                startActivity(i);
            }
        });

        btn_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                smsIntent.addCategory(Intent.CATEGORY_DEFAULT);
                smsIntent.setType("vnd.android-dir/mms-sms");
                smsIntent.setData(Uri.parse("sms:" + "7007459349"));
                smsIntent.putExtra("sms_body", "Good Morning ! How are you ?");
                startActivity(smsIntent);
            }
        });


    }
}