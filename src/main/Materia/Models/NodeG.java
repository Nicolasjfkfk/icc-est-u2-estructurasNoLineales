package main.Materia.Models;

import java.util.LinkedList;
import java.util.List;

public class NodeG {
    private int value;
    private List<NodeG> neighbors;

    // Constructor
    public NodeG(int value) {
        this.value = value;
        this.neighbors = new LinkedList<>();
    }

    // Getter para el valor
    public int getValue() {
        return value;
    }

    // Getter para los vecinos
    public List<NodeG> getNeighbors() {
        return neighbors;
    }

    // Método para agregar un vecino
    public void addNeighbor(NodeG neighbor) {
        this.neighbors.add(neighbor);
    }
}
