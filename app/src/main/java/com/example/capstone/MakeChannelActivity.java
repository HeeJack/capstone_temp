package com.example.capstone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MakeChannelActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_channel);
        Button btnMakeChannel=(Button)findViewById(R.id.btnMakeChannel);
        Intent intent=new Intent(this.getIntent());
        //값 받아오기
        //String s=intent.getExtras().getString("key");
        //로그찍기
        //Log.d("debug", s);
        Intent waitingIntent=new Intent(MakeChannelActivity.this,WaitingActivity.class);
        startActivity(waitingIntent);
    }
}
