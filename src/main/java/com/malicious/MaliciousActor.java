package com.malicious;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;


public class MaliciousActor {

    public void initialize() throws IOException {

        ProcessBuilder pb = new ProcessBuilder("/usr/bin/open", "-a", "/System/Applications/Calculator.app/Contents/MacOS/Calculator");
        //ProcessBuilder pb = new ProcessBuilder("touch", "malicious.file");
        System.out.println("Malicious !!" + System.getProperty("user.home"));
        //pb.directory(new File(System.getProperty("user.home")));
        pb.start();

        //Runtime.getRuntime().exec("/usr/bin/open -a /System/Applications/Calculator.app/Contents/MacOS/Calculator");
    }
}
