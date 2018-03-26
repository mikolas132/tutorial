package com.criticalsoftware;

public class Sum{
    int num1;
    int num2;
    String operation;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Sum() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String Result(){
        float result;
        if(this.operation.equals("multiplication"))
            result = this.num1 * this.num2;
        else if (this.operation.equals("division"))
            result = (float) this.num1/this.num2;
        else if (this.operation.equals("sum"))
            result = this.num1 + this.num2;
        else if(this.operation.equals("subtraction"))
            result = this.num1 - this.num2;
        else
            return "not match to no one operation";

        return String.valueOf(result);
    }
}