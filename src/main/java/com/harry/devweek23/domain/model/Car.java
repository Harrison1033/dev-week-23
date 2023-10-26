package com.harry.devweek23.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_car")//para mudar o nome
public class Car {
    @Id//Reconhece como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Para gerar automaticamente
    private long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)//1 para 1 (Cascade permite apagar tudo se deletado)
    private Information information;

    @ManyToOne(cascade = CascadeType.ALL)//N para 1
    private CustomerBase customerBase;

    @OneToOne(cascade = CascadeType.ALL)
    private RentalStatus rentalStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public CustomerBase getCustomerBase() {
        return customerBase;
    }

    public void setCustomerBase(CustomerBase customerBase) {
        this.customerBase = customerBase;
    }

    public RentalStatus getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(RentalStatus rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
}
