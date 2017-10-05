package project001;

import com.sun.xml.internal.bind.v2.TODO;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.io.File;
import javax.print.*;

import java.awt.Dimension;
import java.awt.DisplayMode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
//import java.nio.charset.Charset;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;

//import javax.

import javax.swing.filechooser.FileSystemView;

public class Home extends javax.swing.JFrame {

    SettingsConfig settingsConfig;

    public Home() {
        initComponents();
        setTitle("Puerta 18");
        setResizable(false);
        settingsConfig = new SettingsConfig();
        for (int i = 10; i < 55; i++) {
            cBoxFontSize.addItem("" + i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabInsertData = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnConfirmSettings = new javax.swing.JButton();
        cBoxProjectorName = new javax.swing.JComboBox<>();
        cBoxProjectorResolution = new javax.swing.JComboBox<>();
        cBoxFontName = new javax.swing.JComboBox<>(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
        cBoxSensorType = new javax.swing.JComboBox<>();
        cBoxFontSize = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        txtFear = new javax.swing.JTextField();
        btnAddFear = new javax.swing.JButton();
        listFears = new java.awt.List();
        btnFinish = new javax.swing.JButton();
        listStrengths = new java.awt.List();
        btnAddStrength = new javax.swing.JButton();
        txtStregth = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConfirmSettings.setText("Cofirm");
        btnConfirmSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmSettingsActionPerformed(evt);
            }
        });

        cBoxProjectorName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Epson", "HP", "Hitachi" }));

        cBoxProjectorResolution.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "920x760", "1920x1080" }));

        cBoxSensorType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KINECT" }));
        cBoxSensorType.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cBoxSensorType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cBoxProjectorName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cBoxProjectorResolution, javax.swing.GroupLayout.Alignment.TRAILING, 0, 142, Short.MAX_VALUE))
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cBoxFontSize, 0, 142, Short.MAX_VALUE)
                            .addComponent(cBoxFontName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxSensorType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxFontName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxProjectorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxFontSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(cBoxProjectorResolution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnConfirmSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabInsertData.addTab("Settings", jPanel1);

        btnAddFear.setText("Add");
        btnAddFear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFearActionPerformed(evt);
            }
        });

        listFears.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listFearsMouseClicked(evt);
            }
        });

        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        listStrengths.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listStrengthsMouseClicked(evt);
            }
        });

        btnAddStrength.setText("Add");
        btnAddStrength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStrengthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listFears, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFear, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddFear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listStrengths, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtStregth, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddStrength, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddFear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listFears, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStregth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddStrength))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listStrengths, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinish, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
        );

        tabInsertData.addTab("Insert Data", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabInsertData)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabInsertData)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnConfirmSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmSettingsActionPerformed

        getSettingsConfig().setSensorType(cBoxSensorType.getSelectedItem().toString());
        getSettingsConfig().setProjectorName(cBoxProjectorName.getSelectedItem().toString());
        getSettingsConfig().setProjectorResolution(cBoxProjectorResolution.getSelectedItem().toString());
        getSettingsConfig().setFontName(cBoxFontName.getSelectedItem().toString());
        getSettingsConfig().setFontSize(cBoxFontSize.getSelectedItem().toString());

//        System.out.println(getSettingsConfig());


//        System.out.println("" + System.getProperty("os.name"));


        /*
            Discos conectados
        
        File unidades[] = File.listRoots();

        for (int i = 0; i < unidades.length; i++) {
            System.out.println(unidades[i]);
            System.out.println(FileSystemView.getFileSystemView().getSystemDisplayName(unidades[i]));
        }
         */
        
//        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
//        System.out.println("Number of print services: " + printServices.length);
//
//        for (PrintService printer : printServices) {
//            System.out.println("Printer: " + printer.getName());
//        }
        
        

    }//GEN-LAST:event_btnConfirmSettingsActionPerformed

    private void btnAddFearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFearActionPerformed
        
        listFears.addItem(txtFear.getText());
        txtFear.setText("");
        
    }//GEN-LAST:event_btnAddFearActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        String fears = "";
        int fearItems = listFears.getItemCount();
        
        String strengths = "";
        int strengthItems = listStrengths.getItemCount();
        
        if(listFears != null && fearItems > 0 && listStrengths != null && strengthItems > 0){
            for(int i = 0 ; i < fearItems; i++){
                if((i+1) == fearItems){
                    fears = fears + listFears.getItem(i);
                }else{
                   fears = fears + listFears.getItem(i) + ","; 
                }
            }
            
            for(int i = 0 ; i < strengthItems; i++){
                if((i+1) == strengthItems){
                    strengths = strengths + listStrengths.getItem(i);
                }else{
                   strengths = strengths + listStrengths.getItem(i) + ","; 
                }
            }
            
            getSettingsConfig().setFears(fears);
            getSettingsConfig().setStrengths(strengths);
            
            printTxt();
            
//            System.out.println(getSettingsConfig().getFears());
//            System.out.println(getSettingsConfig().getStrengths());
        }
        
    }//GEN-LAST:event_btnFinishActionPerformed
    

    private void printTxt(){
        PrintWriter outPutStream;
        try {
            outPutStream = new PrintWriter("config.txt");
            outPutStream.println("AnimationType=ANIMACION1");
            outPutStream.println("SensorType="+ getSettingsConfig().getSensorType());
            outPutStream.println("CameraName=ABC");
            outPutStream.println("Fears="+ getSettingsConfig().getFears());
            outPutStream.println("Strengths="+ getSettingsConfig().getStrengths());
            outPutStream.println("ProjectorResolution="+ getSettingsConfig().getProjectorResolution());
            outPutStream.println("ProjectorName="+ getSettingsConfig().getProjectorName());
            outPutStream.println("FontName="+ getSettingsConfig().getFontName());
            outPutStream.println("FontSize="+getSettingsConfig().getFontSize());
            outPutStream.println("DisalignConversionFactor=5.5");
            outPutStream.close();
            System.out.println("Done");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Project001.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void btnAddStrengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStrengthActionPerformed
        
        listStrengths.addItem(txtStregth.getText());
        txtStregth.setText("");
        
    }//GEN-LAST:event_btnAddStrengthActionPerformed

    private void listFearsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listFearsMouseClicked
        
        int fearDel = JOptionPane.showConfirmDialog(null, "Do You Want To Delete ' " + listFears.getSelectedItem() + " '", "Clear", JOptionPane.YES_NO_OPTION );
        if(fearDel == 0){
            listFears.delItem(listFears.getSelectedIndex());
        }
        
    }//GEN-LAST:event_listFearsMouseClicked

    private void listStrengthsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listStrengthsMouseClicked
        
        int strengthDel = JOptionPane.showConfirmDialog(null, "Do You Want To Delete ' " + listStrengths.getSelectedItem() + " '", "Clear", JOptionPane.YES_NO_OPTION );
        if(strengthDel == 0){
            listStrengths.delItem(listStrengths.getSelectedIndex());
        }
        
    }//GEN-LAST:event_listStrengthsMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    /*
        Getters && Setters
     */
    public SettingsConfig getSettingsConfig() {
        return settingsConfig;
    }

    public void setSettingsConfig(SettingsConfig settingsConfig) {
        this.settingsConfig = settingsConfig;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFear;
    private javax.swing.JButton btnAddStrength;
    private javax.swing.JButton btnConfirmSettings;
    private javax.swing.JButton btnFinish;
    private javax.swing.JComboBox<String> cBoxFontName;
    private javax.swing.JComboBox<String> cBoxFontSize;
    private javax.swing.JComboBox<String> cBoxProjectorName;
    private javax.swing.JComboBox<String> cBoxProjectorResolution;
    private javax.swing.JComboBox<String> cBoxSensorType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.List listFears;
    private java.awt.List listStrengths;
    private javax.swing.JTabbedPane tabInsertData;
    private javax.swing.JTextField txtFear;
    private javax.swing.JTextField txtStregth;
    // End of variables declaration//GEN-END:variables
}
