/* shuhangyan created on 2021-01-08 inside the package - gui.panel */
package gui.panel;

import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;

public class BackupPanel extends JPanel {
    static {
        GUIUtil.useLNF();
    }

    public static BackupPanel instance = new BackupPanel();

    JButton bBackup = new JButton("Backup");

    public BackupPanel(){
        GUIUtil.setColor(ColorUtil.blueColor,bBackup);
        this.add(bBackup);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(BackupPanel.instance);
    }
}
