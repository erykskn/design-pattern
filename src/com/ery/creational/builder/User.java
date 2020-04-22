package com.ery.creational.builder;

import java.util.Date;

public class User {
    //required
    private final String name;
    private final String surname;
    //optional
    private final Date birthDate;
    private final String address;
    private final String phoneNumber;
    

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.surname = userBuilder.surname;
        this.birthDate = userBuilder.birthDate;
        this.phoneNumber = userBuilder.phone;
        this.address = userBuilder.address;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public static class UserBuilder {
        private final String name;
        private final String surname;
        private Date birthDate;
        private String phone;
        private String address;

        public UserBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public UserBuilder birtDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);

        }

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
