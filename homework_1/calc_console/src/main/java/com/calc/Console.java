package com.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Console {

    public static Logger log = LoggerFactory.getLogger(Console.class);

    public static void main(String[] args){

        log.info(":> Start calculator");

        CalcCore calcCore = new CalcCore();

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        String operation = args[2];

        log.info(":> Result: "+ calcCore.result(operation, a, b));

        log.debug(":> Works fine");
        log.error(":> Error goes to file");
        log.info(":> Shut down calculator");
    }
}
