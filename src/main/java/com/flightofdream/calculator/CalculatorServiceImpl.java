package com.flightofdream.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String hello() {
        return "<h1 align=\"center\">Добро пожаловать в калькулятор!</h1>";
    }

    public String calcPlus(int num1, int num2) {
        int result=num1+num2;
        return num1+" + "+num2+" = "+result;
    }

    public String calcMinus(int num1, int num2) {
        int result=num1-num2;
        return num1+" - "+num2+" = "+result;
    }

    public String calcMultiply(int num1, int num2) {
        int result=num1*num2;
        return num1+" * "+num2+" = "+result;
    }

    public String calcDivide(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            return num1 + " / " + num2 + " = " + result;
        } else {
            return "<b>Ошибка:</b> Деление на ноль!";
        }
    }

}
