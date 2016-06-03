package com.javiercruzweb.glidetutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView miImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miImageView = (ImageView) findViewById(R.id.miImageView);
        setMiImageView();
    }

    private void setMiImageView() {
        String url = "https://d30y9cdsu7xlg0.cloudfront.net/png/79744-200.png";
        //get url image code
        Glide.with(this)
                .load(url)
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .into(miImageView);
    }
}
