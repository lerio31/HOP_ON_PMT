package com.mscode.hop_on_pmt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button rider_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       setTitle("HOP ON");
        rider_button = (Button) findViewById(R.id.rider_button);
        rider_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openlogin_hopon();
            }
        });
    }
         public void openlogin_hopon(){
             Intent intent = new Intent(this, login_hopon.class);
             startActivity(intent);


    }


}