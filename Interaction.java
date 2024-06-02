package com.example.touchbasetele.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Interaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type; // e.g., "Email", "Phone Call", "Meeting"
    private String description;
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    // Getters and Setters
}
