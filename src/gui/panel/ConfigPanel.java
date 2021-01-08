/* shuhangyan created on 2021-01-08 inside the package - gui.panel */
package gui.panel;

import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class ConfigPanel extends JPanel {
    static {
        GUIUtil.useLNF();
    }

    public static ConfigPanel instance= new ConfigPanel();

    JLabel lBudget = new JLabel("Monthly Budget($)");
    public JTextField tfBudget = new JTextField("0");

    JLabel lMysql = new JLabel("Mysql Building Path");
    public JTextField tfMysqlPath = new JTextField("");

    JButton bSubmit = new JButton("Update");

    public ConfigPanel() {
        GUIUtil.setColor(ColorUtil.grayColor, lBudget,lMysql);
        GUIUtil.setColor(ColorUtil.blueColor, bSubmit);

        JPanel pInput =new JPanel();
        JPanel pSubmit = new JPanel();
        int gap =40;
        pInput.setLayout(new GridLayout(4,1,gap,gap));

        pInput.add(lBudget);
        pInput.add(tfBudget);
        pInput.add(lMysql);
        pInput.add(tfMysqlPath);
        this.setLayout(new BorderLayout());
        this.add(pInput,BorderLayout.NORTH);

        pSubmit.add(bSubmit);
        this.add(pSubmit,BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        GUIUtil.showPanel(ConfigPanel.instance);
    }

}
