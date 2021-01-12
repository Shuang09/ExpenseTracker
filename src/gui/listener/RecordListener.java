package gui.listener;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
 
import javax.swing.JOptionPane;
 
import entity.Category;
import entity.Record;
import gui.panel.*;
import service.RecordService;
import util.GUIUtil;
 
public class RecordListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        RecordPanel p = RecordPanel.instance;
        if (0 == p.cbModel.cs.size()) {
            JOptionPane.showMessageDialog(p, "No Category, Please add a Category");
            MainPanel.instance.workingPanel.show(CategoryPanel.instance);
            return;
        }
        if (!GUIUtil.checkZero(p.tfSpend, "Expense Amount"))
            return;
        int spend = Integer.parseInt(p.tfSpend.getText());
        Category c = p.getSelectedCategory();
        String comment = p.tfComment.getText();
        Date d = p.datepick.getDate();
        new RecordService().add(spend, c, comment,d);
        JOptionPane.showMessageDialog(p,"Add successfully!");

        MainPanel.instance.workingPanel.show(SpendPanel.instance);

    }
}