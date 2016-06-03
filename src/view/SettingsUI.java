/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
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
        lbFontSize = new javax.swing.JLabel();
        cbSizeSpell = new javax.swing.JComboBox<String>();
        btnSaveFont = new javax.swing.JButton();
        btnCancelFont = new javax.swing.JButton();
        lbFontColor = new javax.swing.JLabel();
        lbSpell = new javax.swing.JLabel();
        lbType = new javax.swing.JLabel();
        lbMean = new javax.swing.JLabel();
        lbPhrase = new javax.swing.JLabel();
        cbSizeType = new javax.swing.JComboBox();
        cbSizeMean = new javax.swing.JComboBox();
        cbSizePhrase = new javax.swing.JComboBox();
        btnColorSpell = new javax.swing.JButton();
        btnColorType = new javax.swing.JButton();
        btnColorMean = new javax.swing.JButton();
        btnColorPhrase = new javax.swing.JButton();
        btnDefault = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings dictionary");

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(355, 350));

        btnSaveLanguage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btnSaveLanguage.setText("Save");

        btnCancelLanguage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/no.png"))); // NOI18N
        btnCancelLanguage.setText("Cancel");

        lbTitle.setText("Choose language:");

        buttonGroup1.add(btnVietnamese);
        btnVietnamese.setText("Tiếng Việt");

        buttonGroup1.add(btnEnglish);
        btnEnglish.setSelected(true);
        btnEnglish.setText("English");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(294, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSaveLanguage)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnVietnamese)
                                .addGap(26, 26, 26)
                                .addComponent(btnEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelLanguage)
                        .addGap(48, 48, 48))))
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
                .addGap(102, 102, 102)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveLanguage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelLanguage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );

        jTabbedPane1.addTab("Change Language", jPanel3);

        jPanel1.setPreferredSize(new java.awt.Dimension(350, 350));

        lbFontSize.setText("Font Size");

        cbSizeSpell.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "24", "22", "20", "18", "16" }));

        btnSaveFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        btnSaveFont.setText("Save");

        btnCancelFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/no.png"))); // NOI18N
        btnCancelFont.setText("Cancel");

        lbFontColor.setText("Font Color");

        lbSpell.setText("Spell");

        lbType.setText("Type");

        lbMean.setText("Mean");

        lbPhrase.setText("Phrase");

        cbSizeType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "22", "20", "18", "16", "14" }));

        cbSizeMean.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "20", "18", "16", "14", "12" }));

        cbSizePhrase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "20", "18", "16", "14", "12" }));

        btnDefault.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/default.png"))); // NOI18N
        btnDefault.setText("Default");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbFontSize, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbSizeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbMean)
                                            .addComponent(lbPhrase)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbType)
                                                    .addComponent(lbSpell))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addComponent(cbSizeSpell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbSizeMean, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbSizePhrase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFontColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColorSpell, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColorType, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColorMean, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColorPhrase, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveFont, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelFont, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFontSize)
                    .addComponent(lbFontColor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbSpell)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbSizeSpell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColorSpell, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSizeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbType))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSizeMean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMean)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnColorType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnColorMean, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbSizePhrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPhrase))
                    .addComponent(btnColorPhrase, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelFont)
                    .addComponent(btnDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveFont))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Font", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public JRadioButton getBtnVietNamese(){
        return this.btnVietnamese;
    }
    @Override
    public JRadioButton getBtnEnglish(){
        return this.btnEnglish;
    }
    @Override
    public void setActionBtnSaveLanguage(ActionListener listener){
        btnSaveLanguage.addActionListener(listener);
    }
    @Override
    public void setActionBtnCancelLanguage(ActionListener listener){
        btnCancelLanguage.addActionListener(listener);
    }
    @Override
    public void setActionBtnSaveFont(ActionListener listener){
        btnSaveFont.addActionListener(listener);
    }
    @Override
    public void setActionBtnCancelFont(ActionListener listener){
        btnCancelFont.addActionListener(listener);
    }
    @Override
    public void displayUI(){
        this.setVisible(true);
    }
    @Override
    public void hideUI(){
        this.setVisible(false);
    }
    
    public void setDefaultColor(){
        Color colorSpell=new Color(0,0,204);
        Color colorType=new Color(255,102,0);
        Color colorMean=new Color(102,102,102);
        Color colorPhrase=new Color(0,51,51);
        setLastWordColor(colorSpell, colorType, colorMean, colorPhrase);
    }
    public void setDefaultSize(){
        setLastWordSize(20, 20, 18, 18);
    }
    @Override
    public void setTextVietnamese(){
        btnCancelFont.setText("Hủy bỏ");
        btnCancelLanguage.setText("Hủy bỏ");
        btnSaveFont.setText("Lưu");
        btnSaveLanguage.setText("Lưu");
        lbFontSize.setText("Kích thước chữ");
        lbFontColor.setText("Màu chữ");
        lbSpell.setText("Phiên âm");
        lbType.setText("Từ loại");
        lbMean.setText("Nghĩa");
        lbPhrase.setText("Cụm từ");
        btnDefault.setText("Mặc định");
        setTitle("Cài đặt");
    }
    public void setTextEnglish(){
        btnCancelFont.setText("Cancel");
        btnCancelLanguage.setText("Cancel");
        btnSaveFont.setText("Save");
        btnSaveLanguage.setText("Save");
        lbFontSize.setText("Font Size");
        lbFontColor.setText("Font Color");
        lbSpell.setText("Spell");
        lbType.setText("Type");
        lbMean.setText("Mean");
        lbPhrase.setText("Phrases");
        btnDefault.setText("Default");
        //lbTitle.setText("Chọn ngôn ngữ hiển thị");
        setTitle("Setting");
        //this.repaint();
    }
    public void setActionBtnColorSpell(ActionListener listener){
        btnColorSpell.addActionListener(listener);
    }
    public void setActionBtnColorType(ActionListener listener){
        btnColorType.addActionListener(listener);
    }
    public void setActionBtnColorMean(ActionListener listener){
        btnColorMean.addActionListener(listener);
    }
    public void setActionBtnColorPhrase(ActionListener listener){
        btnColorPhrase.addActionListener(listener);
    }
    public void setBtnDefaultAction(ActionListener listener){
        btnDefault.addActionListener(listener);
    }
    
    public void setBackGroundBtnColorSpell(Color color){
        btnColorSpell.setBackground(color);
    }
    public void setBackGroundBtnColorType(Color color){
        btnColorType.setBackground(color);
    }
    public void setBackGroundBtnColorMean(Color color){
        btnColorMean.setBackground(color);
    }
    public void setBackGroundBtnColorPhrase(Color color){
        btnColorPhrase.setBackground(color);
    }
    public void setLastWorkLanguage(int language){
        if(language==1)
            btnEnglish.doClick();
        else btnVietnamese.doClick();
    }
    public void setLastWordSize(int sizeSpell,int sizeWordType,int sizeWordMean,int sizePhrase){
        String spell=String.valueOf(sizeSpell);
        String type=String.valueOf(sizeWordType);
        String mean=String.valueOf(sizeWordMean);
        String phrase=String.valueOf(sizePhrase);
        cbSizeSpell.setSelectedItem(spell);
        cbSizeType.setSelectedItem(type);
        cbSizeMean.setSelectedItem(mean);
        cbSizePhrase.setSelectedItem(phrase);
    }
    public void setLastWordColor(Color colorSpell,Color colorWordType,Color colorWordMean,Color colorPhrase){
        btnColorSpell.setBackground(colorSpell);
        btnColorType.setBackground(colorWordType);
        btnColorMean.setBackground(colorWordMean);
        btnColorPhrase.setBackground(colorPhrase);
    }
    public Integer getSizeSpell(){
        return Integer.parseInt(cbSizeSpell.getSelectedItem().toString());
    }
    public Integer getSizeType(){
        return Integer.parseInt(cbSizeType.getSelectedItem().toString());
    }
    public Integer getSizeMean(){
        return Integer.parseInt(cbSizeMean.getSelectedItem().toString());
    }
    public Integer getSizePhrase(){
        return Integer.parseInt(cbSizePhrase.getSelectedItem().toString());
    }
    public String getColorSpell(){
        return Integer.toString(btnColorSpell.getBackground().getRGB());
    }
    public String getColorType(){
        return Integer.toString(btnColorType.getBackground().getRGB());
    }
    public String getColorMean(){
        return Integer.toString(btnColorMean.getBackground().getRGB());
    }
    public String getColorPhrase(){
        return Integer.toString(btnColorPhrase.getBackground().getRGB());
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
    private javax.swing.JButton btnColorMean;
    private javax.swing.JButton btnColorPhrase;
    private javax.swing.JButton btnColorSpell;
    private javax.swing.JButton btnColorType;
    private javax.swing.JButton btnDefault;
    private javax.swing.JRadioButton btnEnglish;
    private javax.swing.JButton btnSaveFont;
    private javax.swing.JButton btnSaveLanguage;
    private javax.swing.JRadioButton btnVietnamese;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbSizeMean;
    private javax.swing.JComboBox cbSizePhrase;
    private javax.swing.JComboBox<String> cbSizeSpell;
    private javax.swing.JComboBox cbSizeType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbFontColor;
    private javax.swing.JLabel lbFontSize;
    private javax.swing.JLabel lbMean;
    private javax.swing.JLabel lbPhrase;
    private javax.swing.JLabel lbSpell;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbType;
    // End of variables declaration//GEN-END:variables
}
