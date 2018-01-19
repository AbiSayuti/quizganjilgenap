package com.abisayuti.quizganjilgenap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etinput;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etinput = (EditText)findViewById(R.id.etinput);
        btnHitung = (Button) findViewById(R.id.btnhitung);
        txtHasil = (TextView) findViewById(R.id.txthasil);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String angka = etinput.getText().toString();
                int angka1 = Integer.parseInt(angka);


                if(angka1 % 2 == 1) {
                    txtHasil.setText(angka1 + " Adalah bilangan ganjil");



                }else if (angka1 % 2 == 0){




                    txtHasil.setText(angka1 + " Adalah bilangan genap");
                }else {
                    txtHasil.setText("masukkan minimal angka 1");
                }



            }
        });
    }
}

