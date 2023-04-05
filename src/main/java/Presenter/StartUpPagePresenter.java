package Presenter;

import View.LogInView;
import View.RequestLogInView;

public class StartUpPagePresenter {

    public StartUpPagePresenter() {
    }

    public void startLogIn(){

        LogInView lg = new LogInView();
    }

    public void startLogInRequest(){

        RequestLogInView requestLogInView = new RequestLogInView();
    }


}
