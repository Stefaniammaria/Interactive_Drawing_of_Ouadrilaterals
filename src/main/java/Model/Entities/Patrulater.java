package Model.Entities;

import lombok.Getter;

import java.util.ArrayList;
@Getter
public class Patrulater {

    private ArrayList<Punct> listaPuncte = new ArrayList<>();
    private ArrayList<Segment> listaSegmente = new ArrayList<>();

    public Patrulater(Punct p1, Punct p2, Punct p3, Punct p4) {

        listaPuncte.add(p1);
        listaPuncte.add(p2);
        listaPuncte.add(p3);
        listaPuncte.add(p4);

        listaSegmente.add(new Segment(p1,p2));
        listaSegmente.add(new Segment(p2,p3));
        listaSegmente.add(new Segment(p3,p4));
        listaSegmente.add(new Segment(p4,p1));


    }

    public Patrulater(ArrayList<Punct> listaPuncte){

        this (listaPuncte.get(0),listaPuncte.get(1),listaPuncte.get(2),listaPuncte.get(3));

    }
}
