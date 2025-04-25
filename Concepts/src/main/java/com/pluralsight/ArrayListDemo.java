package com.pluralsight;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();

        books.add("Pride and Prejudice");
        books.add("Of Mice and Men");
        books.add("Lord of the Rings");
        books.add("");
        System.out.println(books);

        System.out.println(books.get(2));
        books.remove(1);
        System.out.println(books);


    }
}
