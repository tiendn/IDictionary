/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Dictionary;

/**
 *
 * @author Monkey-private
 */
public class MainUI extends javax.swing.JFrame implements IMainUI {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
        taMeaning.setEditable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton4 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnelDictionary = new javax.swing.JPanel();
        btnVE = new javax.swing.JButton();
        lbToolTip = new javax.swing.JLabel();
        btnEV = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();
        btnListen = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnTranslateSentence = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        pnelHelp = new javax.swing.JPanel();
        btnAbout = new javax.swing.JButton();
        btnHelpContents = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taMeaning = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        listIndex = new javax.swing.JList<String>();
        tfSearch = new javax.swing.JTextField();
        lbSearch = new javax.swing.JLabel();
        lbListWords = new javax.swing.JLabel();
        lbListResults = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listResults = new javax.swing.JList<String>();
        btnSettings = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbWord = new javax.swing.JLabel();
        btnSound = new javax.swing.JButton();

        jButton4.setText("jButton4");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton4)
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButton4)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IDictionary ");

        btnVE.setText("V-E");
        btnVE.setToolTipText("Previous entry");
        btnVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVEActionPerformed(evt);
            }
        });

        lbToolTip.setText("jLabel1");

        btnEV.setText("E-V");
        btnEV.setToolTipText("Next Entry");

        btnCopy.setText("Copy");

        btnListen.setText("Listen");

        btnPrint.setText("Print");

        javax.swing.GroupLayout pnelDictionaryLayout = new javax.swing.GroupLayout(pnelDictionary);
        pnelDictionary.setLayout(pnelDictionaryLayout);
        pnelDictionaryLayout.setHorizontalGroup(
            pnelDictionaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnelDictionaryLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnelDictionaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVE, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btnListen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbToolTip, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnelDictionaryLayout.setVerticalGroup(
            pnelDictionaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelDictionaryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnelDictionaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListen, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(lbToolTip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnelDictionaryLayout.createSequentialGroup()
                        .addComponent(btnVE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEV)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dictionary & Culture", pnelDictionary);

        btnTranslateSentence.setText("Translate Sentence");

        btnExport.setText("Export ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnTranslateSentence)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 406, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTranslateSentence, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tools", jPanel1);

        btnAbout.setText("About");

        btnHelpContents.setText("Help Contents");

        javax.swing.GroupLayout pnelHelpLayout = new javax.swing.GroupLayout(pnelHelp);
        pnelHelp.setLayout(pnelHelpLayout);
        pnelHelpLayout.setHorizontalGroup(
            pnelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelHelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHelpContents, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 408, Short.MAX_VALUE))
        );
        pnelHelpLayout.setVerticalGroup(
            pnelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnelHelpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnelHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHelpContents, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Help", pnelHelp);

        taMeaning.setColumns(20);
        taMeaning.setLineWrap(true);
        taMeaning.setRows(5);
        taMeaning.setWrapStyleWord(true);
        taMeaning.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(taMeaning);

        listIndex.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listIndex);

        tfSearch.setToolTipText("Enter word here");

        lbSearch.setLabelFor(tfSearch);
        lbSearch.setText("Search");
        lbSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbListWords.setLabelFor(listIndex);
        lbListWords.setText("Index");
        lbListWords.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbListResults.setLabelFor(listResults);
        lbListResults.setText("Results");
        lbListResults.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listResults.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listResults);

        btnSettings.setText("Settings");

        lbWord.setText("Word");

        btnSound.setText("sounds");
        btnSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbWord, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnSound)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbListWords, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbListResults, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(tfSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSettings))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTabbedPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addGap(21, 21, 21))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(btnSettings)
                .addGap(14, 14, 14)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(lbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbListWords, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbListResults, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        jDesktopPane1.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbListWords, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbListResults, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnSettings, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSoundActionPerformed

    private void btnVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVEActionPerformed
    @Override
    public void setListIndexValueChanged(javax.swing.event.ListSelectionListener listener) {                                       
        // TODO add your handling code here:
        this.listIndex.addListSelectionListener(listener);
    }                                      

    @Override
    public void setTfSearchKeyListener(java.awt.event.KeyListener evt) {                                     
        // TODO add your handling code here:
        this.tfSearch.addKeyListener(evt);
    }                                    

         
    @Override
    public void setBtnSettingsActionListener(java.awt.event.ActionListener evt) {                                            
        // TODO add your handling code here:
        this.btnSettings.addActionListener(evt);
    }                                           

    @Override
    public void setBtnPrintActionListener(java.awt.event.ActionListener evt) {                                         
        // TODO add your handling code here:
        this.btnPrint.addActionListener(evt);
    }                                        

    @Override
    public void setBtnTranslateSentenceActionListener(java.awt.event.ActionListener evt) {                                                     
        this.btnTranslateSentence.addActionListener(evt);
    }                                                    

    @Override
    public void setBtnVEActionListener(java.awt.event.ActionListener evt) {                                             
        // TODO add your handling code here:
        this.btnVE.addActionListener(evt);
    }                                            

    @Override
    public void setBtnEVActionListener(java.awt.event.ActionListener evt) {                                             
        // TODO add your handling code here:
        this.btnEV.addActionListener(evt);
    }                                            

    @Override
    public void setBtnListenActionListener(ActionListener listener) {                                          
        // TODO add your handling code here:
        this.btnListen.addActionListener(listener);
    }                                         

    @Override
    public void setBtnCopyActionListener(java.awt.event.ActionListener evt) {                                        
        // TODO add your handling code here:
        this.btnCopy.addActionListener(evt);
    }                                       

    @Override
    public void setBtnHelpContentsActionListener(java.awt.event.ActionListener evt) {                                                
        // TODO add your handling code here:
        this.btnHelpContents.addActionListener(evt);
    }  
    @Override
    public void setBtnAboutActionListener(java.awt.event.ActionListener evt) {
        this.btnAbout.addActionListener(evt);
    }
    public void setBtnSoundActionListener(ActionListener evt){
        btnSound.addActionListener(evt);
    }
    public void setTaMeaningAction(MouseAdapter listener){
        taMeaning.addMouseListener(listener);
    }
    @Override
    public JList getListIndex(){
        return this.listIndex;
    }
    @Override
    public JTextArea getTaMeaning(){
        return this.taMeaning;
    }
    @Override
    public JTextField getTfSearch(){
        return this.tfSearch;
    }
    public JLabel getLabelWord(){
        return lbWord;
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
//            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAbout;
    public javax.swing.JButton btnCopy;
    private javax.swing.JButton btnEV;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnHelpContents;
    private javax.swing.JButton btnListen;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnSound;
    private javax.swing.JButton btnTranslateSentence;
    private javax.swing.JButton btnVE;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbListResults;
    private javax.swing.JLabel lbListWords;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lbToolTip;
    private javax.swing.JLabel lbWord;
    private javax.swing.JList<String> listIndex;
    private javax.swing.JList<String> listResults;
    private javax.swing.JPanel pnelDictionary;
    private javax.swing.JPanel pnelHelp;
    private javax.swing.JTextArea taMeaning;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
