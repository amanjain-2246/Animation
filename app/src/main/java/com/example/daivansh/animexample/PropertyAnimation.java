package com.example.daivansh.animexample;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PropertyAnimation extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animation);
        imageView=(ImageView)findViewById(R.id.imageView2);


    }
    public void anim(View v)
    {
        ObjectAnimator animatorx=ObjectAnimator.ofFloat(imageView,"scaleX",1f,2f);
        ObjectAnimator animatory=ObjectAnimator.ofFloat(imageView,"scaleY",1f,2f);
        ObjectAnimator anu=ObjectAnimator.ofFloat(imageView,"X",1f,2f);
        AnimatorSet set=new AnimatorSet();
        set.playTogether(animatorx,animatory);
        set.setDuration(1000);
        set.start();

    }
}
