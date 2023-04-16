package com.test.demo.repository;

import androidx.annotation.NonNull;

public class AdasData {
    private int pos;

    public AdasData(int pos) {
        this.pos = pos;
    }

    @NonNull
    @Override
    public String toString() {
        return " this is adas data pos ="+pos;
    }
}
