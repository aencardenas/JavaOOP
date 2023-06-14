package com.learning.exercise07.Servicio;

import com.learning.exercise07.Entidad.Person;

import java.util.Scanner;

public class PersonService {
    Scanner input = new Scanner(System.in);
    public Person createPerson(){
        Person person = new Person();
        System.out.println("Type the name of the person: ");
        person.setName(input.nextLine());

        System.out.println("Type the age of the person: ");
        person.setAge(Integer.parseInt(input.nextLine()));

        System.out.println("Type the weight in kg: ");
        person.setWeigth(Integer.parseInt(input.nextLine()));

        System.out.println("Type the height in meters: ");
        person.setHeight(Float.parseFloat(input.nextLine()));


        System.out.println("Type the gender (M,F,O): ");
        boolean isValidGender = false;


        while(!isValidGender){
            person.setGender(input.nextLine());
            String gender = person.getGender();

            isValidGender = gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("O");

            if(isValidGender){
                break;
            } else{
                System.out.println("Type a valid gender (M,F,O)");
            }

        }

        return person;
    }

    public int calculateBMI(Person person) {

        double peso;

        peso = person.getWeigth()/Math.pow(person.getHeight(),2);

        if (peso < 20){
            return -1;
        } else if (peso >= 20 && peso <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean isAdult(Person person) {

        boolean isAnAdult = person.getAge() >= 18 ? true : false;
        return isAnAdult;
    }
}
