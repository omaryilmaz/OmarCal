package com.example.omarcal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumber1,txtNumber2,txtSum;
    private Button buttonAdd,buttonSub,buttonMulti,buttonDiv,buttonEqul,buttonClear;
    String op = "";
    int sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber1 = (EditText) findViewById(R.id.txtNumber1);
        txtNumber2 = (EditText) findViewById(R.id.txtNumber2);
        txtSum = (EditText) findViewById(R.id.txtSum);

        buttonAdd =(Button)  findViewById(R.id.buttonAdd);
        buttonSub =(Button)  findViewById(R.id.buttonSub);
        buttonMulti =(Button)  findViewById(R.id.buttonMulti);
        buttonDiv =(Button)  findViewById(R.id.buttonDiv);
        buttonClear =(Button)  findViewById(R.id.buttonClear);


    }
            public void clear(View v)
            {
                txtNumber1.setText("");
                txtNumber2.setText("");
                txtSum.setText("");
            }


public void Add(View v)
{
    op="+";
}
    public void Sub(View v)
    {
        op="-";
    }
    public void Multi(View v)
    {
        op="*";
    }
    public void Div(View v)
    {
        op="/";
    }





            public void Sum(View v)
            {

                int a=0,b=0;


                 a=Integer.parseInt(txtNumber1.getText().toString());
                 b=Integer.parseInt(txtNumber2.getText().toString());


                switch (op)
                {
                    case "+":
                         sum = a + b;txtSum.setText(""+sum);break;
                   case "-":
                       sum = a - b;txtSum.setText(""+sum); break;
                  case "*":
                        sum = a * b;txtSum.setText(""+sum); break;
                    case "/":
                        sum = a / b; txtSum.setText(""+sum); break;

                }
            }


}
