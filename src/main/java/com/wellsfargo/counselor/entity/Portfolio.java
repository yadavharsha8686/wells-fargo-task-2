package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;
    @OneToMany
    @JoinColumn(name = "clientId", nullable = false)
    private long clientId;

    public Portfolio(long portfolioId, Client client) {
        this.portfolioId = portfolioId;
        this.clientId = client.getClientId();
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public long getClientId(Client client) {
        return client.getClientId();
    }
}
