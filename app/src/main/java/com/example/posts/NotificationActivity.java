package com.example.posts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NotificationActivity extends AppCompatActivity {
    private Button _addNotification,_addmessageNotification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        _addNotification = findViewById(R.id.NotificationButton);
        _addmessageNotification = findViewById(R.id.messagenotificationButton);

        String msg = getIntent().getStringExtra("message");

        if(msg!=null){
            _addNotification.setVisibility(View.INVISIBLE);
            _addmessageNotification.setVisibility(View.INVISIBLE);
            TextView textView = findViewById(R.id.textView2);
            textView.setVisibility(View.VISIBLE);
            textView.setText(msg);


        }



        _addmessageNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(NotificationActivity.this)
                        .setSmallIcon(R.drawable.ic_message_black_24dp)
                        .setContentText("Hello World")
                        .setContentTitle("Message Notification")
                        .setAutoCancel(true)
                        ;

                Intent intent = new Intent(NotificationActivity.this,MessageActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("message","Hello World");

                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);

                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                notificationManager.notify(0,builder.build());
            }
        });

        _addNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(NotificationActivity.this)
                        .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                        .setContentText("Hello i am a notification")
                        .setContentTitle("Notification")
                        .setAutoCancel(true)
                        ;

                Intent intent = new Intent(NotificationActivity.this,NotificationActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("message","Hello i am a notification");

                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);

                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                notificationManager.notify(0,builder.build());
            }
        });
    }
}
