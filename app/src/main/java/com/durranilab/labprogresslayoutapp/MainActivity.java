package com.durranilab.labprogresslayoutapp;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.durranilab.labprogresslayout.LabProgressLayout;
import com.durranilab.labprogresslayout.LabProgressLayoutListener;


public class MainActivity extends AppCompatActivity {

    LabProgressLayout labProgressLayout;

    int start = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labProgressLayout = findViewById(R.id.labProgressLayout);

        new Thread(new Runnable() {
            public void run() {
                while (start < 100) {
                    //progressStatus = doWork();
                    start +=1;

                    //Try to sleep the thread for 20 milliseconds
                    try{
                        Thread.sleep(20);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }

                    //Update the progress bar
                    handler.post(new Runnable() {
                        public void run() {
                          labProgressLayout.setCurrentProgress(start);
                          if (start>=100){
                              start=0;
                          }
                        }
                    });
                }
            }
        }).start();

        labProgressLayout.setProgressLayoutListener(new LabProgressLayoutListener() {
            @Override
            public void onProgressCompleted() {
                Toast.makeText(getApplicationContext(), "DONE", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onProgressChanged(int seconds) {

            }
        });
    }
}
