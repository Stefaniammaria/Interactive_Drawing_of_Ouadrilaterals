package View;

import Presenter.StartUpPagePresenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartUpPage extends JFrame {
    private JButton drawButton;
    private JButton logInButton;
    private JButton requestLogInButton;
    private JPanel panel;
    private JButton exitButton;

    private StartUpPagePresenter startUpPagePresenter = new StartUpPagePresenter();

    public StartUpPage() {

        setContentPane(panel);
        setTitle("StartUpPage");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });

        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                GameView gm = new GameView();
                dispose();
            }
        });

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                startUpPagePresenter.startLogIn();
                dispose();
            }
        });

        requestLogInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                startUpPagePresenter.startLogInRequest();
                dispose();
            }
        });
    }
}
