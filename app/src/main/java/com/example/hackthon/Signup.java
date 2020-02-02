package com.example.hackthon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Signup extends AppCompatActivity {

    EditText name,num,city,adr1,adr2,state,pin,dis,email,aadhar;
    Button sub;
    String exp="[a-zA-Z]+";
TextView backb;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        name=(EditText)findViewById(R.id.names);
        num=(EditText)findViewById(R.id.nums);
        city=(EditText)findViewById(R.id.citys);
        adr1=(EditText)findViewById(R.id.adr1s);
        adr2=(EditText)findViewById(R.id.adr2s);
        state=(EditText)findViewById(R.id.states);
        pin=(EditText)findViewById(R.id.pins);
        dis=(EditText)findViewById(R.id.diss);
        email=(EditText)findViewById(R.id.emails);
        aadhar=(EditText)findViewById(R.id.aads);
        sub=(Button)findViewById(R.id.submit);
        backb=(TextView)findViewById(R.id.back);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(validate())
                    {
                        Intent n=new Intent(Signup.this,Regsuccess.class);
                        startActivity(n);
                    }


            }
        });

        backb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(Signup.this,Login.class);
                startActivity(n);
            }
        });
    }

    private boolean validate() {
        String nm=name.getText().toString();
        CharSequence inputStr = nm;
        String city1=city.getText().toString();
        CharSequence inputstr1=city1;
        String state1=state.getText().toString();
        CharSequence inputstr2=state1;
        Pattern pattern = Pattern.compile(exp, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        Matcher matcher1 = pattern.matcher(inputstr1);
        Matcher matcher2 = pattern.matcher(inputstr2);
        String expmob="[0-9]{10}";
        String mobile=num.getText().toString();
        CharSequence inputmob=mobile;
        Matcher matcher3 = pattern.matcher(inputmob);
        String pin1=pin.getText().toString();
        CharSequence inputpin=pin1;
        String exppin="[0-9]";
        Matcher matcher4 = pattern.matcher(inputpin);
        String dis1=dis.getText().toString();
        CharSequence inputdis=dis1;
        Matcher matcher5 = pattern.matcher(inputdis);
        String emailexp="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        CharSequence inputemail=emailexp;
        Matcher matcher6 = pattern.matcher(inputemail);
        String aadharexp="[0-9]{12}";
        CharSequence inputaadhar=aadharexp;
        Matcher matcher7=pattern.matcher(inputaadhar);
        if(name.length()==0 || num.length()==0 || city.length()==0 || adr1.length()==0 || adr2.length()==0 || state.length()==0 || pin.length()==0 || dis.length()==0 || email.length()==0 ||aadhar.length()==0) {
            Toast.makeText(Signup.this, "please enter all details", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(!matcher.matches())
        {
            name.setError("name should contain alphabets only");
            return false;
        }else if(!matcher1.matches())
        {
            city.setError("city should contain alphabets only");
            return false;
        }else if(!matcher2.matches())
        {
            state.setError("state should contain alphabets only");
            return false;
        }else if(!matcher3.matches())
        {
            num.setError("mobile number should be of 10 digits only");
            return false;
        }else if(!matcher4.matches())
        {
            pin.setError("pincode contains numbers only");
            return false;
        }else if(!matcher5.matches())
        {
            dis.setError("district should contain alphabets only");
            return false;
        }else if(!matcher6.matches())
        {
            email.setError("invalid email address");
            return false;
        }else if(!matcher7.matches())
        {
            aadhar.setError("invalid aadhar number");
            return false;
        }
        return true;
    }


}
