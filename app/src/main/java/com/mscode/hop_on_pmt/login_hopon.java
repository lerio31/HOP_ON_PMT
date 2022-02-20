package com.mscode.hop_on_pmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class login_hopon extends AppCompatActivity {
    private Button Notregister_field;
    private Button login_field;
    private Button forgot_p;
    private com.google.android.material.textfield.TextInputLayout user_field;
    private com.google.android.material.textfield.TextInputLayout password_field;


    //firebase

    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_hopon);

        //firebase data

        /*user_field = findViewById(R.id.username_field);
        password_field = findViewById(R.id.password_field);

        login_field.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username_field = user_field.getEditText().toString();
                root.setValue(username_field);
            }
        });*/


       //forgot password
       forgot_p = (Button) findViewById(R.id.forgot_p);
       forgot_p.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) { openforgot_password(); }
       });



       /* //login button

        login_field = (Button) findViewById(R.id.login_field);
        login_field.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openmain_menu_hopon(); }
        });*/

        //login button

        login_field = (Button) findViewById(R.id.login_field);
        login_field.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openMapsActivity_hopon(); }
        });


        //not register
        Notregister_field = (Button) findViewById(R.id.Notregister_field);
        Notregister_field.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { opensignin_hopon(); }
        });
    }

    //forgotpassword

     public void openforgot_password(){
        Intent intent = new Intent(this,Forgot_password.class);
        startActivity(intent);
     }



    /*//login

      public void openmain_menu_hopon(){
        Intent intent = new Intent(this, main_menu_hopon.class);
        startActivity(intent);
      }*/

    public void openMapsActivity_hopon(){
        Intent intent = new Intent(this, MapsActivity_hopon.class);
        startActivity(intent);
    }


      //not register

      public void opensignin_hopon(){
          Intent intent = new Intent(this, signin_hopon.class);
          startActivity(intent);
      }


}