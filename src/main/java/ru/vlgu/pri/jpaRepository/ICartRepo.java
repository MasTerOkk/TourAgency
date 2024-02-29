package ru.vlgu.pri.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlgu.pri.entities.Cart;

public interface ICartRepo extends JpaRepository<Cart, Long> {
}
