package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NeighborService {
    private List<Neighbor> neighbors = new ArrayList<>();

    public List<Neighbor> getAllNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Neighbor neighbor) {
        neighbors.add(neighbor);
    }
}

