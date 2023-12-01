package com.devsuperior.demo.repositories;

import com.devsuperior.demo.entities.City;
import com.devsuperior.demo.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
}