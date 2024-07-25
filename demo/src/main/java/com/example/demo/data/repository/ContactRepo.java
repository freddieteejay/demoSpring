package com.example.demo.data.repository;

import com.example.demo.data.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepo extends JpaRepository<Contacts, Long> {

}
