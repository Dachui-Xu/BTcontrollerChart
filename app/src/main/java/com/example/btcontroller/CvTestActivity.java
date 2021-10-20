package com.example.btcontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;
import java.util.List;

public class CvTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv_test);
        LineChart lineChart ;
        lineChart = findViewById(R.id.lineChart);
        List<String> xDataList = new ArrayList<>();// x轴数据源
        List<Entry> yDataList = new ArrayList<>();// y轴数据数据源
        /**
         * 双向链表
         */
        int k=0;
        int i=0;
        while (k<=23){
            int range = 100;
            xDataList.add(i + " ");
            float value = (float) (Math.random() * range) + 3;
            yDataList.add(new Entry(value, i));
            i++;
            k++;
            while (k==22&&i>0){
                xDataList.add(i + " ");
                 value = (float) (Math.random() * range) + 3;
                yDataList.add(new Entry(value, i));
                i--;
            }


        }


////给上面的X、Y轴数据源做假数据测试
//        for (int i = 0; i < 24; i++) {
//
//            int range = 100;
//            // x轴显示的数据
//            xDataList.add(i + " ");
//            //y轴生成float类型的随机数
//            float value = (float) (Math.random() * range) + 3;
//            yDataList.add(new Entry(value, i));
//        }
//显示图表,参数（ 上下文，图表对象， X轴数据，Y轴数据，图表标题，曲线图例名称，坐标点击弹出提示框中数字单位）
        ChartUtil.showChart(this, lineChart, xDataList, yDataList, "随机图", "C/V","I/E");


    }
}