package com.example.daivansh.animexample;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MovingArrow extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moving_arrow);
        imageView=(ImageView)findViewById(R.id.imageView4);

    }
    public void move(View v)
    {
        ObjectAnimator animator1=ObjectAnimator.ofFloat(imageView,"y",-10,1500).setDuration(3000);
        AnimatorSet set=new AnimatorSet();
        set.playTogether(animator1);
        set.setDuration(3000);
        set.start();
    }
}
