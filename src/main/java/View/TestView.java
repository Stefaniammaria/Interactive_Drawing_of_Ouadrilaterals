package View;

import Model.Entities.Question;
import Presenter.TestPresenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestView extends JFrame implements ITestView{
    private JPanel panel;
    private JButton backButton;
    private JButton afisareRezultatButton;
    private JTextField textField1;
    private JButton generareItrebariButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField19;
    private JTextField textField20;
    private JTextField textField21;

    List<JTextField> textFieldListQuestions = new ArrayList<>(Arrays.asList(textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9,textField10,textField11));
    List<JTextField> textFieldListAnswers = new ArrayList<>(Arrays.asList(textField12,textField13,textField14,textField15,textField16,textField17,textField18,textField19,textField20,textField21));

    private final TestPresenter tp ;

    public TestView() {

        tp = new TestPresenter(this);
        setContentPane(panel);
        setTitle("StartUpPage");
        setSize(1200, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StartUpPage startUpPage = new StartUpPage();
                dispose();
            }
        });

        generareItrebariButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tp.getQuestions();
            }

        });

        afisareRezultatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               tp.getResult();

            }
        });

    }

    @Override
    public List<JTextField> getTextFieldListQuestions() {
        return textFieldListQuestions;
    }

    @Override
    public List<JTextField> getTextFieldListAnswers() {
        return textFieldListAnswers;
    }

    @Override
    public JTextField getTextField1() {
        return textField1;
    }

}
