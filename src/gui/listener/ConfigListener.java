/* shuhangyan created on 2021-01-09 inside the package - gui.listner */
package gui.listener;

import entity.Config;
import gui.panel.ConfigPanel;
import service.ConfigService;
import util.GUIUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ConfigListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        ConfigPanel p = ConfigPanel.instance;

        if(!GUIUtil.checkNumber(p.tfBudget,"Month Budget"))
            return;
        String mysqlPath = p.tfMysqlPath.getText();
        if(mysqlPath.length()==0){
            File commandFile = new File(mysqlPath,"bin/mysql.exe");
            if(!commandFile.exists()){
                JOptionPane.showMessageDialog(p,"Mysql path is wrong");
                p.tfMysqlPath.grabFocus();
                return;
            }
        }

        ConfigService cs= new ConfigService();
        cs.update(ConfigService.budget,p.tfBudget.getText());
        cs.update(ConfigService.mysqlPath,mysqlPath);

        JOptionPane.showMessageDialog(p, "Update configs successfully");

    }
}
