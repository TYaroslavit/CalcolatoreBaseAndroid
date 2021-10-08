package com.unisayaroslav.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    int num;
    String numero = "";
    EditText mEdit;
    TextView text1;


    private String calcolabase(int base, int B1) {
        int size;
        if (base == 2) size = 27;
        else if (base == 3) size = 17;
        else size = 14;
        int[] arr = new int[size];
        int p = size - 1;
        while (B1 >= base) {
            if (B1 % base == 0) arr[p] = 0;
            else arr[p] = 1;
            B1 = B1 / base;
            p--;
        }
        if (B1 == base) arr[p] = 1;
        else arr[p] = B1;
        for (int i = 0; i < size; i++) {
            numero = numero.concat(Integer.toString(arr[i]));
        }
        return numero;
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("valori " + result[i]);
        }

         */
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdit = (EditText) findViewById(R.id.insertNum);
        text1 = (TextView) findViewById(R.id.result);
    }

    public void DigitPress(View a) {
        int base;
        num = Integer.valueOf(mEdit.getText().toString());
        numero = "";
        Button b = (Button) a;
        int id = b.getId();
        switch (id) {
            case R.id.Button1:
                text1.setText(calcolabase(2, num).toString());
                break;
            case R.id.Button2:
                text1.setText(calcolabase(3, num).toString());
                break;
            case R.id.Button3:
                text1.setText(calcolabase(4, num).toString());
                break;
            case R.id.Button4:
                text1.setText(calcolabase(5, num).toString());
                break;
            case R.id.Button5:
                text1.setText(calcolabase(6, num).toString());
                break;
            case R.id.Button6:
                text1.setText(calcolabase(7, num).toString());
                break;
            case R.id.Button7:
                text1.setText(calcolabase(8, num).toString());
                break;
            case R.id.Button8:
                text1.setText(calcolabase(9, num).toString());
                break;
            case R.id.Button10:
                text1.setText(calcolabase(16, num).toString());
                break;
        }

    }
    public void Reset(View a) {
        numero = "";
        text1.setText(numero);
    }
}