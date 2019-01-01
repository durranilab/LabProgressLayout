package com.durranilab.labprogresslayoutapp;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.durranilab.labprogresslayout.LabProgressLayout;


public class MainActivity extends AppCompatActivity {

    LabProgressLayout labProgressLayout;
    RelativeLayout relativeLayout;

    int start = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labProgressLayout = findViewById(R.id.labProgressLayout);


        relativeLayout = findViewById(R.id.MainRelativeLayout);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start = 0;
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

                                }
                            });
                        }
                    }
                }).start();
            }
        });



    }
}
