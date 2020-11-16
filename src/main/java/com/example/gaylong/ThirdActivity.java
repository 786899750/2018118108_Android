package com.example.gaylong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        Button button3=(Button)findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);//跳转到指定活动
                intent.setData(Uri.parse("tel:4008-823823"));
                startActivity(intent);
                Toast.makeText(ThirdActivity.this,"urusai",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}