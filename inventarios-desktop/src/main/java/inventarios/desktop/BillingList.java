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

import inventarios.desktop.navigation.NavigationHandler;
import inventarios.service.restclient.BillingService;
import inventarios.to.BillingDetails;
import inventarios.util.ShutdownManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import lombok.extern.java.Log;
import org.springframework.web.client.HttpServerErrorException;

/**
 *
 * @author Personal
 */
@Component
@Log
public class BillingList extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnDeleteAll;
    private JButton btnDeleteRow;
    private JButton btnGetBack;
    private JButton btnMenu;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel modelo;
    private int con = 0;

    @Autowired
    @Qualifier("billingListVisitor")
    private NavigationHandler navigationHandler;

    @Autowired
    private ShutdownManager shutdownManager;

    @Autowired
    private BillingService billingService;

    /**
     * Creates new form ListaFacturación
     */
    public BillingList() {
        initComponents();
        cerrar();
        this.getContentPane().setBackground(Color.GRAY);

    }

    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            mostrarInterfaz();
            mostrarLosDatos();
        }
        super.setVisible(visible);
    }

    public void mostrarInterfaz() {
        //para agregar los datos en un arreglo vacio//
        String data[][] = {};

        String col[] = {"RFC", "Razón Social", "Calle", "No. Ext.", "No. Int.", "Colonia", "Localidad", "Delegación/Municipio", "Estado", "País", "Código Postal", "E-Mail"};
        modelo = new DefaultTableModel(data, col);
        jTable1.setModel(modelo);

    }

    public void mostrarLosDatos() {
        try {
            List<BillingDetails> billingDetails = billingService.findAll();
            for (BillingDetails f : billingDetails) {
                modelo.insertRow(con, new Object[]{});
                modelo.setValueAt(f.getRfc(), con, 0);
                modelo.setValueAt(f.getRS(), con, 1);
                modelo.setValueAt(f.getStreetName(), con, 2);
                modelo.setValueAt(f.getNE(), con, 3);
                modelo.setValueAt(f.getNI(), con, 4);
                modelo.setValueAt(f.getColonia(), con, 5);
                modelo.setValueAt(f.getLocalidad(), con, 6);
                modelo.setValueAt(f.getDM(), con, 7);
                modelo.setValueAt(f.getState(), con, 8);
                modelo.setValueAt(f.getCountry(), con, 9);
                modelo.setValueAt(f.getPoBox(), con, 10);
                modelo.setValueAt(f.getEmail(), con, 11);

            }
        } catch (HttpServerErrorException serverErrorException) {
            log.log(Level.SEVERE, "Hubo un problema al comunicarse con el servidor.", serverErrorException);
            JOptionPane.showMessageDialog(this, "Hubo un problema al comunicarse con el servidor, por favor reintente en unos segundos", "Problema del servidor", JOptionPane.ERROR_MESSAGE);
        }
    }
    //Método para confirmar el cierre deJFrame//

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(BillingList.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    shutdownManager.confirmExit();
                }
            });
        } catch (Exception e) {
            log.log(Level.SEVERE, "There was a problem closing the application", e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        btnDeleteRow = new JButton();
        btnDeleteAll = new JButton();
        btnMenu = new JButton();
        btnGetBack = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ResourceBundle bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("BillingList.title")); // NOI18N
        setIconImage(new ImageIcon(getClass().getResource("/ImgFondos/Icono.png")).getImage());
        setResizable(false);

        jScrollPane1.setViewportView(jTable1);

        btnDeleteRow.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/eliminar fila.png"))); // NOI18N
        btnDeleteRow.setBorder(null);
        btnDeleteRow.setContentAreaFilled(false);
        btnDeleteRow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDeleteRowActionPerformed(evt);
            }
        });

        btnDeleteAll.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/eliminar todo.png"))); // NOI18N
        btnDeleteAll.setBorder(null);
        btnDeleteAll.setContentAreaFilled(false);
        btnDeleteAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        btnMenu.setBackground(new Color(255, 0, 51));
        btnMenu.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        btnMenu.setText(bundle.getString("BillingList.btnMenu.text")); // NOI18N
        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnGetBack.setText(bundle.getString("BillingList.btnGetBack.text")); // NOI18N
        btnGetBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnGetBackActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnDeleteRow)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetBack)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(btnDeleteAll)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMenu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGetBack))
                        .addComponent(btnDeleteRow, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnDeleteAll))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteRowActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDeleteRowActionPerformed
        try {
            modelo = (DefaultTableModel) jTable1.getModel();
            modelo.removeRow(jTable1.getSelectedRow());
            jTable1.addRowSelectionInterval(0, 0);
            modelo = null;
        } catch (Exception e) {
            log.log(Level.FINE, "Fila no seleccionada.", e);
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea quitar.");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteRowActionPerformed

    private void btnDeleteAllActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            int filas = jTable1.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            log.log(Level.SEVERE, "Error al limpiar la tabla.", e);
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void btnMenuActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        navigationHandler.goToMenu(this);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnGetBackActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnGetBackActionPerformed
        navigationHandler.goToBillingManagement(this);
    }//GEN-LAST:event_btnGetBackActionPerformed

}
