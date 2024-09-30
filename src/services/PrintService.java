package services;

import java.util.ArrayList;
import java.util.List;


public class PrintService<QualquerTipo> {

    private List<QualquerTipo> list = new ArrayList<>();

    //Add um valor a lista
    public void addValue(QualquerTipo value) {
        list.add(value);
    }

    //Retornar o primeiro elemento da lista
    public QualquerTipo first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    //retornar um print da lista
    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}