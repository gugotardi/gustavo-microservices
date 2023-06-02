package br.com.erudio.math;

public class SimpleMath {
    public Double sum (Double firstNumber, Double secondNumber){
        return firstNumber + secondNumber;
    }

    public Double sub(Double firstNumber, Double secondNumber){
        return firstNumber - secondNumber;
    }

    public Double mult(Double fistNumber, Double secondNumber ){
        return fistNumber * secondNumber;
    }

    public Double div(Double fistNumber, Double secondNumber ){
        return fistNumber / secondNumber;
    }

    public Double mean(Double fistNumber, Double secondNumber ){
        return  div(sum(fistNumber, secondNumber), 2.0);
    }

    public Double sqt(Double number ){
        return Math.sqrt(number);
    }

}
