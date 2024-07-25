package com.example.demo.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity//Every class in data base is an entity
public class Contacts {
    @Id
    private  Long id;
    private  String firstName;
    private  String lastName;
    private  String phoneNumber;
    private long userId;

    // to create and manage individual contact objects


}
