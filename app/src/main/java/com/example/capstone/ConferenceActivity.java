package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//회의화면
public class ConferenceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conference);
        //이전 액티비티 종료
        WaitingActivity waitingActivity = (WaitingActivity)WaitingActivity.activity;
        waitingActivity.finish();

        /*

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ConferenceActivity.this,CloseActivity.class);
                startActivity(intent);
            }
        });*/
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
