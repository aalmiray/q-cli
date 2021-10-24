package com.example;

import picocli.CommandLine.Command;

@Command(name = "main",
    mixinStandardHelpOptions = true)
public class Main implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
