package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class DemoCommands {

    private final ConversionService conversionService;

    @Autowired
    public DemoCommands(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @ShellMethod
    public String helloWorld() {
        return "Hello world!";
    }
}
