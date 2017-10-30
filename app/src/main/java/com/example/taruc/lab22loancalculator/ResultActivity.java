package com.example.taruc.lab22loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView downPaymentTextView;
    TextView loanPeriodTextView;
    TextView interestRateTextView;
    TextView monthPaymentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent=getIntent();

        downPaymentTextView=(TextView)findViewById(R.id.downPaymentText);
        loanPeriodTextView=(TextView)findViewById(R.id.loanPeriodText);
        interestRateTextView=(TextView)findViewById(R.id.interestRateText);
        monthPaymentTextView=(TextView)findViewById(R.id.monthPaymentText);

        double downPayment=intent.getDoubleExtra(MainActivity.downPaymentPass,0);
        double loanPeriod=intent.getDoubleExtra(MainActivity.loanPeriodPass,0);
        double interestRate=intent.getDoubleExtra(MainActivity.interestRatePass,0);
        double carPrice=intent.getDoubleExtra(MainActivity.carPricePass,0);


        double carLoan=carPrice-downPayment;
        double interest=carLoan*interestRate*loanPeriod;
        double monthPayment=(carLoan+interest)/(loanPeriod/12);

        downPaymentTextView.setText(getString(R.string.downPayment)+":"+downPayment);
        loanPeriodTextView.setText(getString(R.string.loanPeriod)+":"+loanPeriod);
        interestRateTextView.setText(getString(R.string.interestRate)+":"+interestRate);
        monthPaymentTextView.setText(getString(R.string.monthPayment)+":"+monthPayment);


    }
    public void closeActivity(View v){
        finish();
    }
}
