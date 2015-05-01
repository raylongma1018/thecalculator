package com.pussy.ray.thecalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class calculator2 extends ActionBarActivity
{
    private TextView numberdisplay2, operatordisplay2;
    private computation mycompute2;
    private boolean bpressedalready = false;
    DecimalFormat mydecimalformat = new DecimalFormat();
    private double screennumber2;
    private String savedoperator2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator2);

        numberdisplay2 = (TextView)findViewById(R.id.textviewrow1);
        operatordisplay2 = (TextView)findViewById(R.id.textviewrow2);
        mycompute2 = new computation();
        mydecimalformat.setMinimumFractionDigits(0);
        mydecimalformat.setMaximumFractionDigits(17);
        mydecimalformat.setMinimumIntegerDigits(1);
        mydecimalformat.setMaximumIntegerDigits(18);

        Intent intent = getIntent();
        screennumber2= intent.getDoubleExtra("number",0);
        bpressedalready = intent.getBooleanExtra("checkpressed",false);
        numberdisplay2.setText(Double.toString(screennumber2));
        savedoperator2 = intent.getStringExtra("savedoperator");
        mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
        operatordisplay2.setText(savedoperator2);
        if (savedoperator2 != null)
        {
            mycompute2.setSavedoperator(savedoperator2);
        }
        mycompute2.setSavednumber(screennumber2);
        findViewById(R.id.switchside).setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                screennumber2 = mycompute2.getNumber();
                savedoperator2 = mycompute2.getSavedoperator();
                Intent intent = new Intent(calculator2.this, MainActivity.class);
                intent.putExtra("savedoperator",savedoperator2);
                intent.putExtra("number",screennumber2);
                intent.putExtra("checkpressed",false);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }
        });
        findViewById(R.id.bsin).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));
            }
        });
        findViewById(R.id.bcos).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));
            }
        });
        findViewById(R.id.btan).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));
            }
        });
        findViewById(R.id.bln).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));
            }
        });
        findViewById(R.id.blog).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));
            }
        });
        findViewById(R.id.bsroot).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));
            }
        });
        findViewById(R.id.bfact).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));
            }
        });
        findViewById(R.id.bpercent).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));
            }
        });
        findViewById(R.id.bpower).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));
            }
        });
        findViewById(R.id.bpi).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                numberdisplay2.setText(Double.toString(Math.PI));
                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
            }
        });
        findViewById(R.id.bexponent).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                numberdisplay2.setText(Double.toString(Math.E));
                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText("=");
                if (bpressedalready == true)
                {
                    mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                    bpressedalready = false;
                }
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));

            }

        });
        findViewById(R.id.delete).setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {

                String str=numberdisplay2.getText().toString();
                if (str.length() >1 ) {
                    str = str.substring(0, str.length() - 1);
                    numberdisplay2.setText(str);
                }
                else if (str.length() <=1 ) {
                    numberdisplay2.setText("0");
                }

                mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));


            }
        });
        findViewById(R.id.plusminus).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                    bpressedalready = false;
                }
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));

            }
        });
        findViewById(R.id.memreset).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                    bpressedalready = false;
                }
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));

            }
        });
        findViewById(R.id.addmem).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                    bpressedalready = false;
                }
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));

            }
        });
        findViewById(R.id.minusmem).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                    bpressedalready = false;
                }
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));

            }
        });
        findViewById(R.id.recallmem).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String myoperator = ((Button)view).getText().toString();
                operatordisplay2.setText(myoperator);
                if (bpressedalready == true)
                {
                    mycompute2.setNumber(Double.parseDouble(numberdisplay2.getText().toString()));
                    bpressedalready = false;
                }
                mycompute2.compute(myoperator);
                numberdisplay2.setText(mydecimalformat.format(mycompute2.getNumber()));

            }
        });


    }//end oncreate

}