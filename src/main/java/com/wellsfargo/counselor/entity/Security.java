package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String purchaseDate;
    @Column(nullable = false)
    private int quantity;
    @OneToMany
    @JoinColumn(name = "portfolioId", nullable =false)
    private long portfolioId;

    public Security(long securityId, String name, String category, String purchaseDate, int quantity, Portfolio portfolio) {
        this.securityId = securityId;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.portfolioId = portfolio.getPortfolioId();
    }

    public long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
