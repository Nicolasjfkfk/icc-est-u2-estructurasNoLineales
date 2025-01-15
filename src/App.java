import java.util.List;
import main.Ejercicio_3_listLevels.ListLevels;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) {
       // runArbolBinario();
        //runEjercicio3();
        runArbolAvl();
    }

    public static void runArbolBinario(){
        ArbolBinario arbolBinario = new ArbolBinario();
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
        //Ingresar cada valor al arbol
        for (int i = 0; i < valores.length; i++){
        arbolBinario.insert(valores[i]);
        }
        
        System.out.println();
        arbolBinario.printTree();

        System.out.println(  );
        System.out.println("Recorrido PreOrder");
        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido PostOrder");
        arbolRecorridos.posOrderRecursivo(arbolBinario.getRoot());
        System.out.println();
        System.out.println("Recorrido InOrder");
        arbolRecorridos.InOrderRecursivo(arbolBinario.getRoot());
    }

    public static void runEjercicio3() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels();
        int[] valores = {4, 2, 7, 1, 3, 6, 9};
        
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
        System.out.println("\nInput:");
        arbolBinario.printTree();
        List<List<Node>> niveles = levels.listLevels(arbolBinario.getRoot());
        System.out.println("\nOutput:");
        for (List<Node> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    System.out.print("->");
                }
            }
            System.out.println();
        }
    }

    private static void runArbolAvl() {
        System.out.println("\nArbolAVL");
        int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };
        ArbolAVL arbolAvl = new ArbolAVL();
        for (int value : values) {
            arbolAvl.insert(value);
            arbolAvl.printTree();
        }

    }
}