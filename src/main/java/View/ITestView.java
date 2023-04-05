package View;

import javax.swing.*;
import java.util.List;

public interface ITestView {

    List<JTextField> getTextFieldListQuestions();
    List<JTextField> getTextFieldListAnswers();

    JTextField getTextField1();

}
