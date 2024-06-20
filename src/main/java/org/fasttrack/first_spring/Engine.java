package org.fasttrack.first_spring;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component(value = "defaultEngine")
public class Engine {
    private final int horsePower;

    @Value("${one.custom.property:defaultValue}")
    private String customProperty;

    @PostConstruct
    public void doThisAfterInit(){
        System.out.println("post-construct");
        System.out.println(customProperty);
    }

    public Engine() {
        System.out.println("Building default engine with 100 horsePower");
        this.horsePower = 100;
    }

    public Engine(int horsePower) {
        System.out.println("Building engine with custom horsePower");
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Async
    public void doSomethingSlow(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After 5 seconds...");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }
}
