package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;

//회의대기 화면
public class WaitingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting);
        //이전 액티비티 종료
        MakeChannelActivity makeChannelActivity = (MakeChannelActivity)MakeChannelActivity.createChannelActivity;
        makeChannelActivity.finish();


        //Button btn=(Button)findViewById(R.id.button2);

        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WaitingActivity.this,ConferenceActivity.class);
                startActivity(intent);
            }
        });*/
    }
}
