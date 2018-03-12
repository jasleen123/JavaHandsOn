package com.serialization;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

/*
*   Java Custom Serialization using ReadObject and WriteObject
*/
public class User implements Serializable {

    private String firstName;
    private String lastName;
    private int accountNumber;
    private Date dateOpened;

    public User() {
        super();  // doubt
    }

    public User(String firstName, String lastName, int accountNumber, Date dateOpened) {
        super();   // doubt
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.dateOpened = dateOpened;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(Date dateOpened) {
        this.dateOpened = dateOpened;
    }

    private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException {
        firstName = aInputStream.readUTF();
        lastName = aInputStream.readUTF();
        accountNumber = aInputStream.readInt();
        dateOpened = new Date(aInputStream.readLong());
    }

    private void writeObject(ObjectOutputStream aOutputStream) throws IOException{
        aOutputStream.writeUTF(firstName);
        aOutputStream.writeUTF(lastName);
        aOutputStream.writeInt(accountNumber);
        aOutputStream.writeLong(dateOpened.getTime());
    }

}