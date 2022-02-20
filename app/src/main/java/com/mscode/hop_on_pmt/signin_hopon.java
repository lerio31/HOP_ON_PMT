package com.mscode.hop_on_pmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signin_hopon extends AppCompatActivity {
   private Button  Click_to_login_field;
   private Button Register_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_hopon);

        //register

        Register_field = (Button) findViewById(R.id.Register_field);
        Register_field.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openlogin_hopon(); }
        });

        //click to login
        Click_to_login_field = (Button) findViewById(R.id.Click_to_login_field);
        Click_to_login_field.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openlogin_hopon();}

        //register

        });
    }

    //register




    //click to login
    public void openlogin_hopon(){
        Intent intent = new Intent(this,login_hopon.class);
        startActivity(intent);
    }
}