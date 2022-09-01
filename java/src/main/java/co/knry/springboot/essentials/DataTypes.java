package co.knry.springboot.essentials;

import org.javatuples.Pair;

import java.util.*;

public class DataTypes {

    public void printHashMap(){
        Map<String,String> mapa= new HashMap<>();
        mapa.put("nombre","cecilio");
        mapa.put("apellidos","alvarez");
        System.out.println(mapa.get("nombre"));
        System.out.println(mapa.get("apellidos"));
    }

    public void printQuery(){
        Map<String,String> mapa= new HashMap<>();
        mapa.put("columna","titulo");
        mapa.put("valor","java");
        String consulta= "select "+mapa.get("columna")+  " from libroswhere " + mapa.get("columna") +"='"+ mapa.get("valor")+"'";
        System.out.println(consulta);
    }

    public void printTuple(){
        Pair<String, String> tupla = new Pair<String, String>("titulo","java");
        String consulta = "select " + tupla.getValue0() + " from libroswhere " + tupla.getValue1() + "='"+ tupla.getValue1() + "'";
        System.out.println(consulta);
    }

    public void printArrayList(){
        List cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("Chevrolet");
        cars.add(null); // ADMITE NULOS PERO AL ORDENARLOS DA NULL POINTER
        cars.add("Ford");// Admite duplicados
        System.out.println(cars);

        System.out.println(cars.get(1)); // Se consigue por indice

        cars.set(5, "Opel");
        cars.remove(4);
        System.out.println(cars);

        Collections.sort(cars);

        System.out.println(cars);
    }

    public void printSet(){
        // Demonstrating Set using HashSet
        // Declaring object of type String
        Set<String> hashSet = new HashSet<>();

        // Adding elements to the Set
        // using add() method
        hashSet.add("Geeks");
        hashSet.add("For");
        hashSet.add("Geeks");  // NO ADMITE REPETIDOS. LOS DEJA INSERTAR SIN EXCEPCION, PERO EL SET PERMANECE DEL MISMO TAMAÑO
        hashSet.add("Example");
        hashSet.add("Set");

        // Printing elements of HashSet object
        System.out.println(hashSet);
    }

    public void printStack(){ // <- Es una Pila: Last in, First Out TAMBIEN ES UN VECTOR
        Stack<Number> pila = new Stack<Number>();
        Long numeroLong = 12L;
        Integer numeros = 34567;
        Float numeroFloat = 1.0F;
        Double numeroDouble = 1234.5678;
        Double numeroDoubleRepetido = 1234.5678;

        pila.push(numeroLong);
        imprimirPila(pila);
        pila.push(numeros);
        imprimirPila(pila);
        pila.push(numeroFloat);
        imprimirPila(pila);
        pila.push(numeroDouble);
        imprimirPila(pila);
        pila.push(numeroDoubleRepetido); // ADMITE REPETIDOS
        imprimirPila(pila);

        try {
            Number objetoEliminado = null;
            while(true) {
                objetoEliminado = pila.pop();
                System.out.printf("%s se quita \n", objetoEliminado);
                imprimirPila(pila);
            }
        }catch(EmptyStackException emptyStackException) {
            emptyStackException.printStackTrace ();
        }

    }

    public void printQueue(){
        Queue<String> cola1 = new LinkedList<String>();
        System.out.println("Insertamos tres elementos en la cola: juan, ana y luis");
        cola1.add("juan");
        cola1.add("ana");
        cola1.add("luis");
        cola1.add("ana");// ADMITE REPETIDOS
        cola1.add("Luisa");
        cola1.add("Edwin");


        cola1.remove("Luisa");


        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Extraemos un elemento de la cola:" + cola1.poll());
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Consultamos el primer elemento de la cola sin extraerlo:" + cola1.peek());
        System.out.println("Cantidad de elementos en la cola:" + cola1.size());
        System.out.println("Extraemos uno a un cada elemento de la cola mientras no este vacía:");
        while (!cola1.isEmpty())
            System.out.print(cola1.poll() + "-");
        System.out.println();

        Queue<Integer> cola2 = new LinkedList<Integer>();
        cola2.add(70);
        cola2.add(120);
        cola2.add(6);
        System.out.println("Imprimimos la cola de enteros");
        for (Integer elemento : cola2)
            System.out.print(elemento + "-");
        System.out.println();
        System.out.println("Borramos toda la cola");
        cola2.clear();
        System.out.println("Cantidad de elementos en la cola de enteros:" + cola2.size());
    }

    private void imprimirPila(Stack<Number> pila) {
        if (pila.empty()) {
            System.out.print("la pila esta vacia\n\n");
        } else {
            System.out.print("la pila contiene: ");
            for (Number numero : pila) {
                System.out.printf("%s ", numero);
            }
            System.out.print("(superior) \n\n");
        }
    }

}
