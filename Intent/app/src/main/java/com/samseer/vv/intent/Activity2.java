package com.samseer.vv.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView textView;
    String key_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView=(TextView)findViewById(R.id.textV1);
        Intent txt=getIntent();

        key_msg=txt.getStringExtra("msg");
        textView.setText(key_msg);


    }
}
