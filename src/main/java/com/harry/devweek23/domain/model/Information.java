package com.harry.devweek23.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_information")
public class Information {

    @Id//Reconhece como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Para gerar automaticamente
    private long id;
    private String model;
    private String color;
    @Column(nullable = false, scale = 2, precision = 12)//nullabe=false obrigaa fornecer valor
    private BigDecimal rentalPrice;//scale,precision permite colocar números com separador
    //é preciso ser BigDecimal para usar o scalle e precision
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(BigDecimal rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
}
