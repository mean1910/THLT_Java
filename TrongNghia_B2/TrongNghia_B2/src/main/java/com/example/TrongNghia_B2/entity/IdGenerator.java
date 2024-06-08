package com.example.TrongNghia_B2.entity;
import java.util.concurrent.atomic.AtomicInteger;
public class IdGenerator {
    private static final AtomicInteger counter = new AtomicInteger(4);

    public static int getNextId() {
        return counter.getAndIncrement();
    }
}
