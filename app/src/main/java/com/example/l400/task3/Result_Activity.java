package com.example.l400.task3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Result_Activity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_);
        DetailFragments fragments = new DetailFragments();

        //Bundle b = getIntent().getBundleExtra("bundle");
       // Bundle b = new Bundle();
//        Bundle b1 = getIntent().getExtras();
//        double re = b1.getDouble("bundle");
        //Log.d("res" , String.valueOf(b1));
       // Log.d("res1" , String.valueOf(re));
       // Bundle vv = new Bundle();
//        b1.putDouble("result  ",re);
        Bundle b1 = getIntent().getBundleExtra("bundle");
        Log.d("vvv" , String.valueOf(b1));

        fragments.setArguments(b1);
        getFragmentManager().beginTransaction().add(R.id.detailcontanier,fragments).commit();


    }
}
