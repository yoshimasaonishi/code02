package com.example.daxihuijiang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}

notifyVolSeekBar = (SeekBar)findViewById(R.id.notifyVolSeekBar); //着信音量シークバー
        notifyVolText = (TextView)findViewById(R.id.notifyVolLabel); //着信音量TextView
        ringVolSeekBar.setOnSeekBarChangeListener(
        new OnSeekBarChangeListener() {
public void onProgressChanged(SeekBar seekBar,
        int progress, boolean fromUser) {
        // TODO Auto-generated method stub
        ringVolText.setText("Ring Volume:"+progress); //TextViewに設定値を表示
        am.setStreamVolume(AudioManager.STREAM_RING, progress, 0); //着信音量設定
        }

public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

        }

public void onStopTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

        }
        }
        );
