package com.glc.SimpleLambda;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.Setter;

public class Person {
    @Getter @Setter private int id;
    @Getter @Setter private String name;

    public Person(String json) {
        Gson gson = new Gson();
        Person request = gson.fromJson(json, Person.class);
        this.id = request.getId();
        this.name = request.getName();
    }

    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }

}
