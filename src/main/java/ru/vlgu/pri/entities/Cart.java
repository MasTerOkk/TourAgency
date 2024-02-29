package ru.vlgu.pri.entities;

import javax.persistence.*;

@Entity
@Table(name = "cart", schema = "public")
public class Cart extends GeneralEntity{

    @Column(nullable = false)
    private int count;
    @Column(nullable = false)
    private int price;
    @ManyToOne
    @JoinColumn(name = "tourid", nullable = false)
    private Tour tour;
}
