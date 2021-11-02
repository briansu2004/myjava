/**
 * converts a decimal, binary, and hexadecimal
 *
 * modified 20210823
 * date 20210823
 *
 * @filename BinaryHexadecimal.java
 * @author Emily Su
 * @version 1.0
 */

// note: although the custom subroutines do not do much, I still created them for the demands of the assignment 
public class BinaryHexadecimal extends javax.swing.JFrame {

    public static String decToBin(String userInput) {

        String binary;

        binary = Integer.toBinaryString(Integer.parseInt(userInput)); // https://beginnersbook.com/2014/07/java-program-to-convert-decimal-to-binary/

        return binary;

    }

    public static String binToDec(String userInput) {

        String decimal;

        decimal = String.valueOf(Integer.parseInt(userInput, 2)); // https://beginnersbook.com/2014/07/java-program-for-binary-to-decimal-conversion/

        return decimal;

    }

    public static String decToHex(String userInput) {

        String hexadecimal;

        hexadecimal = Integer.toHexString(Integer.parseInt(userInput)); // https://beginnersbook.com/2014/07/java-program-to-convert-decimal-to-hexadecimal/

        return hexadecimal;

    }

    public static String hexToDec(String userInput) {

        String decimal;

        decimal = String.valueOf(Integer.parseInt(userInput, 16)); // https://beginnersbook.com/2019/04/java-hexadecimal-to-decimal-conversion/

        return decimal;

    }

    public static boolean isInteger(String userInput) {

        boolean valid = true;

        try {
            Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            valid = false;
        }

        return valid;

    }

    /**
     * Creates new form BinaryHexadecimal
     */
    public BinaryHexadecimal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblSubheader1 = new javax.swing.JLabel();
        lblSubheader2 = new javax.swing.JLabel();
        lblInst1 = new javax.swing.JLabel();
        lblInst2 = new javax.swing.JLabel();
        lblInst3 = new javax.swing.JLabel();
        lblInst4 = new javax.swing.JLabel();
        lblDecBin = new javax.swing.JLabel();
        lblBinDec = new javax.swing.JLabel();
        lblDecHex = new javax.swing.JLabel();
        lblHexDec = new javax.swing.JLabel();
        txtDecBin = new javax.swing.JTextField();
        txtBinDec = new javax.swing.JTextField();
        txtHexDec = new javax.swing.JTextField();
        btnDecBin = new javax.swing.JButton();
        btnBinDec = new javax.swing.JButton();
        btnDecHex = new javax.swing.JButton();
        btnHexDec = new javax.swing.JButton();
        txtDecHex = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblHeader.setText("--NUMBER SYSTEMS--");

        lblSubheader1.setText("Decimal and Binary");

        lblSubheader2.setText("Decimal and Hexadecimal");

        lblInst1.setText("Enter a decimal number:");

        lblInst2.setText("Enter a binary number:");

        lblInst3.setText("Enter a decimal number:");

        lblInst4.setText("Enter a hexadecimal number:");

        lblDecBin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDecBin.setText("...");

        lblBinDec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBinDec.setText("...");

        lblDecHex.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDecHex.setText("...");

        lblHexDec.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHexDec.setText("...");

        btnDecBin.setText("Dec. To Bin.");
        btnDecBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecBinActionPerformed(evt);
            }
        });

        btnBinDec.setText("Bin. To Dec.");
        btnBinDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinDecActionPerformed(evt);
            }
        });

        btnDecHex.setText("Dec. To Hex.");
        btnDecHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecHexActionPerformed(evt);
            }
        });

        btnHexDec.setText("Hex. To Dec. ");
        btnHexDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexDecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInst4)
                    .addComponent(lblInst3)
                    .addComponent(lblInst1)
                    .addComponent(lblInst2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBinDec)
                    .addComponent(lblDecHex)
                    .addComponent(lblHexDec))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSubheader2)
                        .addGap(398, 398, 398))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSubheader1)
                        .addGap(417, 417, 417))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHeader, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBinDec, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDecBin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDecBin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBinDec, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHexDec, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDecHex, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDecHex, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnHexDec, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                        .addComponent(lblDecBin)
                        .addGap(38, 38, 38)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblHeader)
                .addGap(31, 31, 31)
                .addComponent(lblSubheader1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInst1)
                    .addComponent(lblDecBin)
                    .addComponent(txtDecBin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDecBin))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInst2)
                    .addComponent(lblBinDec)
                    .addComponent(txtBinDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBinDec))
                .addGap(115, 115, 115)
                .addComponent(lblSubheader2)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInst3)
                    .addComponent(lblDecHex)
                    .addComponent(btnDecHex)
                    .addComponent(txtDecHex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInst4)
                    .addComponent(lblHexDec)
                    .addComponent(txtHexDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHexDec))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDecBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecBinActionPerformed

        String decimalString;

        decimalString = txtDecBin.getText();

        if (isInteger(decimalString) == true) {
            lblDecBin.setText(decToBin(decimalString));
        } else {
            lblDecBin.setText("Invalid");
        }

    }//GEN-LAST:event_btnDecBinActionPerformed

    private void btnBinDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinDecActionPerformed

        String binaryString;

        binaryString = txtBinDec.getText();

        try {
            lblBinDec.setText(binToDec(binaryString));
        } catch (NumberFormatException e) {
            lblBinDec.setText("Invalid");
        }

    }//GEN-LAST:event_btnBinDecActionPerformed

    private void btnDecHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecHexActionPerformed

        String decimalString;

        decimalString = txtDecHex.getText();

        if (isInteger(decimalString) == true) {
            lblDecHex.setText(decToHex(decimalString));
        } else {
            lblDecHex.setText("Invalid");
        }

    }//GEN-LAST:event_btnDecHexActionPerformed

    private void btnHexDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexDecActionPerformed

        String hexadecimalString;

        hexadecimalString = txtHexDec.getText();

        try {
            lblHexDec.setText(hexToDec(hexadecimalString));
        } catch (NumberFormatException e) {
            lblHexDec.setText("Invalid");
        }

    }//GEN-LAST:event_btnHexDecActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BinaryHexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BinaryHexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BinaryHexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BinaryHexadecimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinaryHexadecimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinDec;
    private javax.swing.JButton btnDecBin;
    private javax.swing.JButton btnDecHex;
    private javax.swing.JButton btnHexDec;
    private javax.swing.JLabel lblBinDec;
    private javax.swing.JLabel lblDecBin;
    private javax.swing.JLabel lblDecHex;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHexDec;
    private javax.swing.JLabel lblInst1;
    private javax.swing.JLabel lblInst2;
    private javax.swing.JLabel lblInst3;
    private javax.swing.JLabel lblInst4;
    private javax.swing.JLabel lblSubheader1;
    private javax.swing.JLabel lblSubheader2;
    private javax.swing.JTextField txtBinDec;
    private javax.swing.JTextField txtDecBin;
    private javax.swing.JTextField txtDecHex;
    private javax.swing.JTextField txtHexDec;
    // End of variables declaration//GEN-END:variables
}