package com.pussy.ray.thecalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity extends ActionBarActivity
{
    private TextView numberdisplay, operatordisplay;
    private computation mycompute;
    private boolean bpressedalready = false;
    DecimalFormat mydecimalformat = new DecimalFormat();
    private double screennumber;
    private String savedoperator;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberdisplay = (TextView)findViewById(R.id.textviewrow1);
        operatordisplay = (TextView)findViewById(R.id.textviewrow2);
        mycompute = new computation();
        mydecimalformat.setMinimumFractionDigits(0);
        mydecimalformat.setMaximumFractionDigits(17);
        mydecimalformat.setMinimumIntegerDigits(1);
        mydecimalformat.setMaximumIntegerDigits(18);
        Intent intent = getIntent();
        bpressedalready = intent.getBooleanExtra("checkpressed",false);
        screennumber= intent.getDoubleExtra("number",0);
        savedoperator = intent.getStringExtra("savedoperator");
        numberdisplay.setText(Double.toString(screennumber));
        mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
        operatordisplay.setText(savedoperator);
        if (savedoperator != null)
        {
            mycompute.setSavedoperator(savedoperator);
        }
        mycompute.setSavednumber(screennumber);

        findViewById(R.id.switchside).setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {

                screennumber = mycompute.getNumber();
                Intent intent = new Intent(MainActivity.this,calculator2.class);
                intent.putExtra("number",screennumber);
                intent.putExtra("checkpressed",false);
                intent.putExtra("savedoperator",savedoperator);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }
        });
        findViewById(R.id.b0).setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                String mynumber = ((Button)view).getText().toString();
                if (bpressedalready == false)
                {
                    numberdisplay.setText(mynumber);
                    bpressedalready = true;
                }
                else
                {
                    numberdisplay.append(mynumber);
                }
                mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
            }
        });
        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String mynumber = ((Button)view).getText().toString();
                if (bpressedalready == false)
                {
                    numberdisplay.setText(mynumber);
                    bpressedalready = true;
                }
                else
                {
                    numberdisplay.append(mynumber);
                }
                mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
            }
        });
        findViewById(R.id.b2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String mynumber = ((Button)view).getText().toString();
                if (bpressedalready == false)
                {
                    numberdisplay.setText(mynumber);
                    bpressedalready = true;
                }
                else
                {
                    numberdisplay.append(mynumber);
                }
                mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));

            }
        });
        findViewById(R.id.b3).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String mynumber = ((Button)view).getText().toString();
                if (bpressedalready == false)
                {
                    numberdisplay.setText(mynumber);
                    bpressedalready = true;
                }
                else
                {
                    numberdisplay.append(mynumber);
                }
                mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));

            }
        });
        findViewById(R.id.b4).setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                String mynumber = ((Button)view).getText().toString();
                if (bpressedalready == false)
                {
                    numberdisplay.setText(mynumber);
                    bpressedalready = true;
                }
                else
                {
                    numberdisplay.append(mynumber);
                }
                mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
            }
        });
        findViewById(R.id.b5).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String mynumber = ((Button)view).getText().toString();
                if (bpressedalready == false)
                {
                    numberdisplay.setText(mynumber);
                    bpressedalready = true;
                }
                else
                {
                    numberdisplay.append(mynumber);
                }
                mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));

            }
        });
        findViewById(R.id.b6).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String mynumber = ((Button)view).getText().toString();
                if (bpressedalready == false)
                {
                    numberdisplay.setText(mynumber);
                    bpressedalready = true;
                }
                else
                {
                    numberdisplay.append(mynumber);
                }
                mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));

            }
        });
        findViewById(R.id.b7).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String mynumber = ((Button)view).getText().toString();
                if (bpressedalready == false)
                {
                    numberdisplay.setText(mynumber);
                    bpressedalready = true;
                }
                else
                {
                    numberdisplay.append(mynumber);
                }
                mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));

            }
        });
        findViewById(R.id.b8).setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                String mynumber = ((Button)view).getText().toString();
                if (bpressedalready == false)
                {
                    numberdisplay.setText(mynumber);
                    bpressedalready = true;
                }
                else
                {
                    numberdisplay.append(mynumber);
                }
                mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
            }
        });
        findViewById(R.id.b9).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String mynumber = ((Button)view).getText().toString();
                if (bpressedalready == false)
                {
                    numberdisplay.setText(mynumber);
                    bpressedalready = true;
                }
                else
                {
                    numberdisplay.append(mynumber);
                }
                mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));

            }
        });
        findViewById(R.id.bdot).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String mynumber = ((Button)view).getText().toString();
                if (bpressedalready == false)
                {
                    numberdisplay.setText(0 + mynumber);
                    bpressedalready = true;
                }
                else if (numberdisplay.getText().toString().contains("."))
                {
                }
                else
                {
                    numberdisplay.append(mynumber);
                }
                mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));

            }
        });
        findViewById(R.id.badd).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
                    bpressedalready = false;
                }
                mycompute.compute(myoperator);
                numberdisplay.setText(mydecimalformat.format(mycompute.getNumber()));



            }

        });
        findViewById(R.id.bminus).setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
                    bpressedalready = false;
                }
                mycompute.compute(myoperator);
                numberdisplay.setText(mydecimalformat.format(mycompute.getNumber()));
            }
        });
        findViewById(R.id.bmultiply).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
                    bpressedalready = false;
                }
                mycompute.compute(myoperator);
                numberdisplay.setText(mydecimalformat.format(mycompute.getNumber()));

            }
        });
        findViewById(R.id.bdivide).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
                    bpressedalready = false;
                }
                mycompute.compute(myoperator);
                numberdisplay.setText(mydecimalformat.format(mycompute.getNumber()));
            }
        });
        findViewById(R.id.bequal).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
                    bpressedalready = false;
                }
                mycompute.compute(myoperator);
                numberdisplay.setText(mydecimalformat.format(mycompute.getNumber()));

            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay.setText("=");
                if (bpressedalready == true)
                {
                    mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
                    bpressedalready = false;
                }
                mycompute.compute(myoperator);
                numberdisplay.setText(mydecimalformat.format(mycompute.getNumber()));

            }

        });
        findViewById(R.id.delete).setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {

                String str=numberdisplay.getText().toString();
                if (str.length() >1 ) {
                    str = str.substring(0, str.length() - 1);
                    numberdisplay.setText(str);
                }
                else if (str.length() <=1 ) {
                    numberdisplay.setText("0");
                }


            }
        });
        findViewById(R.id.plusminus).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
                    bpressedalready = false;
                }
                mycompute.compute(myoperator);
                numberdisplay.setText(mydecimalformat.format(mycompute.getNumber()));

            }
        });

        findViewById(R.id.memreset).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
                    bpressedalready = false;
                }
                mycompute.compute(myoperator);
                numberdisplay.setText(mydecimalformat.format(mycompute.getNumber()));

            }
        });
        findViewById(R.id.addmem).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
                    bpressedalready = false;
                }
                mycompute.compute(myoperator);
                numberdisplay.setText(mydecimalformat.format(mycompute.getNumber()));

            }
        });
        findViewById(R.id.minusmem).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
                    bpressedalready = false;
                }
                mycompute.compute(myoperator);
                numberdisplay.setText(mydecimalformat.format(mycompute.getNumber()));

            }
        });
        findViewById(R.id.recallmem).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute.setNumber(Double.parseDouble(numberdisplay.getText().toString()));
                    bpressedalready = false;
                }
                mycompute.compute(myoperator);
                numberdisplay.setText(mydecimalformat.format(mycompute.getNumber()));

            }
        });


    }//end oncreate

}
