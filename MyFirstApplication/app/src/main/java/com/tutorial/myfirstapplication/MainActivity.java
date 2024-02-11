package com.tutorial.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void click1(View view){
//        Toast.makeText("this", "Sending data through click1", Toast.LENGTH_SHORT)
      Toast.makeText(this, "sending Data through click1", Toast.LENGTH_SHORT).show();
    }
    public void click2(View view){
//        Toast.makeText("this", "Sending data through click1", Toast.LENGTH_SHORT)
        Toast.makeText(this, "sending Data through click2", Toast.LENGTH_SHORT).show();
    }
    public void click3(View view){
//        Toast.makeText("this", "Sending data through click1", Toast.LENGTH_SHORT)
        Toast.makeText(this, "sending Data through click3", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}