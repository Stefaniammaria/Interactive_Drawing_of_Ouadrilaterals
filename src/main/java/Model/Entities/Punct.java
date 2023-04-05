package Model.Entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Punct {
    private int X;
    private int Y;

    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }

}
