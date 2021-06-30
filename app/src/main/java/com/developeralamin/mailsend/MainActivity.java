package com.developeralamin.mailsend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import papaya.in.sendmail.SendMail;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SendMail mail = new SendMail("send_email", "mail_password",
                "alaminsakib.cse@gmail.com",
                "Testing Email Sending",
                "Yes, it's working well\nI will use it always.");

        findViewById(R.id.sendMail).setOnClickListener(v ->
                mail.execute()
                );
    }
}