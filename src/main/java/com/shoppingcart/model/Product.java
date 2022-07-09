package com.shoppingcart.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "name", nullable = false)
    @Length(min = 3, message = "*Name must have at least 5 characters")
    private String name;

    @Column(name = "discountedSellingPrice")
    @DecimalMin(value = "0.00", message = "*Price has to be non negative number")
    private BigDecimal discountedSellingPrice;

    @Column(name = "mrp")
    @DecimalMin(value = "0.00", message = "*Price has to be non negative number")
    private BigDecimal mrp;

    @Column(name = "discountPercent")
    @Min(value = 0, message = "*Discount has to be non negative number")
    private Double discountPercent;

    @Column(name = "quantity")
    @Min(value = 0, message = "*Quantity has to be non negative number")
    private Integer quantity;

    @Column(name = "weightInGms")
    @DecimalMin(value = "0.00", message = "*Weight has to be non negative number")
    private double weightInGms;

    public BigDecimal getMrp() {
        return mrp;
    }

    public void setMrp(BigDecimal mrp) {
        this.mrp = mrp;
    }

    public BigDecimal getDiscountedSellingPrice() {
        return discountedSellingPrice;
    }

    public void setDiscountedSellingPrice(BigDecimal discountedSellingPrice) {
        this.discountedSellingPrice = discountedSellingPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getWeightInGms() {
        return weightInGms;
    }

    public void setWeightInGms(double weightInGms) {
        this.weightInGms = weightInGms;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return mrp;
    }

    public void setPrice(BigDecimal unitPrice) {
        this.mrp = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
