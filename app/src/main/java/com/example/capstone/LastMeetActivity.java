package com.example.capstone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LastMeetActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_meet);
        Intent intent=new Intent(this.getIntent());
        //값 받아오기
        //String s=intent.getExtras().getString("key");
        //로그찍기
        //Log.d("debug", s);

    }
}