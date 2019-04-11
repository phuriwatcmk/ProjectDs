package com.project.harue.projectdd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SubHomeActivity extends AppCompatActivity {

    String price;
    String datee;
    String curdate;
    String imgurl;

    TextView getprice;
    TextView gettime;

    int cal;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_home);

//        Hide Actionbar
        getSupportActionBar().hide();

        getprice = findViewById(R.id.price);
        gettime = findViewById(R.id.time);

        imageView = findViewById(R.id.img);

        Intent intent = getIntent();
        price = intent.getStringExtra("priceid");
        datee = intent.getStringExtra("dateid");
        curdate = intent.getStringExtra("curdateid");
        imgurl = intent.getStringExtra("imgurl");

        datee = datee.replace("/", "");
        datee = datee.replace("Stop: ", "");
        curdate = curdate.replace("/", "");

        gettime.setText(cal + "Day");

        getprice.setText(price);

        calculateprice(Integer.parseInt(price));

        Glide.with(getApplicationContext()).load(imgurl).into(imageView);

    }
    // func for calculate price
    private void calculateprice(int price) {

    }

    // func for calculate date
    private void calculatedate(int date, int curdate) {

    }
}
