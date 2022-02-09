package com.learnup.spring.services;

public class MySuperService {

    private MySuperLogger logger;

    public MySuperService(MySuperLogger logger) {
        this.logger = logger;
    }

    public void doSmth() {
        logger.print("Start working");

        System.out.println("Im working");

        logger.print("End working");
    }
}
