/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

/**
 *
 * @author Monkey-private
 */
public class SettingsUI extends javax.swing.JFrame implements ISettingsUI{

    /**
     * Creates new form SettingsUI
     */
    public SettingsUI() {
        initComponents();
        setLocationRelativeTo(null);
        
        //setVisible(true);
    }
    public void setBtnSaveLanguageActionListener(ActionListener listener){
        this.btnSaveLanguage.addActionListener(listener);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnSaveLanguage = new javax.swing.JButton();
        btnCancelLanguage = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        btnVietnamese = new javax.swing.JRadioButton();
        btnEnglish = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        lbFontStyle = new javax.swing.JLabel();
        lbFontSize = new javax.swing.JLabel();
        cbbFontStyle = new javax.swing.JComboBox<String>();
        cbbFontSize = new javax.swing.JComboBox<String>();
        ccFontColor = new javax.swing.JColorChooser();
        btnSaveFont = new javax.swing.JButton();
        btnCancelFont = new javax.swing.JButton();
        lbFontColor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings dictionary");

        btnSaveLanguage.setText("Save");

        btnCancelLanguage.setText("Cancel");
        btnCancelLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelLanguageActionPerformed(evt);
            }
        });

        lbTitle.setText("Choose language:");

        buttonGroup1.add(btnVietnamese);
        btnVietnamese.setText("Tiếng Việt");
        btnVietnamese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVietnameseActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnEnglish);
        btnEnglish.setSelected(true);
        btnEnglish.setText("English");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(btnSaveLanguage, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelLanguage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVietnamese)
                        .addGap(26, 26, 26)
                        .addComponent(btnEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(434, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVietnamese)
                    .addComponent(btnEnglish))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveLanguage)
                    .addComponent(btnCancelLanguage))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Change Language", jPanel3);

        lbFontStyle.setText("Font Style");

        lbFontSize.setText("Font Size");

        cbbFontStyle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbbFontSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSaveFont.setText("Save");

        btnCancelFont.setText("Cancel");

        lbFontColor.setText("Font Color");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbFontStyle, 0, 118, Short.MAX_VALUE)
                            .addComponent(lbFontStyle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFontSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbFontSize, 0, 107, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSaveFont, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelFont)
                        .addGap(42, 42, 42))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ccFontColor, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbFontColor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbFontStyle, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lbFontSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbFontSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbFontStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbFontColor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(ccFontColor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveFont)
                    .addComponent(btnCancelFont))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Font", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelLanguageActionPerformed

    private void btnVietnameseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVietnameseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVietnameseActionPerformed
    public JRadioButton getBtnVietNamese(){
        return this.btnVietnamese;
    }
    public JRadioButton getBtnEnglish(){
        return this.btnEnglish;
    }
    public void setActionBtnSaveLanguage(ActionListener listener){
        btnSaveLanguage.addActionListener(listener);
    }
    public void setActionBtnCancelLanguage(ActionListener listener){
        btnCancelLanguage.addActionListener(listener);
    }
    public void setActionBtnSaveFont(ActionListener listener){
        btnSaveFont.addActionListener(listener);
    }
    public void setActionBtnCancelFont(ActionListener listener){
        btnCancelFont.addActionListener(listener);
    }
    public void displayUI(){
        this.setVisible(true);
    }
    public void hideUI(){
        this.setVisible(false);
    }
    public void setTextVietnamese(){
        btnCancelFont.setText("Hủy bỏ");
        btnCancelLanguage.setText("Hủy bỏ");
        btnSaveFont.setText("Lưu");
        btnSaveLanguage.setText("lưu");
        //lbTitle.setText("Chọn ngôn ngữ hiển thị");
        setTitle("Cài đặt");
        this.repaint();
    }
    public void setTextEnglish(){
         btnCancelFont.setText("Cancel");
        btnCancelLanguage.setText("Cancel");
        btnSaveFont.setText("Save");
        btnSaveLanguage.setText("Save");
        //lbTitle.setText("Chọn ngôn ngữ hiển thị");
        setTitle("Setting");
        this.repaint();
    }
 //        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SettingsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SettingsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SettingsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SettingsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelFont;
    private javax.swing.JButton btnCancelLanguage;
    private javax.swing.JRadioButton btnEnglish;
    private javax.swing.JButton btnSaveFont;
    private javax.swing.JButton btnSaveLanguage;
    private javax.swing.JRadioButton btnVietnamese;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbFontSize;
    private javax.swing.JComboBox<String> cbbFontStyle;
    private javax.swing.JColorChooser ccFontColor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbFontColor;
    private javax.swing.JLabel lbFontSize;
    private javax.swing.JLabel lbFontStyle;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
