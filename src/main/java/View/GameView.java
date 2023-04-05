package View;


import Presenter.GamePresenter;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class GameView extends JPanel implements IGameView {

    JFrame frame = new JFrame("MyPanel");
    private final GamePresenter gamePresenter;
    private JButton getInfoButton;
    private JButton backButton;
    private JTextField arieField;
    private JTextField perimetruField;
    private JTextField latura1Field;
    private JTextField latura2Field;
    private JTextField latura3Field;
    private JTextField latura4Field;
    private JTextField unghi1Field;
    private JTextField unghi2Field;
    private JTextField unghi3Field;
    private JTextField unghi4Field;
    private JLabel jcomp12;
    private JLabel jcomp13;
    private JLabel jcomp14;
    private JLabel jcomp15;
    private JLabel jcomp16;
    private JLabel jcomp17;
    private JLabel jcomp18;
    private JLabel jcomp19;
    private JLabel jcomp20;
    private JLabel jcomp21;
    private JTextField convexConcavField;
    private JLabel jcomp23;
    private JTextField inscriptibilField;
    private JLabel jcomp25;
    private JTextField circumscriptibilField;
    private JLabel jcomp27;
    private JTextField razaCerCircumscrisField;
    private JLabel jcomp29;
    private JTextField razaCercInscrisField;
    private JLabel jcomp31;
    private ArrayList<Drawing> drawingArrayList = new ArrayList<>();

    public GameView() {

        gamePresenter = new GamePresenter(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adjust size and set layout
        getInfoButton = new JButton("Get Info");
        backButton = new JButton("Back");
        arieField = new JTextField(5);
        perimetruField = new JTextField(5);
        latura1Field = new JTextField(5);
        latura2Field = new JTextField(5);
        latura3Field = new JTextField(5);
        latura4Field = new JTextField(5);
        unghi1Field = new JTextField(5);
        unghi2Field = new JTextField(5);
        unghi3Field = new JTextField(5);
        unghi4Field = new JTextField(5);
        jcomp12 = new JLabel("Unghi 1");
        jcomp13 = new JLabel("Unghi 2");
        jcomp14 = new JLabel("Unghi 4");
        jcomp15 = new JLabel("Unghi 3");
        jcomp16 = new JLabel("Latura 1");
        jcomp17 = new JLabel("Latura 2");
        jcomp18 = new JLabel("Latura 3");
        jcomp19 = new JLabel("Latura 4");
        jcomp20 = new JLabel("Arie");
        jcomp21 = new JLabel("Perimetru");
        convexConcavField = new JTextField(5);
        jcomp23 = new JLabel("Convex/Concav");
        inscriptibilField = new JTextField(5);
        jcomp25 = new JLabel("Inscriptibil");
        circumscriptibilField = new JTextField(5);
        jcomp27 = new JLabel("Circumscriptibil");
        razaCerCircumscrisField = new JTextField(5);
        jcomp29 = new JLabel("Raza cercului circumscris");
        razaCercInscrisField = new JTextField(5);
        jcomp31 = new JLabel("Raza  cercului inscris");


        //set component bounds (only needed by Absolute Positioning)
        getInfoButton.setBounds(450, 25, 120, 25);
        backButton.setBounds(650, 395, 100, 25);
        arieField.setBounds(650, 20, 100, 25);
        perimetruField.setBounds(650, 60, 100, 25);
        latura1Field.setBounds(535, 110, 80, 25);
        latura2Field.setBounds(625, 145, 75, 25);
        latura3Field.setBounds(535, 180, 80, 25);
        latura4Field.setBounds(450, 145, 75, 25);
        unghi1Field.setBounds(450, 110, 75, 25);
        unghi2Field.setBounds(625, 110, 75, 25);
        unghi3Field.setBounds(625, 180, 75, 25);
        unghi4Field.setBounds(450, 180, 75, 25);
        jcomp12.setBounds(465, 90, 65, 20);
        jcomp13.setBounds(640, 90, 50, 20);
        jcomp14.setBounds(465, 200, 55, 20);
        jcomp15.setBounds(640, 200, 55, 20);
        jcomp16.setBounds(550, 90, 60, 20);
        jcomp17.setBounds(700, 150, 60, 15);
        jcomp18.setBounds(550, 200, 50, 25);
        jcomp19.setBounds(400, 145, 50, 25);
        jcomp20.setBounds(590, 20, 60, 25);
        jcomp21.setBounds(590, 60, 60, 25);
        convexConcavField.setBounds(650, 245, 100, 25);
        jcomp23.setBounds(500, 245, 95, 25);
        inscriptibilField.setBounds(650, 275, 100, 25);
        jcomp25.setBounds(500, 275, 65, 25);
        circumscriptibilField.setBounds(650, 305, 100, 25);
        jcomp27.setBounds(500, 305, 95, 25);
        razaCerCircumscrisField.setBounds(650, 335, 100, 25);
        jcomp29.setBounds(500, 335, 155, 25);
        razaCercInscrisField.setBounds(650, 365, 100, 25);
        jcomp31.setBounds(500, 360, 130, 25);
        //add components
        frame.add(getInfoButton);
        frame.add(arieField);
        frame.add(perimetruField);
        frame.add(latura1Field);
        frame.add(latura2Field);
        frame.add(latura3Field);
        frame.add(latura4Field);
        frame.add(unghi1Field);
        frame.add(unghi2Field);
        frame.add(unghi3Field);
        frame.add(unghi4Field);
        frame.add(jcomp12);
        frame.add(jcomp13);
        frame.add(jcomp14);
        frame.add(jcomp15);
        frame.add(jcomp16);
        frame.add(jcomp17);
        frame.add(jcomp18);
        frame.add(jcomp19);
        frame.add(jcomp20);
        frame.add(jcomp21);
        frame.add(convexConcavField);
        frame.add(jcomp23);
        frame.add(inscriptibilField);
        frame.add(jcomp25);
        frame.add(circumscriptibilField);
        frame.add(jcomp27);
        frame.add(razaCerCircumscrisField);
        frame.add(jcomp29);
        frame.add(razaCercInscrisField);
        frame.add(jcomp31);
        frame.add(backButton);

        frame.getContentPane().add(this);
        frame.setResizable(true);
        frame.pack();
        frame.setSize(new Dimension(800, 480));
        frame.setVisible(true);

        addMouseListener(new MouseAdapter() {
            @Override //I override only one method for presentation
            public void mousePressed(MouseEvent e) {

                gamePresenter.handleClick(e.getX(), e.getY());

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StartUpPage startUpPage = new StartUpPage();
                frame.dispose();
            }
        });

        getInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                gamePresenter.afisareInformatii();
            }
        });

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawingArrayList.forEach(drawing -> {

            drawing.draw(g);

        });

    }

    public void redraw() {

        frame.repaint();

    }

    public ArrayList<Drawing> getDrawingsArray() {

        return drawingArrayList;

    }

    public JTextField getArieField() {
        return arieField;
    }

    public JTextField getPerimetruField() {
        return perimetruField;
    }

    public JTextField getLatura1Field() {
        return latura1Field;
    }

    public JTextField getLatura2Field() {
        return latura2Field;
    }

    public JTextField getLatura3Field() {
        return latura3Field;
    }

    public JTextField getLatura4Field() {
        return latura4Field;
    }

    public JTextField getUnghi1Field() {
        return unghi1Field;
    }

    public JTextField getUnghi2Field() {
        return unghi2Field;
    }

    public JTextField getUnghi3Field() {
        return unghi3Field;
    }

    public JTextField getUnghi4Field() {
        return unghi4Field;
    }

    public JTextField getConvexConcavField() {
        return convexConcavField;
    }

    public JTextField getInscriptibilField() {
        return inscriptibilField;
    }

    public JTextField getCircumscriptibilField() {
        return circumscriptibilField;
    }

    public JTextField getRazaCerCircumscrisField() {
        return razaCerCircumscrisField;
    }

    public JTextField getRazaCercInscrisField() {
        return razaCercInscrisField;
    }
}