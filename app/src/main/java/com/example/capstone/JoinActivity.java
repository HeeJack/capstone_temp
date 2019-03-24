package com.example.capstone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class JoinActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        Intent intent=new Intent(this.getIntent());
        //값 받아오기
        //String s=intent.getExtras().getString("key");
        //로그찍기
        //Log.d("debug", s);

    }
}
