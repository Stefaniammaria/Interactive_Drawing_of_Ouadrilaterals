package View;

import Presenter.LogInPresenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInView extends JFrame implements ILogIn{
    private JButton logInButton;
    private JButton backButton;
    private JPanel panel;
    private JTextField textUsername;
    private JTextField textParola;

    private final LogInPresenter logInPresenter ;


    public LogInView() {

        logInPresenter = new LogInPresenter(this);
        setContentPane(panel);
        setTitle("StartUpPage");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StartUpPage startUpPage = new StartUpPage();
                dispose();
            }
        });

        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                logInPresenter.logIn();
                dispose();
            }
        });

    }

    @Override
    public String getTextUsername() {
        return textUsername.getText();
    }

    @Override
    public String getTextParola() {
        return textParola.getText();
    }
}
