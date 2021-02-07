/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import model.DriverLicenseInfo;

/**
 *
 * @author zzz
 */
public class ViewDriverLicenseInfo extends javax.swing.JPanel {

    /**
     * Creates new form ViewDriverLicenseInfo
     */
    DriverLicenseInfo driverLicenseInfo;
    public ViewDriverLicenseInfo(DriverLicenseInfo driverLicenseInfo) {
        initComponents();
        txt_LicenseNumber.setText(driverLicenseInfo.getLicenseNumber());
        txt_DateItWasIssued.setText(driverLicenseInfo.getDateItWasIssued());
        txt_DateOfExpiration.setText(driverLicenseInfo.getDateOfExpiration());
        txt_BloodType.setText(driverLicenseInfo.getBloodType());
        ImageIcon icon = new ImageIcon(driverLicenseInfo.getPicture());
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(187, 128, Image.SCALE_DEFAULT);
        icon.setImage(newImage);
        IMG.setIcon(icon);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_LicenseNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IMG = new javax.swing.JLabel();
        txt_DateOfExpiration = new javax.swing.JTextField();
        txt_BloodType = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_DateItWasIssued = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        txt_LicenseNumber.setEditable(false);
        txt_LicenseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LicenseNumberActionPerformed(evt);
            }
        });

        jLabel3.setText("DateOfExpiration");

        IMG.setBackground(new java.awt.Color(204, 255, 204));

        txt_DateOfExpiration.setEditable(false);

        txt_BloodType.setEditable(false);

        jLabel4.setText("BloodType");

        jLabel1.setText("LicenseNumber");

        jLabel2.setText("DateItWasIssued");

        txt_DateItWasIssued.setEditable(false);

        jLabel5.setText("Picture");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_LicenseNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txt_DateItWasIssued, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txt_DateOfExpiration, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txt_BloodType, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(IMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_LicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_DateItWasIssued, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_DateOfExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_BloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IMG, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_LicenseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LicenseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LicenseNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IMG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_BloodType;
    private javax.swing.JTextField txt_DateItWasIssued;
    private javax.swing.JTextField txt_DateOfExpiration;
    private javax.swing.JTextField txt_LicenseNumber;
    // End of variables declaration//GEN-END:variables
}
