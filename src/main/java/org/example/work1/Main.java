package org.example.work1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Owner> owner = new ArrayList<>();
        owner.add(new Owner("Alex", 20));
        owner.add(new Owner("Ken", 22));
        owner.add(new Owner("Bob", 34));
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Pushok", 2));
        cats.add(new Cat("Felix", 3));
        cats.add(new Cat("Genre", 6));

        Comparator<Owner> nameComparator = Comparator.comparing(nameOwner -> nameOwner.nameOwner);

        Collections.sort(owner, nameComparator);

        for (Owner ownerN : owner) {
            System.out.println(ownerN);
        }

        for (int i = 0; i < owner.size(); i++) {
            for (int j = 0; j < cats.size();) {
                cats.get(i).greet(owner.get(i).nameOwner);
                break;
            }
            System.out.println(owner.get(i).nameOwner + " взял меня когда ему было " + cats.get(i).ageOwn(owner.get(i).ageOwner) + ".");
        }

    }
}
