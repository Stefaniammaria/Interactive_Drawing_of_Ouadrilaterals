package View;

import javax.swing.*;
import java.util.ArrayList;

public interface IGameView {

    ArrayList<Drawing> getDrawingsArray();
    void redraw();
    public JTextField getArieField();

    public JTextField getPerimetruField();

    public JTextField getLatura1Field();

    public JTextField getLatura2Field();

    public JTextField getLatura3Field();

    public JTextField getLatura4Field();

    public JTextField getUnghi1Field();

    public JTextField getUnghi2Field();

    public JTextField getUnghi3Field();

    public JTextField getUnghi4Field();

    public JTextField getConvexConcavField();

    public JTextField getInscriptibilField();

    public JTextField getCircumscriptibilField();

    public JTextField getRazaCerCircumscrisField();

    public JTextField getRazaCercInscrisField();

}
