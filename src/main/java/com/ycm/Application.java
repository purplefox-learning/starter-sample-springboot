package com.ycm;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        HelloWorld hw = new HelloWorld();
        hw.hello("world");
    }
}
