package com.example.capstone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChannellistActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channellist);
        Intent intent=new Intent(this.getIntent());
        //값 받아오기
        //String s=intent.getExtras().getString("key");
        //로그찍기
        //Log.d("debug", s);

        //인텐트 테스트를 위해 임시로 버튼 추가
        Button btn=(Button)findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(ChannellistActivity.this,WaitingActivity.class);
                startActivity(intent1);
            }
        });
    }
}
