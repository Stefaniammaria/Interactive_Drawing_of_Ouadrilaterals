package Model.Entities;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Segment {
    private Punct punct1 ;
    private Punct punct2 ;

    public Segment(Punct punct1, Punct punct2) {
        this.punct1 = punct1;
        this.punct2 = punct2;
    }

    public int getLength(){

        int X1 = punct1.getX();
        int X2 = punct2.getX();
        int Y1 = punct1.getY();
        int Y2 = punct2.getY();

        int lungime = (int)Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));

        return lungime;

    }



}
