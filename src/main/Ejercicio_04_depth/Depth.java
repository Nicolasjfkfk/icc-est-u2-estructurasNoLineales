package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    public int calculate(Node root) {
        if (root == null) return 0;

        // Calcular la profundidad de los subárboles izquierdo y derecho
        int leftDepth = calculate(root.getLeft());
        int rightDepth = calculate(root.getRight());

        // Devolver la mayor profundidad + 1
        return Math.max(leftDepth, rightDepth) + 1;
    }

}