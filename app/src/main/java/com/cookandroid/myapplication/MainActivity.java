package com.cookandroid.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    PieChart pieChart;
    int[] colorArray = new int[] {Color.LTGRAY, Color.BLUE,Color.RED};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart = findViewById(R.id.picChart);

        PieDataSet pieDataSet = new PieDataSet(data1(),"얍얍얍");
        pieDataSet.setColors(colorArray);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setExtraOffsets(5,10,5,5);

        pieChart.setData((pieData));
        pieChart.invalidate();
        pieChart.setDrawHoleEnabled(false);
        pieChart.setHoleColor(Color.BLACK);
        pieChart.setRotationEnabled(false);
       }
       private ArrayList<PieEntry> data1() {
           ArrayList<PieEntry> datavalue = new ArrayList<>();

           datavalue.add(new PieEntry(30, "밥먹기"));
           datavalue.add(new PieEntry(50, "코딩하기"));
           datavalue.add(new PieEntry(20, "운동하기"));

           return datavalue;


       }


}