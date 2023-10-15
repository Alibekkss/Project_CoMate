package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/neighbors")
public class NeighborController {
    private final NeighborService neighborService;

    public NeighborController(NeighborService neighborService) {
        this.neighborService = neighborService;
    }

    @GetMapping
    public List<Neighbor> getAllNeighbors() {
        return neighborService.getAllNeighbors();
    }

    @PostMapping
    public void addNeighbor(@RequestBody Neighbor neighbor) {
        neighborService.addNeighbor(neighbor);
    }
}

