package com.example.capstone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        Toast.makeText(getApplicationContext(), editID.getText(), Toast.LENGTH_SHORT).show();
        goList.putExtra("key", editID.getText());
        startActivity(goList);
    }
}
