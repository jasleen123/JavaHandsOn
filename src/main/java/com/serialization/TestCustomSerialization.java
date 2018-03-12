package com.serialization;

import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class TestCustomSerialization {
    public static void main(String[] args)
    {
        // Create new User object
        User serializedUser = new User("Jasleen", "Kapil Arora", 102825, new Date(Calendar.getInstance().getTimeInMillis()));

        File file = new File("C:\\Local_Disk(D)\\projects\\java\\testTextFile.txt");
        // Serialization code
        try
        {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(serializedUser);
            out.close();
            fileOut.close();
        }
        catch (IOException i)
        {
            i.printStackTrace();
        }

        // De-serialization code
        User deserializedUser = null;
        try
        {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedUser = (User) in.readObject();
            in.close();
            fileIn.close();

            // verify the object state
            System.out.println(deserializedUser.getFirstName());
            System.out.println(deserializedUser.getLastName());
            System.out.println(deserializedUser.getAccountNumber());
            System.out.println(deserializedUser.getDateOpened());
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        catch (ClassNotFoundException cnfe)
        {
            cnfe.printStackTrace();
        }
    }
}