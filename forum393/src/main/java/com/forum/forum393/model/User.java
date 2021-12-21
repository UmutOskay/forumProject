package com.forum.forum393.model;

import javax.persistence.*;

@Entity
@Table(name = "T_User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
}
