package com.example.capstone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class LastMeetActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_meet);
        Intent intent=new Intent(this.getIntent());

        Button btnChannelList=(Button)findViewById(R.id.button6);
        btnChannelList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ChannelListIntent=new Intent(LastMeetActivity.this,ChannelListActivity.class);
                startActivity(ChannelListIntent);
            }
        });

        //지난 회의록 리스트
        ListView listView=(ListView)findViewById(R.id.last_note_list);
        ListViewAdapter adapter=new ListViewAdapter();
        listView.setAdapter(adapter);
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.main), ContextCompat.getDrawable(this, R.drawable.green),
                "노터 마케팅 1팀", 6,"최유진 조영태 등등");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                note(view);
            }
        });
        //값 받아오기
        //String s=intent.getExtras().getString("key");
        //로그찍기
        //Log.d("debug", s);

    }

    public void note(View view){
        Intent goNote=new Intent(LastMeetActivity.this,NoteActivity.class);
        startActivity(goNote);
    }
}