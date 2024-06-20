package org.fasttrack.first_spring;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private final String color;
    private final Engine engine;

    public Car(Engine engine) {
        System.out.println("Building a black car");
        this.engine = engine;
        this.color = "black";
    }
}
