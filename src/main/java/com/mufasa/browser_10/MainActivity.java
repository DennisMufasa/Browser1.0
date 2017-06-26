package com.mufasa.browser_10;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button search;
    Button facebook;
    Button google;
    Button youtube;
    Button jumia;
    Button saf;
    Button news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search=(Button) findViewById(R.id.btnSearch);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input=(EditText) findViewById(R.id.txtUrl);

                String url=input.getText().toString().trim();
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        facebook=(Button) findViewById(R.id.btnFb);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlFb="http://facebook.com";
                Intent intentFb= new Intent(Intent.ACTION_VIEW, Uri.parse(urlFb));
                startActivity(intentFb);
            }
        });

        google=(Button) findViewById(R.id.btnGoogle);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlGl="http://google.com";
                Intent intentGl=new Intent(Intent.ACTION_VIEW, Uri.parse(urlGl));
                startActivity(intentGl);
            }
        });

       youtube= (Button) findViewById(R.id.btnYoutube);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlYt="http://youtube.com";
                Intent intentYt= new Intent(Intent.ACTION_VIEW, Uri.parse(urlYt));
                startActivity(intentYt);
            }
        });

       jumia= (Button) findViewById(R.id.btnJumia);
        jumia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlJm="http://jumia.com";
                Intent intentJm= new Intent(Intent.ACTION_VIEW, Uri.parse(urlJm));
                startActivity(intentJm);
            }
        });

       saf= (Button) findViewById(R.id.btnSaf);
        saf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlSaf="http://safaricom.com";
                Intent intentSaf= new Intent(Intent.ACTION_VIEW, Uri.parse(urlSaf));
                startActivity(intentSaf);
            }
        });

       news= (Button) findViewById(R.id.btnNews);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlNews="http://dailynation.com";
                Intent intentNews= new Intent(Intent.ACTION_VIEW, Uri.parse(urlNews));
                startActivity(intentNews);
            }
        });

    }
}
