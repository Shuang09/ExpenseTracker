/* shuhangyan created on 2021-01-08 inside the package - gui.panel */
package gui.panel;


import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;

public class RecoverPanel extends JPanel {

    static {
        GUIUtil.useLNF();
    }

    public static RecoverPanel instance = new RecoverPanel();

    JButton bRecover = new JButton("Recover");

    public RecoverPanel(){
        GUIUtil.setColor(ColorUtil.blueColor,bRecover);
        this.add(bRecover);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(RecoverPanel.instance);
    }
}
