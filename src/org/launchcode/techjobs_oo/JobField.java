package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private String value;
    private int id;
    private static int nextId = 1;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return  value;
    }
}