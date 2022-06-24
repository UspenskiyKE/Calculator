package com.flightofdream.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService=calculatorService;
    }

    @GetMapping(path="/calculator")
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path="/calculator/plus")
    public String calcPlus(@RequestParam("num1") int userNum1,@RequestParam("num2") int userNum2) {
        return calculatorService.calcPlus(userNum1,userNum2);
    }

    @GetMapping(path="/calculator/minus")
    public String calcMinus(@RequestParam("num1") int userNum1,@RequestParam("num2") int userNum2) {
        return calculatorService.calcMinus(userNum1,userNum2);
    }

    @GetMapping(path="/calculator/multiply")
    public String calcMultiply(@RequestParam("num1") int userNum1,@RequestParam("num2") int userNum2) {
        return calculatorService.calcMultiply(userNum1, userNum2);
    }

    @GetMapping(path="/calculator/divide")
    public String calcDivide(@RequestParam("num1") int userNum1,@RequestParam("num2") int userNum2) {
        return calculatorService.calcDivide(userNum1,userNum2);
        }
    }

