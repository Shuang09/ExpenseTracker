/* shuhangyan created on 2021-01-08 inside the package - gui.panel */
package gui.panel;

import util.CenterPanel;
import util.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    static{
        GUIUtil.useLNF();
    }
    //单例模式，为的是后续的监听器访问这个容器里的组件的便利性
    public static MainPanel instance = new MainPanel();

    // All the buttons in the page
    public JToolBar tb = new JToolBar();
    public JButton bSpend = new JButton();
    public JButton bRecord = new JButton();
    public JButton bCategory = new JButton();
    public JButton bReport = new JButton();
    public JButton bConfig = new JButton();
    public JButton bBackup = new JButton();
    public JButton bRecover = new JButton();

    public CenterPanel workingPanel;

    private MainPanel() {

        GUIUtil.setImageIcon(bSpend, "home.png", "My Expense");
        GUIUtil.setImageIcon(bRecord, "record.png", "Add an Expense");
        GUIUtil.setImageIcon(bCategory, "category2.png", "Expense Category");
        GUIUtil.setImageIcon(bReport, "report.png", "Monthly record");
        GUIUtil.setImageIcon(bConfig, "config.png", "Seetings");
        GUIUtil.setImageIcon(bBackup, "backup.png", "Backup");
        GUIUtil.setImageIcon(bRecover, "restore.png", "Recover");

        tb.add(bSpend);
        tb.add(bRecord);
        tb.add(bCategory);
        tb.add(bReport);
        tb.add(bConfig);
        tb.add(bBackup);
        tb.add(bRecover);

        workingPanel = new CenterPanel(0.8);
        setLayout( new BorderLayout());
        add(tb, BorderLayout.NORTH);
        add(workingPanel,BorderLayout.CENTER);

    }
    private void addListener() {
        ToolBarListener listener = new ToolBarListener();

        bSpend.addActionListener(listener);
        bRecord.addActionListener(listener);
        bCategory.addActionListener(listener);
        bReport.addActionListener(listener);
        bConfig.addActionListener(listener);
        bBackup.addActionListener(listener);
        bRecover.addActionListener(listener);

    }

    public static void main(String[] args) {
        GUIUtil.showPanel(MainPanel.instance,1);
    }

}
