package com.example.muscleman.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user_data")
public class UsersData {

    @Id
    Integer id;

    Integer age;
    Double height;
    Double weight;
}
