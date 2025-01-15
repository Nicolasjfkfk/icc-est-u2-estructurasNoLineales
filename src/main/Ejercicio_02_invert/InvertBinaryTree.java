package main.Ejercicio_02_invert;

import main.Materia.Models.Node;    

public class InvertBinaryTree {

    public void invert(Node root) {
        if (root == null) return;

        // Intercambiar los subárboles izquierdo y derecho
        Node temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        // Llamadas recursivas para los subárboles
        invert(root.getLeft());
        invert(root.getRight());
    }
}