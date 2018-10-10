package com.example.farras23.mengenalbuahapp;

import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class jerman extends AppCompatActivity {
    EditText jerman;
    Button b;
    TextView hasil;
    String benar = "jerman";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jerman);

        jerman =(EditText)findViewById(R.id.nama_negara4);
        b =(Button)findViewById(R.id.button4);
        hasil =(TextView)findViewById(R.id.txt_hasil4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jerman.length()==0) {
                    Toast.makeText(getApplicationContext(), "Masukkan jawaban terlebih dahulu", Toast.LENGTH_SHORT).show();
                }
                else{ String jawaban = jerman.getText().toString();
                    if (jawaban.equals(benar)){
                        String keterangan ="Benar gan...";
                        hasil.setText(keterangan);
                    }
                    else{String keterangan ="Salah gan...";
                        hasil.setText(keterangan);
                    }
                }
            }
        });

    }
}

