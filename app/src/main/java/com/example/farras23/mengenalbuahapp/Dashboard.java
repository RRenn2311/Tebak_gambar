package com.example.farras23.mengenalbuahapp;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void btn_pakistan(View view) {
        Intent pakistan = new Intent(Dashboard.this,pakistan.class);
        startActivity(pakistan);
    }
    public void btn_swiss(View view) {
        Intent swiss = new Intent(Dashboard.this,swiss.class);
        startActivity(swiss);
    }
    public void btn_portugal(View view) {
        Intent portugal = new Intent(Dashboard.this,portugal.class);
        startActivity(portugal);
    }
    public void btn_jerman(View view) {
        Intent jerman = new Intent(Dashboard.this,jerman.class);
        startActivity(jerman);
    }

}
