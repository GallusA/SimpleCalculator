package com.example.gallusawa.simplecalculator;

import android.media.VolumeShaper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String currentOperation = null, num1 = null, num2 = null;
    TextView result;
    int res = 0;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bCalc,bDiv,bMul,bSub,bClear,bAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            b0= (Button) findViewById(R.id.btn0);
            b0.setOnClickListener(this);
            b1= (Button) findViewById(R.id.btn1);
            b1.setOnClickListener(this);
            b2= (Button) findViewById(R.id.btn2);
            b2.setOnClickListener(this);
            b3= (Button) findViewById(R.id.btn3);
            b3.setOnClickListener(this);
            b4= (Button) findViewById(R.id.btn4);
            b4.setOnClickListener(this);
            b5= (Button) findViewById(R.id.btn5);
            b5.setOnClickListener(this);
            b6= (Button) findViewById(R.id.btn6);
            b6.setOnClickListener(this);
            b7= (Button) findViewById(R.id.btn7);
            b7.setOnClickListener(this);
            b8= (Button) findViewById(R.id.btn8);
            b8.setOnClickListener(this);
            b9= (Button) findViewById(R.id.btn9);
            b9.setOnClickListener(this);

            bClear = (Button) findViewById(R.id.btnClear);
            bClear.setOnClickListener(this);

            result = (TextView) findViewById(R.id.tvResult);
            result.setText("");

            bCalc = (Button) findViewById(R.id.btnCalc);
            bCalc.setOnClickListener(this);
            bAdd = (Button) findViewById(R.id.btnAdd);
            bAdd.setOnClickListener(this);

            bSub = (Button) findViewById(R.id.btnSub);
            bSub.setOnClickListener(this);
            bDiv = (Button) findViewById(R.id.btnDiv);
            bDiv.setOnClickListener(this);
            bMul = (Button) findViewById(R.id.btnMul);
            bMul.setOnClickListener(this);

    }

    void processCalculations(){

        if(currentOperation == "+"){
            num1 = String.valueOf(Double.parseDouble(num1) + Double.parseDouble(num2));
            result.setText(formatAnswer(Double.parseDouble(num1)));
        }else if(currentOperation == "-"){
            num1 = String.valueOf(Double.parseDouble(num1) - Double.parseDouble(num2));
            result.setText(formatAnswer(Double.parseDouble(num1)));
        }else if (currentOperation == "/"){
            num1 = String.valueOf(Double.parseDouble(num1) / Double.parseDouble(num2));
            result.setText(formatAnswer(Double.parseDouble(num1)));
        }else if (currentOperation == "*"){
            num1 = String.valueOf(Double.parseDouble(num1) * Double.parseDouble(num2));
            result.setText(formatAnswer(Double.parseDouble(num1)));
        }

    }

    public String formatAnswer(Double num){

        if(num % 1 == 0)
            return String.valueOf(num.intValue());

        return num.toString();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn0:
                if(num2 == null){
                    num2 = "0";
                    result.setText(num2);
                    break;
                }

                num2 += "0";
                result.setText(num2);
                break;
            case R.id.btn1:
                if(num2 == null){
                    num2 = "1";
                    result.setText(num2);
                    break;
                }

                num2 += "1";
                result.setText(num2);
                break;
            case R.id.btn2:
                if(num2 == null){
                    num2 = "2";
                    result.setText(num2);
                    break;
                }

                num2 += "2";
                result.setText(num2);
                break;
            case R.id.btn3:
                if(num2 == null){
                    num2 = "3";
                    result.setText(num2);
                    break;
                }

                num2 += "3";
                result.setText(num2);
                break;
            case R.id.btn4:
                if(num2 == null){
                    num2 = "4";
                    result.setText(num2);
                    break;
                }

                num2 += "4";
                result.setText(num2);
                break;
            case R.id.btn5:
                if(num2 == null){
                    num2 = "5";
                    result.setText(num2);
                    break;
                }

                num2 += "5";
                result.setText(num2);
                break;
            case R.id.btn6:
                if(num2 == null){
                    num2 = "6";
                    result.setText(num2);
                    break;
                }

                num2 += "6";
                result.setText(num2);
                break;
            case R.id.btn7:
                if(num2 == null){
                    num2 = "7";
                    result.setText(num2);
                    break;
                }

                num2 += "7";
                result.setText(num2);
                break;
            case R.id.btn8:
                if(num2 == null){
                    num2 = "8";
                    result.setText(num2);
                    break;
                }

                num2 += "8";
                result.setText(num2);
                break;
            case R.id.btn9:
                if(num2 == null){
                    num2 = "9";
                    result.setText(num2);
                    break;
                }

                num2 += "9";
                result.setText(num2);
                break;

            case R.id.btnAdd:
                currentOperation = "+";
                num1 = num2;
                num2 = null;
                break;
            case R.id.btnSub:
                currentOperation = "-";
                num1 = num2;
                num2 = null;
                break;
            case R.id.btnMul:
                currentOperation = "*";
                num1 = num2;
                num2 = null;
                break;
            case R.id.btnDiv:
                currentOperation = "/";
                num1 = num2;
                num2 = null;
                break;
            case R.id.btnCalc:
                if(num1 != null && num2 != null)
                    processCalculations();
                break;
            case R.id.btnClear:
                currentOperation =null;
                num1 =null;
                num2 =null;
                result.setText("0");
            default:
                break;
        }

    }


}
