package com.example.ciclodevidaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;


    //Ciclo de vidas da activity.....
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ActivityDois.class);
                    startActivity(intent);
            }
        });
    }




    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected  void onResume(){
        super.onResume();
    }

    @Override
    protected  void onPause(){
        super.onPause();
    }

    @Override
    protected  void onStop(){
        super.onStop();
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
    }

}
