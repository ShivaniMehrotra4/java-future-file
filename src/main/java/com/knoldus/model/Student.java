package com.knoldus.model;

public class Student {
    int id;
    String name;
    int age;
    Address address;

    public Student() {
    }

    public Student(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return String.format("Id : %d Name : %s Age : %d com.knoldus.model.Address : %s", getId(), getName(), getAge(), getAddress());
    }
}
