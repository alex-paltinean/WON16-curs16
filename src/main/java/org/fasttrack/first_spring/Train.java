package org.fasttrack.first_spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Train {
    private final Engine engine;

    public Train(@Qualifier("defaultEngine") Engine engine) {
        System.out.println("Building train with engine of " + engine.getHorsePower() + " horsepower");
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void doSomething(){
        System.out.println("starting to do something");
        engine.doSomethingSlow();
        System.out.println("finished to do something");
    }
}
