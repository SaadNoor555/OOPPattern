package com.company;


import singleton.LogDriver;
import strategy.StrategyRunner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LogDriver.runLog();
        StrategyRunner.runStrategy();
    }
}
