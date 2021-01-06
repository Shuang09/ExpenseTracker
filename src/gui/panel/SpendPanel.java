package gui.panel;

import javax.swing.JLabel;

public class SpendPanel {

    public static SpendPanel instance = new SpendPanel();

    JLabel lMonthSpend = new JLabel("Month Expense");
    JLabel lTodaySpend = new JLabel("Today Expense");
    JLabel lAvgSpendPerDay = new JLabel("Average Daily Expense");
    JLabel lMonthLeft = new JLabel("Remainning for the month");
    JLabel lDayAvgAvailable = new JLabel("Remainning for per day");
    JLabel lMonthLeftDay = new JLabel("Till the end of the month");

    JLabel vMonthSpend = new JLabel("$2300");
    JLabel vTodaySpend = new JLabel("$25");
    JLabel vAvgSpendPerDay = new JLabel("$120");
    JLabel vMonthAvailable = new JLabel("$2084");
    JLabel vDayAvgAvailable = new JLabel("$389");
    JLabel vMonthLeftDay = new JLabel("15 days");

    private SpendPanel(){

    }

}


