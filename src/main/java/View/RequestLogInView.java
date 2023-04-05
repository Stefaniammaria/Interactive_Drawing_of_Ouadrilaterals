package View;

import Presenter.RequestLogInPresenter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RequestLogInView extends JFrame implements IRequestLogIn{
    private JTextField textNume;
    private JTextField textPrenume;
    private JTextField textEmail;
    private JPanel panel;
    private JButton requestLogInButton;
    private JButton backButton;

    RequestLogInPresenter requestLogInPresenter ;

    public RequestLogInView() {

        requestLogInPresenter = new RequestLogInPresenter(this);
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

        requestLogInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                requestLogInPresenter.requestLogIn();

            }
        });
    }

    @Override
    public String getTextNume() {
        return textNume.getText();
    }

    @Override
    public String getTextPrenume() {
        return textPrenume.getText();
    }

    @Override
    public String getTextEmail() {
        return textEmail.getText();
    }
}
