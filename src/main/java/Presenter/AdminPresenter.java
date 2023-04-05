package Presenter;

import Model.Entities.RequestLogIn;
import Model.Entities.User;
import Model.Persistence.AbstractPersistence;
import View.AdminView;
import View.IAdminView;

import java.util.ArrayList;
import java.util.List;

public class AdminPresenter {

    private final IAdminView av;
    AbstractPersistence<RequestLogIn> abstractPersistence = new AbstractPersistence<>(RequestLogIn.class);
    AbstractPersistence<User> abstractPersistence2 = new AbstractPersistence<>(User.class);

    public AdminPresenter(IAdminView av) {
        this.av = av;
    }

    public void showList() {

        List<RequestLogIn> logIns = abstractPersistence.readAll();

        av.gettable1().setModel(av.getTableModel());

        for (RequestLogIn r : logIns) {

            Object[] rowData = {r.getNume(), r.getPrenume(), r.getEmail()};
            av.getTableModel().addRow(rowData);

        }
    }

    public void createAccountUser() {
        User user = new User();
        user.setNume(av.getTextNume());
        user.setPrenume(av.getTextPrenume());
        user.setUsername(av.getTextUsername());
        user.setParola(av.getTextParola());
        user.setEmail(av.getTextEmail());
        user.setTip(av.getTextTip());

        abstractPersistence2.insert(user);

        List<RequestLogIn> logIns = abstractPersistence.readAll();

        logIns.forEach(l -> {
            if (l.getEmail().equals(user.getEmail())) {

                abstractPersistence.delete(l);

            }
        });

        logIns = abstractPersistence.readAll();

        av.getTableModel().setRowCount(0);
        av.gettable1().setModel(av.getTableModel());

        for (RequestLogIn r : logIns) {

            Object[] rowData = {r.getNume(), r.getPrenume(), r.getEmail()};
            av.getTableModel().addRow(rowData);

        }
    }
}
