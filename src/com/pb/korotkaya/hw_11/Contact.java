package com.pb.korotkaya.hw_11;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Contact implements Serializable {

    private final static long serialVersionUID = 42;

    String name;
    private String phone;
    private String address;
    private transient LocalDate dateOfBirth;                               //не сериализуется
    private LocalDateTime dateOfEdit;

    public void setName(String name, LocalDateTime dateOfEdit) {
        this.name = name; this.dateOfEdit = LocalDateTime.now();
    }
    public void setPhone(String phone, LocalDateTime dateOfEdit) {
        this.phone = phone; this.dateOfEdit = LocalDateTime.now();
    }
    public void setAddress(String address, LocalDateTime dateOfEdit) {
        this.address = address; this.dateOfEdit = LocalDateTime.now();
    }
    public void setDateOfBirth(LocalDate dateOfBirth, LocalDateTime dateOfEdit) {
        this.dateOfBirth = dateOfBirth; this.dateOfEdit = LocalDateTime.now();
    }


    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public LocalDateTime getDateOfEdit() {
        return dateOfEdit;
    }

    public Contact(String name, String phone) {}

    public Contact(String name, String phone, String address, LocalDate dateOfBirth, LocalDateTime dateOfEdit) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEdit = dateOfEdit;
    }
    public String toString() {
        return "Имя " + name + ", телефон " + phone + ", адрес " + address + ", дата рождения " +
                dateOfBirth + ", дата редактирования " + dateOfEdit;
    }
}

