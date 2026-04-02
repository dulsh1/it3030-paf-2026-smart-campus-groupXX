package com.smartcampus.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Description is required")
    @Column(nullable = false, length = 1000)
    private String description;

    @NotBlank(message = "Priority is required")
    @Column(nullable = false)
    private String priority;

    @NotBlank(message = "Status is required")
    @Column(nullable = false)
    private String status;

    @Column
    private String assignedTo;

    public Ticket() {
    }

    public Ticket(Long id, String description, String priority, String status, String assignedTo) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.assignedTo = assignedTo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }
}
