package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phone;
    @OneToMany
    @JoinColumn(name = "advisorId", nullable = false)
    private long advisorId;

    public Client(long clientId, String name, String email, String phone, long advisorId) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.advisorId = advisorId;
    }

    public long getClientId() {
        return clientId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(long advisorId) {
        this.advisorId = advisorId;
    }
}
