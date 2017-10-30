package com.example.taruc.lab22loancalculator;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText carPriceEditText;
    EditText downPaymentEditText;
    EditText loanPeriodEditText;
    EditText interestRateEditText;

    public static final String carPricePass="MainActivity.carPricePass";
    public static final String downPaymentPass="MainActivity.downPaymentPass";
    public static final String loanPeriodPass="MainActivity.loanPeriodPass";
    public static final String interestRatePass="MainActivity.interestRatePass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carPriceEditText=(EditText)findViewById(R.id.carPrice);
        downPaymentEditText=(EditText)findViewById(R.id.downPaymentText);
        loanPeriodEditText=(EditText)findViewById(R.id.loanPeriodText);
        interestRateEditText=(EditText)findViewById(R.id.interestRateText);
    }
    public void passMessage(View v){
        double carPrice=Double.parseDouble(carPriceEditText.getText().toString());
        double downPayment=Double.parseDouble(downPaymentEditText.getText().toString());
        double loanPeriod= Double.parseDouble(loanPeriodEditText.getText().toString());
        double interestRate=Double.parseDouble(interestRateEditText.getText().toString());

        Intent intent=new Intent(this,ResultActivity.class);
        intent.putExtra(carPricePass,carPrice);
        intent.putExtra(downPaymentPass,downPayment);
        intent.putExtra(loanPeriodPass,loanPeriod);
        intent.putExtra(interestRatePass,interestRate);

        startActivity(intent);

    }
}
