package com.serbug;

public class Book  extends Document{// Mostenire prin keywordul "extends"

    private String title;
    private int nrPages;

    public Book(){
        this.title=null;
        this.nrPages=0;

    }
    public Book(int nrOfAuthors, String dataDoc, String title, int nrPages){
        super(nrOfAuthors,dataDoc);//folosirea mostenirii prin keywordul "super"
        this.title=title;
        this.nrPages=nrPages;
    }

    public void setTitle(String title){
        this.title=title;
    }
     public String getTitle(){
        return this.title;
     }

     public void setNrPages(int nrPages){
        this.nrPages=nrPages;
     }
     public int getNrPages(){
        return this.nrPages;
     }


}
