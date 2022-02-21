package com.example.myyearbook;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.app.Notification;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity<i> extends AppCompatActivity {

    Timer timer;
    TimerTask timerTask;
    int Your_X_SECS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void show_Notification() {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        String CHANNEL_ID = "MYCHANNEL";
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "name", NotificationManager.IMPORTANCE_LOW);
        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 1, intent, 0);
        Notification notification = new Notification.Builder(getApplicationContext(), CHANNEL_ID)
                .setContentText("Check it out")
                .setContentTitle("Freida is so cute")
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .setSmallIcon(android.R.drawable.sym_action_chat)
                .build();

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(notificationChannel);
        notificationManager.notify(1, notification);
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), NextActivity.class);
        startActivity(i);

        //My Activty name is "ZakActivity"
    }
    public void stopTimer() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
    }

   @RequiresApi(api = Build.VERSION_CODES.O)
    public void Timer() {
        timer = new Timer();
        initializeTimerTask();
        timer.schedule(timerTask, 30000, Your_X_SECS * 1000);

    }

    private void initializeTimerTask() {
        timerTask = new TimerTask() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            public void run() {
                show_Notification();
                stopTimer();
            }
        };
    }


   public void onResume() {

        super.onResume();
        stopTimer();
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onPause(){
        super.onPause();
        Timer();
    }




}




