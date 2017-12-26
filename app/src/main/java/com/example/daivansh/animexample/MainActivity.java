package com.example.daivansh.animexample;

import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.annotation.AnimatorRes;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1;
    private AnimationDrawable monkeyanimation;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        imageView=(ImageView)findViewById(R.id.imageView);
        if(imageView==null) throw new AssertionError();
        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.monkey_animation);

        monkeyanimation=(AnimationDrawable)imageView.getBackground();
        monkeyanimation.setOneShot(true);


        b1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                imageView.setVisibility(View.VISIBLE);
                if(monkeyanimation.isRunning()){
                    monkeyanimation.stop();
                }
                    monkeyanimation.start();





                /*
                Animation animation=AnimationUtils.loadAnimation(MainActivity.this,R.anim.myanim);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        //imageView.setScaleX(2);
                        //imageView.setScaleY(2);
                        Animation anm=AnimationUtils.loadAnimation(MainActivity.this,R.anim.myanim2);
                        imageView.startAnimation(anm);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                imageView.startAnimation(animation);
                    */
              //  imageView.animate().translationX(100).translationY(100).setDuration(3000).translationX(300).translationY(300).translationZ(300).alpha(0.5f).start();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        monkeyanimation.stop();
    }
}
