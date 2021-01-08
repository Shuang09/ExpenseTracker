package test;

import util.GUIUtil;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        GUIUtil.useLNF();
        JPanel p = new JPanel();
        p.add(new JButton("BUTTON1"));
        p.add(new JButton("BUTTON2"));
        GUIUtil.showPanel(p);
    }
}
