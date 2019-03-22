package com.example.capstone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ChannellistActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channellist);
        Intent intent=new Intent(this.getIntent());
        String s=intent.getExtras().getString("key");
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

    }
}
