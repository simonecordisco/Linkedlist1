//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> fruit = new LinkedList<String>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Melon");
        System.out.println(fruit);
      fruit.addFirst("Apricot");
        System.out.println(fruit);

    }
}