public class Main {
    public static void main(String[] args){
        ArbolBinario arbol = new ArbolBinario();

        System.out.println("\nImpresión de datos sin orden");

        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(2);
        arbol.insertar(4);

        System.out.println("\n\nÁrbol impreso por niveles");
        arbol.imprimirNiveles();

        System.out.println("\n\nPre Orden de Izquierda a Derecha");
        arbol.imprimirPreOrden();
        System.out.println("\n\nPre Orden de Derecha a Izquierda");
        arbol.imprimirPreOrdenD();

        System.out.println("\n\nIn Orden de Izquierda a Derecha");
        arbol.imprimirInOrden();
        System.out.println("\n\nIn Orden de Derecha a Izquierda");
        arbol.imprimirInOrdenD();

        System.out.println("\n\nPost Orden de Izquierda a Derecha");
        arbol.imprimirPostOrden();
        System.out.println("\n\nPost Orden de Derecha a Izquierda");
        arbol.imprimirPostOrdenD();
        System.out.println("\n\n");
    }
}