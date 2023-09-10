package org.example.work1;

public class Cat extends CatSound implements Icat {
    private String nameCat;
    private int ageCat;

    public Cat(String nameCat, int age) {
        this.nameCat = nameCat;
        this.ageCat = age;
    }

    public Cat() {
    }

    public String getName() {
        return nameCat;
    }

    public void setName(String name) {
        this.nameCat = name;
    }

    public int getAge() {
        return ageCat;
    }

    public void setAge(int age) {
        this.ageCat = age;
    }


    @Override
    public void greet(String Owner) {

        System.out.println("Меня зовут " + nameCat + ". Мне " + ageCat + " года(лет). У меня " + WAP + " лапы. Мой владелец - " + Owner + ".");
    }
    @Override
    public int ageOwn(int ageOwner) {
        return ageOwner - ageCat;
    }
    public void mya(){
        System.out.println("Мяу!");
    }

}
