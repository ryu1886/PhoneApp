package com.example.mac.cellphoneapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick01(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-6511-0254"));
        startActivity(intent);
    }

}
