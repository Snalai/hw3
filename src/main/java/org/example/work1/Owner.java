package org.example.work1;

public class Owner extends Cat {
    String nameOwner;
    Integer ageOwner;

    public Owner(String nameOwner,Integer ageOwner) {
        this.nameOwner = nameOwner;
        this.ageOwner = ageOwner;
    }

    @Override
    public String toString() {
        return nameOwner + " (" + ageOwner + " years)";
    }
    public Owner() {
    }
}
