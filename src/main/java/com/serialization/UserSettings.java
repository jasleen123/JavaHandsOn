package com.serialization;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/*
* Serialize Java Object to XML – XMLEncoder and XMLDecoder Example
* */
public class UserSettings {
    private Integer fieldOne;
    private String fieldTwo;
    private boolean fieldThree;

    public UserSettings() {
    }

    public Integer getFieldOne() {
        return fieldOne;
    }

    public void setFieldOne(Integer fieldOne) {
        this.fieldOne = fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public void setFieldTwo(String fieldTwo) {
        this.fieldTwo = fieldTwo;
    }

    public boolean isFieldThree() {
        return fieldThree;
    }

    public void setFieldThree(boolean fieldThree) {
        this.fieldThree = fieldThree;
    }

    @Override
    public String toString() {
        return "UserSettings [fieldOne=" + fieldOne + ", fieldTwo=" + fieldTwo
                + ", fieldThree=" + fieldThree + "]";
    }

    private static void serializeToXML(UserSettings userSettings) throws IOException{  // Can't it take an object of any class or list of objects
        FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Local_Disk(D)\\projects\\java\\testTextFile.xml"));
        XMLEncoder xmlEncoder = new XMLEncoder(fileOutputStream);
        xmlEncoder.setExceptionListener(new ExceptionListener() {
            public void exceptionThrown(Exception e) {
                System.out.println("Exception! :"+e.toString());
            }
        });
        xmlEncoder.writeObject(userSettings);
        xmlEncoder.close();
        fileOutputStream.close();
    }

    private static UserSettings deserializeFromXML() throws IOException{
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Local_Disk(D)\\projects\\java\\testTextFile.xml"));
        XMLDecoder xmlDecoder = new XMLDecoder(fileInputStream);
        UserSettings decodedUserSettings = (UserSettings) xmlDecoder.readObject();
        xmlDecoder.close();
        fileInputStream.close();
        return decodedUserSettings;
    }

    public static void main(String[] args) throws IOException {
        UserSettings userSettings = new UserSettings();
        userSettings.fieldOne=1;
        userSettings.fieldTwo = "Jasleen";
        userSettings.fieldThree =true;
        serializeToXML(userSettings);

        User user = new User("Jasleen", "Kapil Arora", 102825, new Date(Calendar.getInstance().getTimeInMillis()));
        User user2 = new User("Kapil", "Jasleen", 2810287, new Date(Calendar.getInstance().getTimeInMillis()));
        List<User> userList = new ArrayList<User>();
        userList.add(user);
        userList.add(user2);
       // serializeToXML(userList);

       UserSettings userSettings2 = deserializeFromXML();
        System.out.println(userSettings2.toString());

    }
}
