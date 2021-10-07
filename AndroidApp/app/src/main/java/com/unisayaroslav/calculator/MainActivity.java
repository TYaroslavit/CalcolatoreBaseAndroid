package com.unisayaroslav.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    int num;
    int[] result = new int[16];
    String numero = "", numIns;
    EditText mEdit;
    TextView text1;


    private int[]  calcolabase(int base, int B1) {
        int[] arr = new int[16];
        int p = 15;
        while (B1 >= base) {
            if (B1 % base == 0) arr[p] = 0;
            else arr[p] = 1;
            B1 = B1 / base;
            p--;

        }
        if (B1 == base) arr[p] = 1;
        else arr[p] = B1;
        return arr;
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

    /*public void CambioSfondo(View v) {
        int r =rand1.nextInt( 255)+1;
        int g = rand1.nextInt( 255)+1;
        int b = rand1.nextInt( 255)+1;
        v.setBackgroundColor(Color.rgb(r,g,b));
    }*/
    public void base2(View a) {
        num = 0;
        numIns = mEdit.getText().toString();
        for (int i = 0; i < numIns.length(); i++) {
            num = num * 10 + Character.getNumericValue(numIns.charAt(i));
        }
        result=calcolabase(2, num);
        for (int i = 0; i < 16; i++) {
            numero=numero.concat( Integer.toString(result[i]));
        }
        text1.setText(numero);
    }

    public void base3(View a){
        num = 0;
        numIns = mEdit.getText().toString();
        for (int i = 0; i < numIns.length(); i++) {
            num = num * 10 + Character.getNumericValue(numIns.charAt(i));
        }
        result=calcolabase(3, num);
        for (int i = 0; i < 16; i++) {
            numero=numero.concat( Integer.toString(result[i]));
        }
        text1.setText(numero);

    }
    public void base4(View a){
        num = 0;
        numIns = mEdit.getText().toString();
        for (int i = 0; i < numIns.length(); i++) {
            num = num * 10 + Character.getNumericValue(numIns.charAt(i));
        }
        result=calcolabase(4, num);
        for (int i = 0; i < 16; i++) {
            numero=numero.concat( Integer.toString(result[i]));
        }
        text1.setText(numero);
    }
    public void base5(View a){
        num = 0;
        numIns = mEdit.getText().toString();
        for (int i = 0; i < numIns.length(); i++) {
            num = num * 10 + Character.getNumericValue(numIns.charAt(i));
        }
        result=calcolabase(5, num);
        for (int i = 0; i < 16; i++) {
            numero=numero.concat( Integer.toString(result[i]));
        }
        text1.setText(numero);
    }
    public void base6(View a){
        num = 0;
        numIns = mEdit.getText().toString();
        for (int i = 0; i < numIns.length(); i++) {
            num = num * 10 + Character.getNumericValue(numIns.charAt(i));
        }
        result=calcolabase(6, num);
        for (int i = 0; i < 16; i++) {
            numero=numero.concat( Integer.toString(result[i]));
        }
        text1.setText(numero);
    }
    public void base7(View a){
        num = 0;
        numIns = mEdit.getText().toString();
        for (int i = 0; i < numIns.length(); i++) {
            num = num * 10 + Character.getNumericValue(numIns.charAt(i));
        }
        result=calcolabase(7, num);
        for (int i = 0; i < 16; i++) {
            numero=numero.concat( Integer.toString(result[i]));
        }
        text1.setText(numero);
    }
    public void base8(View a){
        num = 0;
        numIns = mEdit.getText().toString();
        for (int i = 0; i < numIns.length(); i++) {
            num = num * 10 + Character.getNumericValue(numIns.charAt(i));
        }
        result=calcolabase(8, num);
        for (int i = 0; i < 16; i++) {
            numero=numero.concat( Integer.toString(result[i]));
        }
        text1.setText(numero);
    }
    public void base9(View a){
        num = 0;
        numIns = mEdit.getText().toString();
        for (int i = 0; i < numIns.length(); i++) {
            num = num * 10 + Character.getNumericValue(numIns.charAt(i));
        }
        result=calcolabase(9, num);
        for (int i = 0; i < 16; i++) {
            numero=numero.concat( Integer.toString(result[i]));
        }
        text1.setText(numero);
    }
    /*
    public void base10(View a){
        num = 0;
        numIns = mEdit.getText().toString();
        for (int i = 0; i < numIns.length(); i++) {
            num = num * 10 + Character.getNumericValue(numIns.charAt(i));
        }
        result=calcolabase(10, num);
        for (int i = 0; i < 16; i++) {
            numero=numero.concat( Integer.toString(result[i]));
        }
        text1.setText(numero);
    } */
    public void base16(View a){
        num = 0;
        numIns = mEdit.getText().toString();
        for (int i = 0; i < numIns.length(); i++) {
            num = num * 10 + Character.getNumericValue(numIns.charAt(i));
        }
        result=calcolabase(16, num);
        for (int i = 0; i < 16; i++) {
            numero=numero.concat( Integer.toString(result[i]));
        }
        text1.setText(numero);
    }


    public void Reset(View a){
        numero = "";
        text1.setText(numero);
    }
}