package com.unisayaroslav.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand1 = new Random();
    int number,resto[],i=0;
    String numero;
    EditText mEdit;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdit   = (EditText)findViewById(R.id.insertNum);
        text1 = (TextView) findViewById(R.id.result);
    }

    /*public void CambioSfondo(View v) {
        int r =rand1.nextInt( 255)+1;
        int g = rand1.nextInt( 255)+1;
        int b = rand1.nextInt( 255)+1;
        v.setBackgroundColor(Color.rgb(r,g,b));
    }*/
    public void base2(View a){
        /*numero = mEdit.getText().toString();
        number=Integer.parseInt(numero);
        if(number == 3){
            resto[0] = 1;
            resto[1] = 1;
        }
        else if (number == 2) resto[1]=1;
        else resto[0] = 1;
        while(number/2 > 4) {
            number= number/2;
            resto[i]=1;
        }*/
        text1.setText("ok");
    }
}