package com.example.hackthon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Regsuccess extends AppCompatActivity {

    TextView right,txt1,txt2;
    Button gotologin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regsuccess);
        right=(TextView)findViewById(R.id.right);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        gotologin=(Button) findViewById(R.id.gotologin);


        gotologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Regsuccess.this,Login.class);
                startActivity(n);

            }
        });
    }
}
