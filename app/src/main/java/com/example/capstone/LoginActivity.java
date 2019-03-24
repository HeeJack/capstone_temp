package com.example.capstone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText editID, editPW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editID = (EditText)findViewById(R.id.edit_id);
        editPW = (EditText)findViewById(R.id.edit_pw);

    }
    public void LoginClick(View v)
    {
        Intent goList = new Intent(LoginActivity.this, ChannellistActivity.class);
        //값보내기
        //       goList.putExtra("key", editID.getText().toString());
        startActivity(goList);
    }
    public void JoinusClick(View v)
    {
        Intent goJoin = new Intent(LoginActivity.this, JoinActivity.class);
        //값보내기
        //       goList.putExtra("key", editID.getText().toString());
        startActivity(goJoin);
    }
}
