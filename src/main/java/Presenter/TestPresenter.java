package Presenter;

import Model.Entities.Question;
import Model.Entities.Test;
import Model.Persistence.AbstractPersistence;
import View.ITestView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TestPresenter {


    AbstractPersistence<Question> abstractPersistence = new AbstractPersistence<>(Question.class);
    List<String> raspunsuriIntrebari = new ArrayList<>();

    private final ITestView iTestView;
    public TestPresenter(ITestView iTestView) {
        this.iTestView = iTestView;
    }

    public void getQuestions(){
        Test test  = new Test();
        test.setQuestions(abstractPersistence.readAll());
        Collections.shuffle(test.getQuestions());
        List<Question> randomQuestions = test.getQuestions().subList(0, 10);


        for(int i = 0; i < iTestView.getTextFieldListQuestions().size(); i++){

            iTestView.getTextFieldListQuestions().get(i).setText(randomQuestions.get(i).getEnunt());
            raspunsuriIntrebari.add(randomQuestions.get(i).getRaspuns());

        }
    }

    public void getResult(){

        int rezultat = 0;
        int index = -1;

        List<String> listaRaspunsuriElev = new ArrayList<>();

        iTestView.getTextFieldListAnswers().forEach(textField -> {

            listaRaspunsuriElev.add(textField.getText());

        });

        for(String raspuns : raspunsuriIntrebari){

            index++;
            if(raspuns.equals(listaRaspunsuriElev.get(index))){rezultat++;
            }

        }

        iTestView.getTextField1().setText(String.valueOf(rezultat));

    }

}
