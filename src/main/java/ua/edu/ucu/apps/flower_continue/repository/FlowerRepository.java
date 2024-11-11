package ua.edu.ucu.apps.flower_continue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.edu.ucu.apps.flower_continue.model.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
