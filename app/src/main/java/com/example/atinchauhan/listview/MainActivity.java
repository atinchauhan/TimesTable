package com.example.atinchauhan.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    /*public void generate(int num){

        ArrayList<String>timestable=new ArrayList<String>();
        for(int j=1;j<=10;j++){
            timestable.add(Integer.toString(j*num));

        }
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,timestable);
        listView.setAdapter(arrayAdapter);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SeekBar seekBar = findViewById(R.id.seekBar);

        seekBar.setMax(20);
        seekBar.setProgress(10);
        generated(10);

       // seekBar.setOnSeekBarChangeListener(new seekBar.setOnSeekBarChangeListener(););
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int min=1;
                int num;

                if(i<min){
                    num=min;
                    seekBar.setProgress(min);
                }
                else
                {
                    num=i;
                }
                Log.i("info",Integer.toString(num));
                generated(num);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
    public void generated(int num){

        ArrayList<String>timestable=new ArrayList<String>();
        for(int j=1;j<=10;j++){
            timestable.add(Integer.toString(j*num));

        }
       // ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,timestable);
        ArrayAdapter<String>arrayAdapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, timestable);
        ListView listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }
}
