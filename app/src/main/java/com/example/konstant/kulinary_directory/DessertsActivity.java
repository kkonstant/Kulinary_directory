package com.example.konstant.kulinary_directory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.view.View;

public class DessertsActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desserts);
        GridView gridView = (GridView) findViewById(R.id.grid_view);

        gridView.setAdapter(new ItemAdapter(this));

        gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Intent i = new Intent(getApplicationContext(),
                        FullImageActivity.class);
                i.putExtra("id", position);
                startActivity(i);
            }
        });



    }





}
