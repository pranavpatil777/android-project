package com.tutorial.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar p1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = (ProgressBar) findViewById(R.id.progressBar);
        b1 = (Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread thread = new Thread()
                {
                    @Override
                    public void run() {
                        super.run();
                        for(int i = 0; i<= 100; i++){
                            try{
                                sleep(1000);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            p1.setProgress(i);
                            i = i + 10;
                        }
                        p1.setProgress(0);
                    }
                };
                thread.start();
            }
        });
    }
}