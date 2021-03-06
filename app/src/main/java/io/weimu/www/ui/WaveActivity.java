package io.weimu.www.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import io.weimu.www.R;
import io.weimu.www.widget.WaveView;

public class WaveActivity extends AppCompatActivity {
    //跳转
    public static Intent newIntent(Context context) {
        Intent i = new Intent(context, WaveActivity.class);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wave);

        final WaveView wave = (WaveView) findViewById(R.id.wave);
        wave.setCurrentProgress(50);
        wave.setBorderStyle(WaveView.BORDER.CIRCLE);



        wave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wave.setCurrentProgress(33);
            }
        });


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
