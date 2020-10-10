package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Standard extends AppCompatActivity {

    static String num="Standard";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
        Button button=(Button)findViewById(R.id.button_1);
        Log.d("Standard",this.toString());
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(Standard.this,"点击",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Standard.this,Standard.class);
                startActivity(intent);
            }
        });



    }
}