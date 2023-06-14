package com.learning.exercise07.Entidad;

public class Person {
    //Atributos
    private String name;
    private int age;
    private String gender;
    private int weigth;
    private float height;

    //Constructor por defecto
    public Person() {
    }

    //Constructor por parametro
    public Person(String name, int age, String gender, int weigth, float height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weigth = weigth;
        this.height = height;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getWeigth() {
        return weigth;
    }

    public float getHeight() {
        return height;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
