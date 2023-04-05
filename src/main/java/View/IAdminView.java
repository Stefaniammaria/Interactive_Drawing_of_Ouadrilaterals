package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public interface IAdminView {

    String getTextNume();
    String getTextPrenume();
    String getTextUsername();
    String getTextParola();
    String getTextEmail();
    String getTextTip();

    JTable gettable1();

    DefaultTableModel getTableModel();


}
