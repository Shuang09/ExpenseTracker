package util;


import javax.swing.*;
import java.awt.*;
import java.io.File;


public class GUIUtil {

    private static String imageFolder = "/Users/shuhangyan/Desktop/Project/billTracking/img";


    /**
     * Set icon and notes for buttons
     */
    public static void setImageIcon(JButton b, String fileName, String tip){
        ImageIcon i = new ImageIcon(new File(imageFolder,fileName).getAbsolutePath());
        b.setIcon(i);
        b.setPreferredSize(new Dimension(60,80));
        b.setToolTipText(tip);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setText(tip);
    }



    /**
     * Set Foreground Color for components
     */
    public static void setColor(Color color, JComponent ... cs){
        for (JComponent c:cs){
            c.setForeground(color);
        }
    }

    public static int getInt(JTextField tf) {
        return Integer.parseInt(tf.getText());
    }

    /**
     * Set Customize Style
     */
    public static void useLNF(){
        try{
            javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Check the input box in null or not
     */
    public static boolean checkEmpty(JTextField tf, String input){
        String text = tf.getText().trim();
        if (text.length() == 0){
            JOptionPane.showMessageDialog(null,input+"Cannot be null");
            tf.grabFocus();
            return  false;
        }
        return true;
    }

    /**
     * Check input is a number or not
     */
    public static boolean checkNumber(JTextField tf, String input){
        if (!checkEmpty(tf, input))
            return false;
        String text = tf.getText().trim();
        try{
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e1){
            JOptionPane.showMessageDialog(null, input+"The number should be an Integer");
            tf.grabFocus();
            return false;
        }
    }

    /**
     * Check input is Zero or not
     */
    public static boolean checkZero(JTextField tf, String input){
        if (!checkNumber(tf, input))
            return false;
        String text = tf.getText().trim();
        if(Integer.parseInt(input) == 0){
            JOptionPane.showMessageDialog(null, input+"The input cannot be Zero");
            tf.grabFocus();
            return false;
        }
        return true;
    }

    /**
     *
     */
    public static void showPanel(JPanel p, double strech){
        GUIUtil.useLNF();
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        CenterPanel cp = new CenterPanel(strech);
        f.setContentPane(cp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        cp.show(p);
    }
    public static void showPanel(JPanel p){
        showPanel(p,0.85);
    }




}
