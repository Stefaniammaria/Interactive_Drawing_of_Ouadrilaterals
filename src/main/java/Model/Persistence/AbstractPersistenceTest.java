package Model.Persistence;

import Model.Entities.Question;
import Model.Entities.RequestLogIn;
import Model.Entities.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AbstractPersistenceTest {

    @Test
    void insertQuestion() {
        AbstractPersistence<Question> abstractPersistence = new AbstractPersistence<>(Question.class);
        Question question = new Question();
        question.setEnunt("Enunt");
        question.setRaspuns("Raspuns");
        abstractPersistence.insert(question);
        try {

            List<Question> questionsList = abstractPersistence.readAll();
            questionsList.forEach(question1 -> {

                if (question1.getEnunt().equals("Enunt") && question1.getRaspuns().equals("Raspuns")) {

                    assert question1.getEnunt().equals("Enunt");
                    assert question1.getRaspuns().equals("Raspuns");
                    abstractPersistence.delete(question1);

                }
            });
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    void deleteQuestion() {
        AbstractPersistence<Question> abstractPersistence = new AbstractPersistence<>(Question.class);
        Question question = new Question();
        question.setEnunt("Enunt");
        question.setRaspuns("Raspuns");
        abstractPersistence.insert(question);

        try {
            List<Question> questionsList = abstractPersistence.readAll();
            questionsList.forEach(question1 -> {

                if (question1.getEnunt().equals("Enunt") && question1.getRaspuns().equals("Raspuns")) {
                    abstractPersistence.delete(question1);

                }
            });

            try {
                List<Question> newQuestionsList = abstractPersistence.readAll();
                newQuestionsList.forEach(question1 -> {

                    if (question1.getEnunt().equals("Enunt") && question1.getRaspuns().equals("Raspuns")) {
                        assert false;
                    }
                });
            } catch (Exception e) {
                assert true;
            }
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    void readAllQuestions() {
        AbstractPersistence<Question> abstractPersistence = new AbstractPersistence<>(Question.class);
        try {
            List<Question> questionsList = abstractPersistence.readAll();
            if (questionsList.isEmpty()) assert false;
            else assert true;
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    void insertUser() {
        AbstractPersistence<User> abstractPersistence = new AbstractPersistence<>(User.class);
        User user = new User();
        user.setNume("Nume");
        user.setPrenume("Prenume");
        user.setTip("Tip");
        user.setUsername("Username");
        user.setParola("Parola");
        user.setEmail("Email");
        abstractPersistence.insert(user);
        try {

            List<User> usersList = abstractPersistence.readAll();
            usersList.forEach(user1 -> {

                if (user1.getNume().equals("Nume") && user1.getPrenume().equals("Prenume") && user1.getParola().equals("Parola")) {

                    assert user1.getNume().equals("Nume");
                    assert user1.getPrenume().equals("Prenume");
                    assert user1.getTip().equals("Tip");
                    assert user1.getUsername().equals("Username");
                    assert user1.getParola().equals("Parola");
                    assert user1.getEmail().equals("Email");
                    abstractPersistence.delete(user1);

                }
            });
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    void deleteUser() {
        AbstractPersistence<User> abstractPersistence = new AbstractPersistence<>(User.class);
        User user = new User();
        user.setNume("Nume");
        user.setPrenume("Prenume");
        user.setTip("Tip");
        user.setUsername("Username");
        user.setParola("Parola");
        user.setEmail("Email");
        abstractPersistence.insert(user);

        try {
            List<User> usersList = abstractPersistence.readAll();
            usersList.forEach(user1 -> {

                if (user1.getNume().equals("Nume") && user1.getPrenume().equals("Prenume") && user1.getParola().equals("Parola")) {
                    abstractPersistence.delete(user1);

                }
            });

            try {
                List<User> usersList1 = abstractPersistence.readAll();
                usersList1.forEach(user1 -> {

                    if (user1.getNume().equals("Nume") && user1.getPrenume().equals("Prenume") && user1.getParola().equals("Parola")) {
                        assert false;

                    }
                });
            } catch (Exception e) {
                assert true;
            }
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    void readAllUser() {
        AbstractPersistence<User> abstractPersistence = new AbstractPersistence<>(User.class);
        try {
            List<User> usersList = abstractPersistence.readAll();
            if (usersList.isEmpty()) assert false;
            else assert true;
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    void insertRequestLogIn() {
        AbstractPersistence<RequestLogIn> abstractPersistence = new AbstractPersistence<>(RequestLogIn.class);
        RequestLogIn requestLogIn = new RequestLogIn();
        requestLogIn.setNume("Nume");
        requestLogIn.setPrenume("Prenume");
        requestLogIn.setEmail("Email");
        abstractPersistence.insert(requestLogIn);
        try {

            List<RequestLogIn> requestLogInList = abstractPersistence.readAll();
            requestLogInList.forEach(requestLogIn1 -> {

                if (requestLogIn1.getNume().equals("Nume") && requestLogIn1.getPrenume().equals("Prenume") && requestLogIn1.getEmail().equals("Email")) {

                    assert requestLogIn1.getNume().equals("Nume");
                    assert requestLogIn1.getPrenume().equals("Prenume");
                    assert requestLogIn1.getEmail().equals("Email");
                    abstractPersistence.delete(requestLogIn1);

                }
            });
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    void deleteRequestLogIn() {
        AbstractPersistence<RequestLogIn> abstractPersistence = new AbstractPersistence<>(RequestLogIn.class);
        RequestLogIn requestLogIn = new RequestLogIn();
        requestLogIn.setNume("Nume");
        requestLogIn.setPrenume("Prenume");
        requestLogIn.setEmail("Email");
        abstractPersistence.insert(requestLogIn);

        try {
            List<RequestLogIn> requestLogInList = abstractPersistence.readAll();
            requestLogInList.forEach(requestLogIn1 -> {

                if (requestLogIn1.getNume().equals("Nume") && requestLogIn1.getPrenume().equals("Prenume") && requestLogIn1.getEmail().equals("Email")) {
                    abstractPersistence.delete(requestLogIn1);

                }
            });

            try {
                List<RequestLogIn> requestLogInList1 = abstractPersistence.readAll();
                requestLogInList1.forEach(requestLogIn1 -> {

                    if (requestLogIn1.getNume().equals("Nume") && requestLogIn1.getPrenume().equals("Prenume") && requestLogIn1.getEmail().equals("Email")) {
                        assert false;

                    }
                });
            } catch (Exception e) {
                assert true;
            }
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    void readAllRequestLogIn() {
        AbstractPersistence<RequestLogIn> abstractPersistence = new AbstractPersistence<>(RequestLogIn.class);
        try {
            List<RequestLogIn> requestLogInList = abstractPersistence.readAll();
            if (requestLogInList.isEmpty()) assert false;
            else assert true;
        } catch (Exception e) {
            assert false;
        }
    }

}