import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
public class BillMainFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,450);
        f.setTitle("My Expenses Tracker");
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolBar tb = new JToolBar();
        JButton bSpend = new JButton("Total Expense");
        JButton bRecord = new JButton("Add Expense");
        JButton bCategory = new JButton("Expense Category");
        JButton bReport = new JButton("Monthly Expense");
        JButton bConfig = new JButton("Settings");
        JButton bBackup = new JButton("BackUp");
        JButton bRecover = new JButton("Restore");

        tb.add(bSpend);
        tb.add(bRecord);
        tb.add(bCategory);
        tb.add(bReport);
        tb.add(bConfig);
        tb.add(bBackup);
        tb.add(bRecover);


//        tb.add(bSpend);
//        tb.add(bRecord);
//        tb.add(bCategory);
//        tb.add(bReport);
//        tb.add(bConfig);
//        tb.add(bBackup);
//        tb.add(bRecover);
//        f.setLayout(new BorderLayout());
//        f.add(tb, BorderLayout.NORTH);
//        f.add(new JPanel(), BorderLayout.CENTER);

        f.setVisible(true);

        bSpend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bRecord.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bCategory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bConfig.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bBackup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bRecover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

}
