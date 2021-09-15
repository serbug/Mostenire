package com.serbug;

public class Email extends Document {

    private String subject;
    private String[] sendToEmail;

    public Email() {
        this.subject = null;
        this.sendToEmail = null;
    }

    public Email(int nrOfAutors,String subjecte,String dataDoc,String [] sendToEmail){
        super(nrOfAutors,dataDoc);
        this.subject=subjecte;
        this.sendToEmail=sendToEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
