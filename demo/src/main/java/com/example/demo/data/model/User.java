package com.example.demo.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class User {
    @Id
    private Long  id;
    private String name;

}
