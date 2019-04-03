package com.e.basicobjectbuild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2=(TextView) findViewById(R.id.textView2);
        textView2.setAutoLinkMask(Linkify.WEB_URLS);
        textView2.setText("在程式中所設的URL : https://www.ntust.edu.tw/home.php");

        TextView textView4=(TextView) findViewById(R.id.textView4);
        textView4.setAutoLinkMask(Linkify.EMAIL_ADDRESSES);
        textView4.setText("在程式中所設的E-mail : q17640336@gmail.com");

        TextView textView6=(TextView) findViewById(R.id.textView6);
        textView6.setAutoLinkMask(Linkify.PHONE_NUMBERS);
        textView6.setText("在程式中所設的PHONE : 02 2733 3141");

    }
}
