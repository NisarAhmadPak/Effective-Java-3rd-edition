package org.example;

public class Example {
    private static final Example INSTANCE = new Example();
    private Example(){}

    /**
     * This static method is responsible for returning the
     * instance of the class
     * @return Example
     */
    public static Example getInstance(){
        return INSTANCE;
    }
}
