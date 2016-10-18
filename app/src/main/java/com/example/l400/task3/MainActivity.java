package com.example.l400.task3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements myfragments.callBacks{

    boolean istwopane = false;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        myfragments frr = new myfragments();
//        getFragmentManager().beginTransaction().replace(R.id.li,frr)
//                .commit();
       if(findViewById(R.id.detailcontanier) != null){
           istwopane = true;
       }
    }

    @Override
    public void onitemselected(double result) {
        Bundle b = new Bundle();
       b.putDouble("result",result);
        if(istwopane){
          DetailFragments d = new DetailFragments();
            d.setArguments(b);
            getFragmentManager().beginTransaction().replace(R.id.detailcontanier,d).commit();
        }
        else{

        Intent intent = new Intent(MainActivity.this,Result_Activity.class);
        intent.putExtra("bundle",b);
        Log.d("bundle = ", String.valueOf(b));
        //Log.d("result" , String.valueOf(result));
        startActivity(intent);}
    }
}
