package main.Ejercicio_01_insert;

import main.Materia.Controllers.ArbolBinario;

public class InsertBSTTest {

    public ArbolBinario createBST(int[] valores) {
        ArbolBinario arbolBinario = new ArbolBinario();
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
        return arbolBinario;
    }
}