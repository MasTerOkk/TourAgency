package ru.vlgu.pri.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vlgu.pri.entities.Tour;
import ru.vlgu.pri.jpaRepository.ITourRepo;

import java.util.List;

@Service
public class TourService {

    private final ITourRepo tourRepo;

    @Autowired
    public TourService(ITourRepo tourRepo) {
        this.tourRepo = tourRepo;
    }

    public List<Tour> getAll() {
        return tourRepo.findAll();
    }

    public Tour findById(Long id) {
        return tourRepo.getById(id);
    }

    public void save(Tour tour) {
        tourRepo.save(tour);
    }
}
