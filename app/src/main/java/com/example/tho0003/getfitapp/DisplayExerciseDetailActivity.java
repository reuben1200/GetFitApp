package com.example.tho0003.getfitapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.TreeMap;

public class DisplayExerciseDetailActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener,
         ViewPagerEx.OnPageChangeListener{

    private SliderLayout slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_exercise_detail);


        slider = (SliderLayout) findViewById(R.id.slider);

        TreeMap<String,Integer> file_maps = new TreeMap<String, Integer>();
        file_maps.put("push-up-step1",R.drawable.pushup1);
        file_maps.put("push-up-step2",R.drawable.pushup2);
        file_maps.put("push-up-step3",R.drawable.pushup3);
        file_maps.put("push-up-step4", R.drawable.pushup4);
        file_maps.put("push-up-step5", R.drawable.pushup5);
        file_maps.put("push-up-step6", R.drawable.pushup6);
        file_maps.put("push-up-step7", R.drawable.pushup7);

        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            slider.addSlider(textSliderView);
        }

        slider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        slider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        slider.setCustomAnimation(new DescriptionAnimation());
        slider.setDuration(4000);
        slider.addOnPageChangeListener(this);
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {
        Log.d("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {}
}
