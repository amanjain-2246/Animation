package com.example.daivansh.animexample;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class BounceInterpolatorExample extends AppCompatActivity {
    ImageView imageView;
    RelativeLayout mylayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bounce_interpolator_example);
        imageView=(ImageView)findViewById(R.id.imageView3);
        mylayout=(RelativeLayout)findViewById(R.id.relativelayout);
    }
    public void bounce(View v)
    {
        int height=mylayout.getHeight()-imageView.getHeight();
        ObjectAnimator animator1=ObjectAnimator.ofFloat(imageView,"y",0,height).setDuration(3000);
        ObjectAnimator animator2=ObjectAnimator.ofFloat(imageView,"x",-100,1200).setDuration(3000);
        ObjectAnimator animator3=ObjectAnimator.ofFloat(imageView,"rotation",30,360).setDuration(3000);
        animator1.setInterpolator(new BounceInterpolator());
        AnimatorSet set=new AnimatorSet();
       set.playTogether(animator1,animator2,animator3);
    //   set.playTogether(animator1);
        set.setDuration(2000);
        set.start();
    }
}
