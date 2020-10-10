package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class singleinstance extends AppCompatActivity {
    static  String num="Singleinstance";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleinstance);
        Log.d("singleinstance","Task id is"+getTaskId());

        Button button2=(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(singleinstance.this,singleTask.class);

                startActivity(intent);
            }
        });
    }
}