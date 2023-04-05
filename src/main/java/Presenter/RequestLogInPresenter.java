package Presenter;

import Model.Entities.RequestLogIn;
import Model.Entities.User;
import Model.Persistence.AbstractPersistence;
import View.IRequestLogIn;

public class RequestLogInPresenter{

    AbstractPersistence<RequestLogIn> abstractPersistence = new AbstractPersistence<>(RequestLogIn.class);
    private final IRequestLogIn iRequestLogIn;

    public RequestLogInPresenter(IRequestLogIn iRequestLogIn) {
        this.iRequestLogIn = iRequestLogIn;
    }

    public void requestLogIn(){

        RequestLogIn requestLogIn = new RequestLogIn();
        requestLogIn.setNume(iRequestLogIn.getTextNume());
        requestLogIn.setPrenume(iRequestLogIn.getTextPrenume());
        requestLogIn.setEmail(iRequestLogIn.getTextEmail());
        abstractPersistence.insert(requestLogIn);

    }



}
