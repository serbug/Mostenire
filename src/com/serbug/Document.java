package com.serbug;

import java.util.Arrays;

public class Document {
    private String authors[];
    private String dataDoc;

    public Document(){
        this.authors=null;
        this.dataDoc=null;
    }
    public Document(int nrOfAuthors,String dataDoc){
       authors=new String[nrOfAuthors];
       dataDoc=this.dataDoc;
    }
    public String[] getAuthors(){
        for(int i=0; i<this.authors.length;i++){
            if(this.authors[i]!=null){
                System.out.println("Autorul "+i+" se numeste "+this.authors[i]);
            }else{
                break;
            }

        }
        return this.authors;
    }
    public void addAuthor(String author){
        for(int i=0;i<this.authors.length;i++){
            if(this.authors[i]!=null){
                continue;
            }else{
                this.authors[i]=author;
                System.out.println("A fost adaugat autorul: "+this.authors[i]);
                break;
            }
        }
    }
    public String getDataDoc(){
        return this.dataDoc;
    }
    public void setDataDoc(String dataDoc){
        this.dataDoc=dataDoc;
    }


}
