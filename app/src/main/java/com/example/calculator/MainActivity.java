package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add,sub,mul,div;
    EditText n1,n2;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        res=findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=0,num2=0;
                if(!n1.getText().toString().matches("[0-9]+")||n1.getText().toString().length()>9)
                    Toast.makeText(MainActivity.this, "Enter Valid Number",Toast.LENGTH_LONG).show();
                else
                    num1=Integer.parseInt(n1.getText().toString());
                if(!n2.getText().toString().matches("[0-9]+")||n1.getText().toString().length()>9)
                    Toast.makeText(MainActivity.this, "Enter Valid Number",Toast.LENGTH_LONG).show();
                else
                    num2=Integer.parseInt(n2.getText().toString());
                res.setText(Long.toString((long)num1+num2));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=0,num2=0;
                if(!n1.getText().toString().matches("[0-9]+")||n1.getText().toString().length()>9)
                    Toast.makeText(MainActivity.this, "Enter Valid Number",Toast.LENGTH_LONG).show();
                else
                    num1=Integer.parseInt(n1.getText().toString());
                if(!n2.getText().toString().matches("[0-9]+")||n1.getText().toString().length()>9)
                    Toast.makeText(MainActivity.this, "Enter Valid Number",Toast.LENGTH_LONG).show();
                else
                    num2=Integer.parseInt(n2.getText().toString());
                res.setText(Integer.toString(num1-num2));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=1,num2=1;
                if(!n1.getText().toString().matches("[0-9]+")||n1.getText().toString().length()>9) {
                    num1=0;
                    Toast.makeText(MainActivity.this, "Enter Valid Number", Toast.LENGTH_LONG).show();
                }
                else
                    num1=Integer.parseInt(n1.getText().toString());
                if(!n2.getText().toString().matches("[0-9]+")||n1.getText().toString().length()>9) {
                    num2=0;
                    Toast.makeText(MainActivity.this, "Enter Valid Number", Toast.LENGTH_LONG).show();
                }
                else
                    num2=Integer.parseInt(n2.getText().toString());
                res.setText(Long.toString((long)num1*num2));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=1,num2=1;
                if(!n1.getText().toString().matches("[0-9]+")||n1.getText().toString().length()>9) {
                    Toast.makeText(MainActivity.this, "Enter Valid Number", Toast.LENGTH_LONG).show();
                    num1 = 0;
                }
                else
                    num1=Integer.parseInt(n1.getText().toString());
                if(!n2.getText().toString().matches("[0-9]+")||n1.getText().toString().length()>9) {
                    Toast.makeText(MainActivity.this, "Enter Valid Number", Toast.LENGTH_LONG).show();
                    num1 = 0;
                }
                else
                    num2=Integer.parseInt(n2.getText().toString());
                if(num2==0)
                    Toast.makeText(MainActivity.this, "Enter Valid Number",Toast.LENGTH_LONG).show();
                else
                    res.setText(Integer.toString(num1/num2));
            }
        });
    }
}