package View;

import Model.Entities.RequestLogIn;
import Presenter.AdminPresenter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AdminView extends JFrame implements IAdminView {
    private JPanel panel;
    private JButton backButton;
    private JTextField textNume;
    private JTextField textPrenume;
    private JTextField textUsername;
    private JTextField textParola;
    private JTextField textEmail;
    private JTextField textTip;
    private JButton createAccountButton;
    private JButton showListButton;
    private JTable table1;

    private final AdminPresenter ap;

    String[] columnNames = {"Nume", "Prenume", "Email"};
    private DefaultTableModel tableModel = new DefaultTableModel(null, columnNames);


    public AdminView() {
        ap = new AdminPresenter(this);
        setContentPane(panel);
        setTitle("StartUpPage");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StartUpPage st = new StartUpPage();
                dispose();
            }
        });

        showListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ap.showList();

            }
        });

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ap.createAccountUser();

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
    public String getTextUsername() {
        return textUsername.getText();
    }

    @Override
    public String getTextParola() {
        return textParola.getText();
    }

    @Override
    public String getTextEmail() {
        return textEmail.getText();
    }

    @Override
    public String getTextTip() {
        return textTip.getText();
    }

    @Override
    public JTable gettable1() {
        return table1;
    }

    @Override
    public DefaultTableModel getTableModel() {
        return tableModel;
    }


}
