package com.hari.aag.androidversions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.hari.aag.androidversions.adapter.AndroidVersionsAdapter;

public class AndroidVersionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_versions);

        GridView androidVersionsGridView = (GridView) findViewById(R.id.id_grid_versions);
        androidVersionsGridView.setNumColumns(getNoOfCols());
        androidVersionsGridView.setAdapter(new AndroidVersionsAdapter(this));
    }

    private int getNoOfCols(){
        float scaleFactor = getResources().getDisplayMetrics().density * 100;
        int number = getWindowManager().getDefaultDisplay().getWidth();
        return (int) ((float) number / (float) scaleFactor);
    }
}
