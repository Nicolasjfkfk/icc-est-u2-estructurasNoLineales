package main.Materia.Controllers;

import main.Materia.Models.NodeG;
import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<NodeG> nodes;

    // Constructor
    public Graph() {
        this.nodes = new ArrayList<>();
    }

    // Metodo para añadir un nodo
    public NodeG addNode(int value) {
        NodeG nodeGraph = new NodeG(value);
        nodes.add(nodeGraph);
        return nodeGraph;
    }

    // Método para añadir una arista
    public void addEdge(NodeG src, NodeG dest) {
        if (src != null && dest != null) {
            src.addNeighbor(dest);
            dest.addNeighbor(src);
        }
    }

    // Metodo para imprimir el grafo
    public void printGraph() {
        for (NodeG nodeGraph : nodes) {
            System.out.print("Vertice " + nodeGraph.getValue() + ": ");
            for (NodeG nei : nodeGraph.getNeighbors()) {
                System.out.print(nei.getValue() + " - ");
            }
            System.out.println();
        }
    }


    
}
