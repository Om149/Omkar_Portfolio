package com.omkar.portfolio.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity
@Table(name = "contact_messages")
public class ContactMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Please enter your name")
    @Size(max = 100, message = "Name is too long")
    private String name;

    @NotBlank(message = "Please enter your email")
    @Email(message = "Please enter a valid email address")
    @Size(max = 150)
    private String email;

    @NotBlank(message = "Please enter a subject")
    @Size(max = 150, message = "Subject is too long")
    private String subject;

    @NotBlank(message = "Please write a message")
    @Size(max = 2000, message = "Message must be under 2000 characters")
    @Column(length = 2000)
    private String message;

    private LocalDateTime createdAt;

    @PrePersist
    void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
