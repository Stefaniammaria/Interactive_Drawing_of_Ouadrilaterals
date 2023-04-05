package Presenter;

import Model.Entities.User;
import Model.Persistence.AbstractPersistence;
import View.AdminView;
import View.IAdminView;
import View.ILogIn;
import View.TestView;

import java.util.ArrayList;
import java.util.List;

public class LogInPresenter {

    AbstractPersistence<User> abstractPersistence = new AbstractPersistence<>(User.class);

    private final ILogIn iLogIn;

    public LogInPresenter(ILogIn iLogIn) {
        this.iLogIn = iLogIn;
    }

    public void logIn() {

        List<User> userList = abstractPersistence.readAll();

        for (User u : userList) {
            if (u.getUsername().equals(iLogIn.getTextUsername()) && u.getParola().equals(iLogIn.getTextParola())) {
                if (u.getTip().equals("admin")) {
                    AdminView av = new AdminView();
                    break;
                }
                if (u.getTip().equals("elev")) {
                    TestView tv = new TestView();
                    break;
                }
            }
        }
    }

}

