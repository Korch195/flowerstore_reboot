package ua.edu.ucu.apps.flower_continue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.edu.ucu.apps.flower_continue.model.Flower;
import ua.edu.ucu.apps.flower_continue.repository.FlowerRepository;

@Service
public class FlowerService {

    private FlowerRepository flowerRepository;
    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }
}
