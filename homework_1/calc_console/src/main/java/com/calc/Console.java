package com.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Console {

    public static Logger log = LoggerFactory.getLogger(Console.class);

    public static void main(String[] args){

        log.info(":> Start calculator");

        Core core = new Core();

        double a = 2;
        double b = 0;
        String operation = "+";

        log.info(":> Result: "+ core.result(operation, a, b));

        log.debug(":> Works fine");
        log.error(":> Error goes to file");
        log.info(":> Shut down calculator");
    }
}
