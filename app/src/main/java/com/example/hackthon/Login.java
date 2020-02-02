package com.example.hackthon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText hcid1,pass1;
    Button signin;
    TextView forgotpass,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        hcid1=(EditText)findViewById(R.id.hcid);
        pass1=(EditText)findViewById(R.id.pass);
        signin=(Button) findViewById(R.id.signin);
        forgotpass=(TextView)findViewById(R.id.forgot);
        signup=(TextView)findViewById(R.id.register);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validate())
                {
                    Intent n=new Intent(Login.this,Hackthonnav.class);
                    startActivity(n);
                }

            }
        });

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Login.this,Forgotpassword.class);
                startActivity(n);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Login.this,Signup.class);
                startActivity(n);
            }
        });
    }

    private boolean validate() {

        if(hcid1.length()==0 || pass1.length()==0)
        {
            Toast.makeText(Login.this,"pls enter all details",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }



}
