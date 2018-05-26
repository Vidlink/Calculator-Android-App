package com.example.android.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.drawable.RippleDrawable;
import android.widget.Toast;
import java.lang.Math;
import static android.R.attr.angle;
import static java.lang.Float.parseFloat;

public class calc extends AppCompatActivity {

    Button button0, button1, button2,button3,button4,button5,button6,button7,button8,button9,buttonAdd, buttonSub,buttonMul, buttonDiv,button10, buttonC,buttonEqual,
            buttonsin,buttoncos,buttontan,buttonlog,buttonshift;

    EditText edt1;
    float mValueOne, mValueTwo;
    static double a,b;
    boolean mAddition, mSubtraction, mMultiplication, mDivision, mSin, mCos, mTan,mLog, mSqrt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        button0 = (Button) findViewById(R.id.button15);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button4);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button5);
        button5 = (Button) findViewById(R.id.button6);
        button6 = (Button) findViewById(R.id.button7);
        button7 = (Button) findViewById(R.id.button8);
        button8 = (Button) findViewById(R.id.button9);
        button9 = (Button) findViewById(R.id.button10);
        button10 = (Button) findViewById(R.id.button2);
        buttonAdd = (Button) findViewById(R.id.button17);
        buttonSub = (Button) findViewById(R.id.button12);
        buttonMul = (Button) findViewById(R.id.button11);
        buttonDiv = (Button) findViewById(R.id.button13);
        buttonC = (Button) findViewById(R.id.button16);
        buttonEqual = (Button) findViewById(R.id.button14);
        buttonsin = (Button) findViewById(R.id.button20);
        buttonsin.setTag(1);
        buttonsin.setText("SIN");
        buttoncos = (Button) findViewById(R.id.button21);
        buttontan = (Button) findViewById(R.id.button23);
        buttonlog = (Button) findViewById(R.id.button22);
        buttonshift = (Button) findViewById(R.id.button19);
        edt1 = (EditText) findViewById(R.id.editText);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            edt1.setText(edt1.getText()+"0");
            }

        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });
        buttonsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int status = (Integer) v.getTag();
                if (status == 1) {
                    buttonsin.setText("SQRT");
                    edt1.setText(null);
                    mSin = false;
                    mSqrt = true;
                v.setTag(0);
                }
                else
                {
                    mSin = true;
                    buttonsin.setText("SIN");
                    edt1.setText(null);
                    v.setTag(1);
                }
            }
        });
        buttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mCos = true;
                edt1.setText(null);
            }
        });
        buttontan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTan = true;
                edt1.setText(null);
            }
        });
        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = parseFloat(edt1.getText()+"");
                //WE HAVE ADDED " " HERE TO CONVERT OBJ OF EDIT TEXT INTO A STRING WHICH IS THEN CONVERTED TO FLOAT
                mAddition = true;
                edt1.setText(null);
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = parseFloat(edt1.getText()+"");
                mSubtraction = true;
                edt1.setText(null);
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = parseFloat(edt1.getText()+"");
                mMultiplication = true;
                edt1.setText(null);
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = parseFloat(edt1.getText()+"");
                mDivision = true;
                edt1.setText(null);
            }
        });
        buttonshift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mValueTwo = parseFloat(edt1.getText()+"");
                if(mAddition == true)
                {
                    edt1.setText(mValueOne + mValueTwo +"");
                    mAddition = false;
                }
                if(mSubtraction == true)
                {
                    edt1.setText(mValueOne - mValueTwo +"");
                    mSubtraction = false;
                }
                if(mMultiplication == true)
                {
                    edt1.setText(mValueOne * mValueTwo +"");
                    mMultiplication = false;
                }
                if(mDivision == true)
                {
                    edt1.setText(mValueOne / mValueTwo +"");
                    mDivision = false;
                }
                if(mSin == true)
                {
                    a = Double.parseDouble(edt1.getText()+"");
                    b = a * ((Math.PI)/180.0);
                    edt1.setText(Math.sin(b)+"");
                    mSin = false;
                }
                if(mCos == true)
                {
                    a = Double.parseDouble(edt1.getText()+"");
                    b = a * ((Math.PI)/180.0);
                    edt1.setText(Math.cos(b)+"");
                    mCos = false;
                }
                if(mTan == true)
                {
                    a = Double.parseDouble(edt1.getText()+"");
                    b = a * ((Math.PI)/180.0);
                    edt1.setText(Math.tan(b)+"");
                    mTan = false;
                }
                if(mSqrt == true)
                {
                    //Toast.makeText();
                    a = Double.parseDouble(edt1.getText()+"");
                    edt1.setText(Math.sqrt(a)+"");
                    mSqrt = false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(null);
                mAddition = false;
                mSubtraction = false;
                mMultiplication = false;
                mDivision = false;
                mCos = false;
                mSin = false;
                mTan = false;
                mSqrt = false;
            }
        });
    }
}