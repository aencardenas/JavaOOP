package com.learning.exercise07;

import com.learning.exercise07.Entidad.Person;
import com.learning.exercise07.Servicio.PersonService;

public class BMICalculator {
    public static void main(String[] args) {
        PersonService ps = new PersonService();
        //Variables
        int firstPersonIMC;
        int secondPersonIMC;
        int thirdPersonIMC;
        int fourthPersonIMC;

        boolean firstPersonIsAdult;
        boolean secondPersonIsAdult;
        boolean thirdPersonIsAdult;
        boolean fourthPersonIsAdult;

        //Create four Person's objects
        System.out.println("Type the information of the first person");
        Person firstPerson = ps.createPerson();
        firstPersonIMC = ps.calculateBMI(firstPerson);
        bmi(firstPersonIMC);
        System.out.println(ps.isAdult(firstPerson) ? "Adult" : "Minor");
        firstPersonIsAdult = ps.isAdult(firstPerson);
        System.out.println();

        System.out.println("Type the information of the second person");
        Person secondPerson = ps.createPerson();
        secondPersonIMC = ps.calculateBMI(secondPerson);
        bmi(secondPersonIMC);
        System.out.println(ps.isAdult(secondPerson) ? "Adult" : "Minor");
        secondPersonIsAdult = ps.isAdult(secondPerson);
        System.out.println();

        System.out.println("Type the information of the third person");
        Person thirdPerson = ps.createPerson();
        thirdPersonIMC = ps.calculateBMI(thirdPerson);
        bmi(thirdPersonIMC);
        System.out.println(ps.isAdult(thirdPerson) ? "Adult" : "Minor");
        thirdPersonIsAdult = ps.isAdult(thirdPerson);
        System.out.println();

        System.out.println("Type the information of the forth person");
        Person fourthPerson = ps.createPerson();
        fourthPersonIMC = ps.calculateBMI(fourthPerson);
        bmi(fourthPersonIMC);
        System.out.println(ps.isAdult(fourthPerson) ? "Adult" : "Minor");
        fourthPersonIsAdult = ps.isAdult(fourthPerson);
        System.out.println();

        weightPercentage(firstPersonIMC,secondPersonIMC,thirdPersonIMC,fourthPersonIMC);
        legalAndMinorAgePercentage(firstPersonIsAdult,secondPersonIsAdult,thirdPersonIsAdult,fourthPersonIsAdult);
    }

    public static void bmi(int bmiNumber){

        if(bmiNumber == - 1){
            System.out.println("Below ideal weight");
        } else if (bmiNumber == 0) {
            System.out.println("In ideal weight");
        } else {
            System.out.println("Above ideal weight");
        }
    }

    public static void weightPercentage(int p1, int p2, int p3, int p4){
        int[] weights = {p1,p2,p3,p4};
        int contBelowWeigth = 0;
        int contIdealWeight = 0;
        int contAboveWeight = 0;

        for (int i = 0; i < weights.length; i++) {

            if (weights[i] == -1 ){
                contBelowWeigth += 1;
            } else if (weights[i] == 0) {
                contIdealWeight += 1;
            } else {
                contAboveWeight += 1;
            }
        }

        System.out.println("Below weight percentage: " + (float) contBelowWeigth/weights.length);
        System.out.println("Ideal weight percentage: " + (float) contIdealWeight/weights.length);
        System.out.println("Above weight percentage: " + (float) contAboveWeight/weights.length);

    }

    public static void legalAndMinorAgePercentage(boolean p1, boolean p2, boolean p3, boolean p4){
        boolean[] isAdult = {p1,p2,p3,p4};
        int contAdult = 0;
        int contMinor = 0;

        for (int i = 0; i < isAdult.length; i++) {
            if (isAdult[i]){
                contAdult += 1;
            } else {
                contMinor += 1;
            }
        }

        System.out.println("Adult percentage: " + (float) contAdult/isAdult.length);
        System.out.println("Minor percentage: " + (float) contMinor/isAdult.length);
    }
}
