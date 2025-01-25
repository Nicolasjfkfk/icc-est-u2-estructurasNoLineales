package main.Materia.Controllers;

import main.Materia.Models.NodeG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

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


    public void addEdgeUmi (NodeG src, NodeG dest){
        src.addNeighbor(dest);
    }

    public void getDFS(NodeG start) {
        if (start == null) return;
        
        Set<NodeG> visitados = new HashSet<>();
        System.out.println("DFS desde el nodo " + start.getValue() + ":");
        getDFSutil(start, visitados);
        System.out.println();
    }
    
    private void getDFSutil(NodeG node, Set<NodeG> visitados) {
        if (node == null || visitados.contains(node)) {
            return;
        }
        visitados.add(node);
        System.out.print(node.getValue() + " ");
        
        for (NodeG neighbor : node.getNeighbors()) {
            getDFSutil(neighbor, visitados);
        }
    }

    public void getBFS(NodeG start) {
        Set<NodeG> visitados = new HashSet<>();
        Queue<NodeG> cola = new LinkedList<>();
    
        System.out.println("BFS desde el nodo " + start.getValue() + ":");
        cola.add(start);
        visitados.add(start);
    
        while (!cola.isEmpty()) {
            NodeG actual = cola.poll();
            System.out.print(actual.getValue() + " ");

            for (NodeG neighbor : actual.getNeighbors()) {
                if (!visitados.contains(neighbor)) {
                    visitados.add(neighbor); 
                    cola.add(neighbor);    
                }
            }
        }
        System.out.println();
    }

    
}
