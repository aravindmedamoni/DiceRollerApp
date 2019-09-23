package com.aravi.dicerollerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    private ImageView myimage;
    private Random myrandomnumber=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myimage=findViewById(R.id.imageView);
        myimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdice();
            }
        });
    }

    private void showdice() {

        int dicenumber=myrandomnumber.nextInt(6)+1;
        switch (dicenumber){
            case 1:
                myimage.setImageResource(R.drawable.dice1);
                Toasty.success(this,"Lol you gain only 1 point",Toast.LENGTH_SHORT).show();
                break;

            case 2:
                myimage.setImageResource(R.drawable.dice2);
                Toasty.success(this,"shit you gain only 2 point",Toast.LENGTH_SHORT).show();
                break;

            case 3:
                myimage.setImageResource(R.drawable.dice3);
                Toasty.success(this,"okay you gain 3 point",Toast.LENGTH_SHORT).show();
                break;

            case 4:
                myimage.setImageResource(R.drawable.dice4);
                Toasty.success(this,"now you gain 4 point",Toast.LENGTH_SHORT).show();
                break;

            case 5:
                myimage.setImageResource(R.drawable.dice5);
                Toasty.success(this,"yoh you gain  5 point",Toast.LENGTH_SHORT).show();
                break;

            case 6:
                myimage.setImageResource(R.drawable.dice6);
                Toasty.success(this,"yahoo you gain 6 point",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
