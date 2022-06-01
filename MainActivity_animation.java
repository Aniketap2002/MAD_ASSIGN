package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

   /* public void disp(View view){
        Log.i("disp","Error");
        Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();
    }*/
    boolean isEgg=true;
  /*  public void change(View view)
    {
        ImageView iv=findViewById(R.id.ImageView3);
        if(isEgg) {
            iv.setImageResource(R.drawable.chicken);
            isEgg=false;
        }else{
            iv.setImageResource(R.drawable.egg);
            isEgg=true;
        }
    }*/
  /*  public void change(View view)
    {
        ImageView imageView=findViewById(R.id.imageView);
        ImageView imageView2=findViewById(R.id.imageView2);
        if(isEgg){
            imageView.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
            isEgg=false;
        }else{
            imageView.animate().alpha(1).setDuration(2000);
            imageView2.animate().alpha(0).setDuration(2000);
            isEgg=false;
        }
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ImageView imageView=findViewById(R.id.imageView);
      //  imageView.animate().setDuration(2000).translationXBy(200);
    }
}