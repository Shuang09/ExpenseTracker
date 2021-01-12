/* shuhangyan created on 2021-01-08 inside the package - gui.panel */
package gui.panel;

import entity.Category;
import gui.model.CategoryTableModel;
import service.CategoryService;
import util.ColorUtil;
import util.GUIUtil;
import gui.listener.CategoryListener;

import javax.swing.*;
import java.awt.*;

public class CategoryPanel extends WorkingPanel {
    static{
        GUIUtil.useLNF();
    }
    public static CategoryPanel instance = new CategoryPanel();

    public JButton bAdd = new JButton("Add");
    public JButton bEdit = new JButton("Edit");
    public JButton bDelete = new JButton("Delete");
    String columnNames[] = new String[]{"Category Names", "Expense Times"};

    public CategoryTableModel ctm = new CategoryTableModel();
    public JTable t = new JTable(ctm);

    public CategoryPanel(){
        GUIUtil.setColor(ColorUtil.blueColor, bAdd,bEdit,bDelete);
        JScrollPane sp =new JScrollPane(t);
        JPanel pSubmit = new JPanel();
        pSubmit.add(bAdd);
        pSubmit.add(bEdit);
        pSubmit.add(bDelete);

        this.setLayout(new BorderLayout());
        this.add(sp,BorderLayout.CENTER);
        this.add(pSubmit,BorderLayout.SOUTH);

        addListener();
    }


    public static void main(String[] args) {
        GUIUtil.showPanel(CategoryPanel.instance);
    }

    public Category getSelectedCategory(){
        int index = t.getSelectedRow();
        return ctm.cs.get(index);
    }

    public void updateData(){
        ctm.cs = new CategoryService().list();
        t.updateUI();
        t.getSelectionModel().setSelectionInterval(0,0);

        if(ctm.cs.size()==0){
            bEdit.setEnabled(false);
            bDelete.setEnabled(false);
        }
        else{
            bEdit.setEnabled(true);
            bDelete.setEnabled(true);
        }
    }
    public void addListener() {
        CategoryListener listener = new CategoryListener();
        bAdd.addActionListener(listener);
        bEdit.addActionListener(listener);
        bDelete.addActionListener(listener);
    }

}
