package com.candra.mychartapps;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList barArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BarChart barChart = findViewById(R.id.barChart);
        getData();
        BarDataSet barDataSet = new BarDataSet(barArrayList, "Data Set");
        BarData barData = new BarData(barDataSet);

        barChart.setData(barData);
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);
        barChart.getDescription().setEnabled(true);
    }

    private void getData()
    {
        barArrayList = new ArrayList();
        barArrayList.add(new BarEntry(1, 100));
        barArrayList.add(new BarEntry(2, 200));
        barArrayList.add(new BarEntry(3, 300));
        barArrayList.add(new BarEntry(4, 400));
        barArrayList.add(new BarEntry(5, 500));
        barArrayList.add(new BarEntry(6, 600));
    }
}