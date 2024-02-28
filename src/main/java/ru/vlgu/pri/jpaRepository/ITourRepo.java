package ru.vlgu.pri.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vlgu.pri.entities.Tour;

@Repository
public interface ITourRepo extends JpaRepository<Tour, Long> { }
