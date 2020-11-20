/* 
 * Copyright (C) 2019 Ruslan López Carro
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

import com.toedter.calendar.JHourMinuteChooser;
import inventarios.desktop.navigation.NavigationHandler;
import inventarios.service.restclient.EmployeeService;
import inventarios.to.EmployeeDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

/**
 *
 * @author IDELFONSO
 */
@Component
public class EmployeeRegistration extends JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField txtAddress;
    private JHourMinuteChooser txtArrivingTime;
    private JTextField txtFirstLastName;
    private JTextField txtId;
    private JTextField txtLastLastName;
    private JHourMinuteChooser txtLeavingTime;
    private JTextField txtName;
    private JTextField txtPosition;
    // End of variables declaration//GEN-END:variables

    @Autowired
    @Qualifier("employeeVisitor")
    private NavigationHandler navigationHandler;

    @Autowired
    private EmployeeService employeeService;

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
    
    private void clearFields() {
        txtId.setText(null);
        txtName.setText(null);
        txtFirstLastName.setText(null);
        txtLastLastName.setText(null);
        txtAddress.setText(null);
        txtPosition.setText(null);
        txtArrivingTime.setCurrentTime();
        txtLeavingTime.setCurrentTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        JPanel pnlTitle = new JPanel();
        JLabel windowTitle = new JLabel();
        JPanel pnlContents = new JPanel();
        txtId = new JTextField();
        JLabel lblId = new JLabel();
        JLabel lblFirstName = new JLabel();
        txtName = new JTextField();
        JLabel lblFirstLastName = new JLabel();
        txtFirstLastName = new JTextField();
        JLabel lblLastLastName = new JLabel();
        txtLastLastName = new JTextField();
        JLabel lblAdress = new JLabel();
        txtAddress = new JTextField();
        JLabel lblPosition = new JLabel();
        txtPosition = new JTextField();
        JPanel pnlHorary = new JPanel();
        JLabel lblArrivingTime = new JLabel();
        txtArrivingTime = new JHourMinuteChooser();
        JLabel lblLeavingTime = new JLabel();
        txtLeavingTime = new JHourMinuteChooser();
        JPanel pnlButtons = new JPanel();
        JButton btnSave = new JButton();
        JButton btnRegistro = new JButton();
        JButton btnMenu = new JButton();
        JButton btnClose = new JButton();

        setTitle("null");

        pnlTitle.setLayout(new GridBagLayout());

        windowTitle.setFont(new Font("Arial Black", 1, 18)); // NOI18N
        ResourceBundle bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        windowTitle.setText(bundle.getString("EmployeeRegistration.windowTitle.text")); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = GridBagConstraints.BASELINE;
        pnlTitle.add(windowTitle, gridBagConstraints);

        getContentPane().add(pnlTitle, BorderLayout.NORTH);

        pnlContents.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(15, 12, 0, 0);
        pnlContents.add(txtId, gridBagConstraints);

        lblId.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        lblId.setText(bundle.getString("EmployeeRegistration.lblId.text")); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(11, 10, 0, 0);
        pnlContents.add(lblId, gridBagConstraints);

        lblFirstName.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        lblFirstName.setText(bundle.getString("EmployeeRegistration.lblFirstName.text")); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(44, 10, 0, 0);
        pnlContents.add(lblFirstName, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(28, 12, 0, 0);
        pnlContents.add(txtName, gridBagConstraints);

        lblFirstLastName.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        lblFirstLastName.setText(bundle.getString("EmployeeRegistration.lblFirstLastName.text")); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(61, 10, 0, 0);
        pnlContents.add(lblFirstLastName, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(54, 12, 0, 0);
        pnlContents.add(txtFirstLastName, gridBagConstraints);

        lblLastLastName.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        lblLastLastName.setText(bundle.getString("EmployeeRegistration.lblLastLastName.text")); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(48, 10, 0, 0);
        pnlContents.add(lblLastLastName, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(48, 10, 0, 0);
        pnlContents.add(txtLastLastName, gridBagConstraints);

        lblAdress.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        lblAdress.setText(bundle.getString("EmployeeRegistration.lblAdress.text")); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(47, 10, 0, 0);
        pnlContents.add(lblAdress, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(51, 10, 0, 0);
        pnlContents.add(txtAddress, gridBagConstraints);

        lblPosition.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        lblPosition.setText(bundle.getString("EmployeeRegistration.lblPosition.text")); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(39, 10, 0, 0);
        pnlContents.add(lblPosition, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 205;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(43, 10, 0, 0);
        pnlContents.add(txtPosition, gridBagConstraints);

        pnlHorary.setLayout(new GridBagLayout());

        lblArrivingTime.setText(bundle.getString("EmployeeRegistration.lblArrivingTime.text")); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.insets = new Insets(21, 10, 0, 0);
        pnlHorary.add(lblArrivingTime, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        pnlHorary.add(txtArrivingTime, gridBagConstraints);

        lblLeavingTime.setText(bundle.getString("EmployeeRegistration.lblLeavingTime.text")); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.insets = new Insets(21, 8, 0, 0);
        pnlHorary.add(lblLeavingTime, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        pnlHorary.add(txtLeavingTime, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        pnlContents.add(pnlHorary, gridBagConstraints);

        getContentPane().add(pnlContents, BorderLayout.CENTER);

        pnlButtons.setLayout(new GridLayout(1, 4, 20, 0));

        btnSave.setFont(new Font("Verdana", 1, 18)); // NOI18N
        btnSave.setText(bundle.getString("EmployeeRegistration.btnSave.text")); // NOI18N
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlButtons.add(btnSave);

        btnRegistro.setFont(new Font("Verdana", 1, 18)); // NOI18N
        btnRegistro.setText(bundle.getString("EmployeeRegistration.btnRegistro.text")); // NOI18N
        btnRegistro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        pnlButtons.add(btnRegistro);

        btnMenu.setBackground(new Color(255, 255, 255));
        btnMenu.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        btnMenu.setText(bundle.getString("EmployeeRegistration.btnMenu.text")); // NOI18N
        btnMenu.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlButtons.add(btnMenu);

        btnClose.setText(bundle.getString("EmployeeRegistration.btnClose.text")); // NOI18N
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnlButtons.add(btnClose);

        getContentPane().add(pnlButtons, BorderLayout.SOUTH);

        setBounds(0, 0, 705, 611);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String registrationNumber = txtId.getText();
        String name = txtName.getText();
        String lastName1 = txtFirstLastName.getText();
        String lastName2 = txtLastLastName.getText();
        String domicilios = txtAddress.getText();
        String position = txtPosition.getText();
        String timeIn = txtArrivingTime.getTime();
        String timeOut = txtLeavingTime.getTime();

        EmployeeDetail b = new EmployeeDetail(null, registrationNumber, name, lastName1, lastName2, domicilios, position, timeIn, timeOut);

        employeeService.save(b);

        JOptionPane.showMessageDialog(null, "se han guardado los datos");
        clearFields();


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRegistroActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        navigationHandler.goToFrame(this, ListaEmpleados.class);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        navigationHandler.goToMenu(this);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCloseActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        navigationHandler.goToMenu(this);
    }//GEN-LAST:event_btnCloseActionPerformed
   
}
