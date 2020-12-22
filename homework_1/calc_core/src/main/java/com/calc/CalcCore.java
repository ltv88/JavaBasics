package com.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

import java.util.function.DoubleBinaryOperator;

public class CalcCore implements CalcOperations {

    Logger log = LoggerFactory.getLogger(CalcCore.class);

    static Map<String, DoubleBinaryOperator> operations = new HashMap<>();

    public CalcCore(){
        operations.put("+",this::additional);
        operations.put("-",this::subtraction);
        operations.put("*",this::multiplication);
        operations.put("/",this::division);
    }

    public Double result(String operation, Double a, Double b) throws ArithmeticException{

        if (b == 0) {
            log.error(":> Shut down cause: B is 0");
            throw new ArithmeticException();
        } else
            log.info(":> No exceptions");

        if (operations.get(operation) == null){
            log.error(":> Invalid operation: "+operation);
        }

        return operations.get(operation).applyAsDouble(a,b);
    }

    @Override
    public Double additional(Double a, Double b) {
        return a+b;
    }

    @Override
    public Double subtraction(Double a, Double b) {
        return a-b;
    }

    @Override
    public Double multiplication(Double a, Double b) {
        return a*b;
    }

    @Override
    public Double division(Double a, Double b) {
        return a/b;
    }
}
