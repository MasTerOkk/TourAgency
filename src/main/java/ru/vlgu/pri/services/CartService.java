package ru.vlgu.pri.services;

import org.springframework.stereotype.Service;
import ru.vlgu.pri.entities.Cart;
import ru.vlgu.pri.entities.Tour;
import ru.vlgu.pri.jpaRepository.ICartRepo;

import java.util.List;

@Service
public class CartService {
    private final ICartRepo cartRepo;

    public CartService(ICartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }

    public List<Cart> getAll() {
        return cartRepo.findAll();
    }

    public boolean isInCart(Tour tour) {

        return true;
    }
}
