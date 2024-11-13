package com.OOP.ticket_pool.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;
    private float price;
    private String status;

    // Getters and Setters
}
