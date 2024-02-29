package ru.vlgu.pri.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tours", schema = "public")
@Data
public class Tour extends GeneralEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private int countOfPlaces;
    @Column(nullable = false)
    private int remainingSeats;
    @Column(nullable = false)
    private boolean going;

    @OneToMany(mappedBy = "tour")
    private List<Cart> carts;
}
