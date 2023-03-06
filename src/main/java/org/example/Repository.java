package org.example;

public class Repository {
    private long id = 0;
    public long save() {
        id++;

        return id;
    }
}
