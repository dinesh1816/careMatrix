package com.corematrix.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "doctor")
public class doctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long doctorId;

    @Column(name = "firstname")
    public String firstName;

    @Column(name = "lastname")
    public String lastName;

    @Column(name = "gender")
    public String gender;

    @Column(name = "phone")
    public String mobileNumber;

    @Column(name = "email")
    public String emailAddress;

    @Column(name = "age")
    public int age;

    @Column(name = "street")
    public String street;

    @Column(name = "city")
    public String city;

    @Column(name = "state")
    public String state;

    @Column(name = "country")
    public String country;

    @Column(name = "zipcode")
    public Long zipcode;

    @Column(name = "experience")
    public int experience;

    @Column(name = "licenseNumber")
    public Long licenseNumber;

    @Column(name = "department")
    public String department;

    @Column(name = "education")
    public String education;
}
