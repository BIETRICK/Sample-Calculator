package com.example.sample1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText ed1,ed2,ed3;
    Button b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.num1);
        ed2=findViewById(R.id.num2);
        ed3=findViewById(R.id.tot);

        b1=findViewById(R.id.add);
        b2=findViewById(R.id.sub);
        b3=findViewById(R.id.mul);
        b4=findViewById(R.id.div);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt( ed1.getText().toString());
                int num2 = Integer.parseInt( ed2.getText().toString());
                int tot = num1+num2;

                ed3.setText(String.valueOf(tot));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt( ed1.getText().toString());
                int num2 = Integer.parseInt( ed2.getText().toString());
                int tot = num1-num2;

                ed3.setText(String.valueOf(tot));

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt( ed1.getText().toString());
                int num2 = Integer.parseInt( ed2.getText().toString());
                int tot = num1*num2;

                ed3.setText(String.valueOf(tot));

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt( ed1.getText().toString());
                int num2 = Integer.parseInt( ed2.getText().toString());
                int tot = num1/num2;

                ed3.setText(String.valueOf(tot));

            }
        });



    }
}