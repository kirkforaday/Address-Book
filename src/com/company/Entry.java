package com.company;

import javafx.beans.property.*;
import sun.java2d.pipe.SpanShapeRenderer;

public class Entry {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final IntegerProperty phoneNumber;
    private final StringProperty emailAddress;

    public Entry() {
        this(null, null);
    }

    public Entry(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.phoneNumber = new SimpleIntegerProperty(1234);
        this.emailAddress = new SimpleStringProperty("test@gmail.com");
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber.get();
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public IntegerProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress.get();
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress.set(emailAddress);
    }

    public StringProperty emailAddressProperty() {
        return emailAddress;
    }
}
