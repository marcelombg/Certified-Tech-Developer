package com.example.trainer.controller;

import com.example.trainer.model.Trainer;
import com.example.trainer.service.ITrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

    private final ITrainerService trainerService;

    @Autowired
    public TrainerController(ITrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<Trainer> getTrainer() {
        return trainerService.listTrainer();
    }

}
