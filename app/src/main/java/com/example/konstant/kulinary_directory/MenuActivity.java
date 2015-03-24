package com.example.konstant.kulinary_directory;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends ActionBarActivity {

    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

       textView = (TextView) findViewById(R.id.textView);
    }
    public void showDesserts(View v) {
        Intent intent = new Intent(this, DessertsActivity.class);
        startActivity(intent);
    }
}
