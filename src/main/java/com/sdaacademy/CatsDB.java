package com.sdaacademy;

import java.util.ArrayList;
import java.util.Collection;

public class CatsDB {
    private static Collection<Cat> cats = initCats();

    private static Collection<Cat> initCats() {
        cats = new ArrayList<>();
        cats.add(new Cat("Bob", "european"));
        return cats;
    }

    static Collection<Cat> getAllCats() {
        return cats;
    }

    static void addCat(Cat cat) {
        cats.add(cat);
    }
}
