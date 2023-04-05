package View;

import Model.Entities.Patrulater;

import java.awt.*;

public class PatrulaterDrawing implements Drawing{

    private Patrulater patrulater;

    public PatrulaterDrawing(Patrulater patrulater) {
        this.patrulater = patrulater;
    }

    @Override
    public void draw(Graphics g) {

        patrulater.getListaSegmente().forEach(segment -> {

            SegmentDrawing segmentDrawing = new SegmentDrawing(segment);
            segmentDrawing.draw(g);

        });

    }

}
