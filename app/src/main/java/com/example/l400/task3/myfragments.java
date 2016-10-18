package com.example.l400.task3;

import android.app.Activity;
import android.app.Fragment;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by l400 on 10/16/2016.
 */
public class myfragments extends Fragment  {
    private callBacks activity;
    public myfragments(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

      View v =   inflater.inflate(R.layout.fragments,container,false);
        Button convert;
        final Spinner from,to;
        final EditText value;
        final TextView result;
        convert = (Button)v.findViewById(R.id.button);
        from = (Spinner)v.findViewById(R.id.spinner);
        to = (Spinner)v.findViewById(R.id.spinner1);
        value = (EditText)v.findViewById(R.id.edit);
        result = (TextView)v.findViewById(R.id.result);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double res = 0;
                String val = from.getSelectedItem().toString();
                String too = to.getSelectedItem().toString();
                String  valu = value.getText().toString();
                double r = Double.parseDouble(valu);
                if(val.equals("inches") && too.equals("meter")){
                    res = r*0.0254;
                    result.setText(res+"");
                }
                else if(val.equals("meter") && too.equals("inches")){
                     res = r*39.37;
                    result.setText(res+"");
                }
                else if (val.equals("inches") && too.equals("inches")){
                    res = r*1;
                    result.setText(res+"");
                }

                else if(val.equals("meter") && too.equals("kilometer")){
                    res = r/1000;
                    result.setText(res+"");
                }
                else if(val.equals("meter") && too.equals("centimeter")){
                    res = r*100;
                    result.setText(res+"");
                }
                else if(val.equals("meter") && too.equals("mile")){
                    res = r/1609.344;
                    result.setText(res+"");
                }
                else if(val.equals("meter") && too.equals("milimeter")){
                    res = r*1000;
                    result.setText(res+"");
                }
                else if(val.equals("inches") && too.equals("milimeter")){
                    res = r*25.4;
                    result.setText(res+"");
                }
                else if(val.equals("inches") && too.equals("kilometer")){
                    res = r/39370;
                    result.setText(res+"");
                }
                else if(val.equals("inches") && too.equals("mile")){
                    res = r/63360;
                    result.setText(res+"");
                }
                else if(val.equals("inches") && too.equals("centimeter")){
                    res = r*2.54;
                    result.setText(res+"");
                }



                activity.onitemselected(res);
            }
        });

        return v;
    }



    public interface callBacks{
     public void onitemselected(double result);
    }



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (callBacks) activity;
    }
}
