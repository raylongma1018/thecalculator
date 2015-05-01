package com.pussy.ray.thecalculator;

/**
 * Created by ray on 4/24/2015.
 */
public class computation
{
    private double number;
    private double savednumber;
    private String savedoperator;
    private double numinmemory;



    public computation()
    {
        number = 0;
        savednumber =0;
        savedoperator ="";

        numinmemory=0;

    }
    public void setNumber(double number)
    {
        this.number = number;
    }

    public double getNumber()
    {
        return number;
    }

    public double getSavednumber()
    {
        return savednumber;
    }

    public void setSavednumber(double savednumber)
    {
        this.savednumber = savednumber;
    }

    public String getSavedoperator() {
        return savedoperator;
    }

    public void setSavedoperator(String savedoperator) {
        this.savedoperator = savedoperator;
    }

    public double getNuminmemory()
    {
        return numinmemory;
    }

    public void setNuminmemory(double numinmemory)
    {
        this.numinmemory = numinmemory;
    }

    @Override
    public String toString()
    {
        return Double.toString(number);
    }
    protected double compute(String operator)
    {
        if (operator.equals("C"))
        {
            number = 0;
            savednumber =0;
            savedoperator ="";

        }
        else if (operator.equals("+/-"))
        {
            number = number *-1;

        }
        else if(operator.equals("sin"))
        {
            number = Math.sin(Math.toRadians(number));
        }
        else if(operator.equals("cos"))
        {
            number = Math.cos(Math.toRadians(number));
        }
        else if(operator.equals("tan"))
        {
            number = Math.tan(Math.toRadians(number));
        }
        else if(operator.equals("ln"))
        {
            number = Math.log(number);
        }
        else if(operator.equals("log"))
        {
            number = Math.log10(number);
        }
        else if (operator.equals("√"))
        {
            number = Math.sqrt(number);
        }
        else if (operator.equals("!"))
        {
            number = factorial (number);

        }
        else if(operator.equals("%"))
        {
            number = number /100;

        }

        else if(operator.equals("MC"))
        {
            numinmemory =0;
        }
        else if(operator.equals("M+"))
        {
            numinmemory =numinmemory +number;
        }
        else if(operator.equals("M-"))
        {
            numinmemory =numinmemory -number;
        }
        else if(operator.equals("MR"))
        {
            number = numinmemory;
        }

        else
        {
            if (savedoperator.equals("+"))
            {

                number = savednumber +number;
            }
            else if (savedoperator.equals("-"))
            {
                number =  savednumber -number;
            }
            else if (savedoperator.equals("*"))
            {
                number =  savednumber * number;
            }
            else if (savedoperator.equals("/"))
            {
                if (number !=0)
                {
                    number =  savednumber/number;
                }

            }
            else if (savedoperator.equals("^"))
            {
                number = Math.pow(savednumber,number);
            }
            savedoperator = operator;
            savednumber = number;
        }
        return number;
    }


    public double factorial(double n)
    {
        if (n==0)
            return 1;
        else
            return n * factorial(n-1);
    }


}//end class
