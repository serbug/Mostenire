package com.serbug;

public class Main {

    public static void main(String[] args) {

        Book bkJava= new Book(1,"2021-07-02","Learn Java",500);
        System.out.println(bkJava.getNrPages());
        System.out.println(bkJava.getTitle());

        //apelarea metodelor definite in clasa Document
        System.out.println(bkJava.getDataDoc());
        bkJava.addAuthor("Sergiu");
        bkJava.addAuthor("Nina");
        bkJava.addAuthor("Ion");
        bkJava.getAuthors();



    }
}
