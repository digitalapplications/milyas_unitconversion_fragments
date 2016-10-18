package com.example.l400.task3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by l400 on 10/17/2016.
 */
public class DetailFragments extends Fragment {
    public Bundle b ;
    public DetailFragments(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       b = getArguments();
        double res = b.getDouble("result");
        View view = inflater.inflate(R.layout.fragment_layout,container,false);
        TextView v;
        v = (TextView)view.findViewById(R.id.r);
        v.setText(res+"");

        return view;

    }

    public void setArguments(double b) {
    }
}
