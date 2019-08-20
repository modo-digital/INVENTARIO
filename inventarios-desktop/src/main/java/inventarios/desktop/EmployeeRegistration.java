/* 
 * Copyright (C) 2019 Ruslan LÃ³pez Carro
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package inventarios.desktop;

import inventarios.desktop.navigation.NavigationHandler;
import inventarios.service.EmployeeService;
import inventarios.to.EmployeeDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author IDELFONSO
 */
@Component
public class EmployeeRegistration extends javax.swing.JFrame {

    NavigationHandler navigationHandler;

    EmployeeService employeeService;

    @Autowired
    public EmployeeRegistration(
            @Qualifier("employeeVisitor") NavigationHandler navigationHandler,
            EmployeeService employeeService) {
        this.navigationHandler = navigationHandler;
        this.employeeService = employeeService;
    }

    /**
     * Creates new form Empleados
     */
    public EmployeeRegistration() {
        initComponents();
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno;
        uno = new ImageIcon(this.getClass().getResource("/ImgFondos/abstract.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlTitle = new javax.swing.JPanel();
        windowTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblFirstLastName = new javax.swing.JLabel();
        txtFirstLastName = new javax.swing.JTextField();
        lblLastLastName = new javax.swing.JLabel();
        txtLastLastName = new javax.swing.JTextField();
        lblAdress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPosition = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lblArrivingTime = new javax.swing.JLabel();
        txtArrivingTime = new javax.swing.JTextField();
        lblLeavingTime = new javax.swing.JLabel();
        txtLeavingTime = new javax.swing.JTextField();
        pnlButtons = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("inventarios/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("EmployeeRegistration.title")); // NOI18N

        pnlTitle.setLayout(new java.awt.GridBagLayout());

        windowTitle.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        java.util.ResourceBundle bundle1 = java.util.ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        windowTitle.setText(bundle1.getString("EmployeeRegistration.windowTitle.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        pnlTitle.add(windowTitle, gridBagConstraints);

        getContentPane().add(pnlTitle, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblId.setText(bundle1.getString("EmployeeRegistration.lblId.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jPanel1.add(lblId, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 12, 0, 0);
        jPanel1.add(txtId, gridBagConstraints);

        lblFirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFirstName.setText(bundle1.getString("EmployeeRegistration.lblFirstName.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 10, 0, 0);
        jPanel1.add(lblFirstName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 12, 0, 0);
        jPanel1.add(txtName, gridBagConstraints);

        lblFirstLastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFirstLastName.setText(bundle1.getString("EmployeeRegistration.lblFirstLastName.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(61, 10, 0, 0);
        jPanel1.add(lblFirstLastName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 12, 0, 0);
        jPanel1.add(txtFirstLastName, gridBagConstraints);

        lblLastLastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLastLastName.setText(bundle1.getString("EmployeeRegistration.lblLastLastName.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 10, 0, 0);
        jPanel1.add(lblLastLastName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 10, 0, 0);
        jPanel1.add(txtLastLastName, gridBagConstraints);

        lblAdress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdress.setText(bundle1.getString("EmployeeRegistration.lblAdress.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(47, 10, 0, 0);
        jPanel1.add(lblAdress, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 10, 0, 0);
        jPanel1.add(txtAddress, gridBagConstraints);

        lblPosition.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPosition.setText(bundle1.getString("EmployeeRegistration.lblPosition.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 10, 0, 0);
        jPanel1.add(lblPosition, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 10, 0, 0);
        jPanel1.add(txtPosition, gridBagConstraints);

        lblArrivingTime.setText(bundle1.getString("EmployeeRegistration.lblArrivingTime.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        jPanel1.add(lblArrivingTime, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 65, 0);
        jPanel1.add(txtArrivingTime, gridBagConstraints);

        lblLeavingTime.setText(bundle1.getString("EmployeeRegistration.lblLeavingTime.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 8, 0, 0);
        jPanel1.add(lblLeavingTime, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 65, 55);
        jPanel1.add(txtLeavingTime, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        btnSave.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnSave.setText(bundle1.getString("EmployeeRegistration.btnSave.text")); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setText(bundle1.getString("EmployeeRegistration.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMenu.setText(bundle1.getString("EmployeeRegistration.btnMenu.text")); // NOI18N
        btnMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnClose.setText(bundle1.getString("EmployeeRegistration.btnClose.text")); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave)
                .addGap(74, 74, 74)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(btnClose)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(jButton2)
                    .addComponent(btnMenu)
                    .addComponent(btnClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlButtons, java.awt.BorderLayout.SOUTH);

        setBounds(0, 0, 649, 611);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String registrationNumber = txtId.getText();
        String name = txtName.getText();
        String lastName1 = txtFirstLastName.getText();
        String lastName2 = txtLastLastName.getText();
        String domicilios = txtAddress.getText();
        String position = txtPosition.getText();
        String timeIn = txtArrivingTime.getText();
        String timeOut = txtLeavingTime.getText();

        EmployeeDetail b = new EmployeeDetail(null, registrationNumber, name, lastName1, lastName2, domicilios, position, timeIn, timeOut);

        employeeService.save(b);

        JOptionPane.showMessageDialog(null, "se han guardado los datos");
        clearFields();


    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        navigationHandler.goToFrame(this, ListaEmpleados.class);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        navigationHandler.goToMenu(this);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblArrivingTime;
    private javax.swing.JLabel lblFirstLastName;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLastLastName;
    private javax.swing.JLabel lblLeavingTime;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtArrivingTime;
    private javax.swing.JTextField txtFirstLastName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastLastName;
    private javax.swing.JTextField txtLeavingTime;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JLabel windowTitle;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        txtId.setText(null);
        txtName.setText(null);
        txtFirstLastName.setText(null);
        txtLastLastName.setText(null);
        txtAddress.setText(null);
        txtPosition.setText(null);
        txtArrivingTime.setText(null);
        txtLeavingTime.setText(null);
    }
}
