package com.example.waterWave;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * 水波纹效果 demo
 * @author zihao
 * Email zihao131125@gmail.com
 *
 */
public class MyActivity extends Activity {
    private Button btn1;
    private Button btn2;

    WaterRipplesView wave;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        wave = (WaterRipplesView)findViewById(R.id.wave);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(wave.isStarting() ){
                    btn1.setText("继续");
                    wave.stop();
                }
                else{
                    btn1.setText("暂停");
                    wave.start();
                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wave.breath();//让波呼吸一次
            }
        });



    }
}
