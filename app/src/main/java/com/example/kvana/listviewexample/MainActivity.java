package com.example.kvana.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.kvana.listviewexample.R.id.iems_listview;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView lv;
    String days[]={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         lv= (ListView) findViewById(iems_listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.single_row,R.id.textview,days);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        TextView temp= (TextView) view;
        Toast.makeText(this,temp.getText()+""+i,Toast.LENGTH_LONG).show();
    }
}
