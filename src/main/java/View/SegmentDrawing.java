package View;

import Model.Entities.Segment;

import java.awt.*;

public class SegmentDrawing implements Drawing{

    private final Segment segment;

    public SegmentDrawing(Segment segment) {
        this.segment = segment;
    }

    @Override
    public void draw(Graphics g) {

        g.drawLine(segment.getPunct1().getX(),segment.getPunct1().getY(),segment.getPunct2().getX(),segment.getPunct2().getY());

    }
}
