/* shuhangyan created on 2021-01-08 inside the package - gui.model */
package gui.model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class CategoryTableModel implements TableModel {
    String [] columnNames = new String[] {"Category Name", "Expense Numbers"};
    List<String> cs = new ArrayList<>();

    public CategoryTableModel(){
        cs.add("Meals & Entertainment Expenses");
        cs.add("Travel Expenses");
        cs.add("Rent, Utilities & Phone");
    }

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return cs.get(rowIndex);
        }
        if(columnIndex == 1){
            return 0;
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
