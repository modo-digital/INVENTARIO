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
import inventarios.service.LoginUsersService;
import inventarios.to.LoginUser;
import inventarios.util.FontFactory;
import inventarios.util.ShutdownManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ResourceBundle;

/**
 * @author EfraJiJim
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class LoginWindow extends JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPasswordField txtPsswd;
    private JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private LoginUsersService usersService;
    private FontFactory fontFactory;
    private NavigationHandler navigationHandler;
    private ShutdownManager shutdownManager;
    
    private static final String USER_PLACEHOLDER = "Ingresa tu usuario";

    @Autowired
    public LoginWindow(
            @Qualifier("loginVisitor") NavigationHandler navigationHandler,
            LoginUsersService usersService, FontFactory fontFactory,
            ShutdownManager shutdownManager) {
        this.usersService = usersService;
        this.navigationHandler = navigationHandler;
        this.fontFactory = fontFactory;
        this.shutdownManager = shutdownManager;
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

        JPanel backgroundedPanel = new JPanel(){
            @Override
            public void paintComponent(Graphics g) {
                ImageIcon backgroundImageIcon = new ImageIcon(getClass().getResource("/ImgFondos/fondo 1.png"));
                Image backgroundImage = 
                new ImageIcon(
                    backgroundImageIcon.getImage()
                    .getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH)
                ).getImage();
                g.drawImage(backgroundImage,0,0,null); // draw the background image
            }
        }
        ;
        JPanel titlePanel = new JPanel();
        JLabel lblCorporativeIcon = new JLabel();
        JLabel lblTitle = new JLabel();
        JPanel fieldsAndLogoPanel = new JPanel();
        JPanel fieldsPanel = new JPanel();
        JLabel lblUser = new JLabel();
        txtUser = new JTextField();
        txtUser.setForeground(Color.GRAY);
        txtUser.setText(USER_PLACEHOLDER);
        JLabel lblPassword = new JLabel();
        txtPsswd = new JPasswordField();
        JPanel btnPanel = new JPanel();
        JButton btnAccept = new JButton();
        JButton btnClean = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ResourceBundle bundle = ResourceBundle.getBundle("inventarios/gui/desktop/Bundle"); // NOI18N
        setTitle(bundle.getString("LoginWindow.title")); // NOI18N
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource
            ("/ImgFondos/Icono.png")).getImage());
    setMinimumSize(new Dimension(500, 400));
    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent evt) {
            windowCloseHandler(evt);
        }
    });

    backgroundedPanel.setOpaque(false);
    backgroundedPanel.setLayout(new BorderLayout());

    titlePanel.setOpaque(false);
        FlowLayout flowLayout1 = new FlowLayout(FlowLayout.CENTER, 15, 5);
    flowLayout1.setAlignOnBaseline(true);
    titlePanel.setLayout(flowLayout1);

    lblCorporativeIcon.setIcon(new ImageIcon(getClass().getResource("/ImgFondos/Imagen2.png"))); // NOI18N
    titlePanel.add(lblCorporativeIcon);

    lblTitle.setFont(new Font("Tempus Sans ITC", 1, 36)); // NOI18N
    lblTitle.setForeground(new Color(204, 0, 0));
    lblTitle.setIcon(new ImageIcon(getClass().getResource("/ImgLetras/login.png"))); // NOI18N
    titlePanel.add(lblTitle);

    backgroundedPanel.add(titlePanel, BorderLayout.PAGE_START);

    fieldsAndLogoPanel.setBorder(BorderFactory.createEmptyBorder(40, 20, 40, 20));
    fieldsAndLogoPanel.setOpaque(false);
    fieldsAndLogoPanel.setLayout(new BoxLayout(fieldsAndLogoPanel, BoxLayout.LINE_AXIS));

    fieldsPanel.setOpaque(false);
    fieldsPanel.setLayout(new GridLayout(4, 1, 20, 15));

    lblUser.setFont(fontFactory.getFont("Montserrat-Light.ttf"));
    lblUser.setForeground(new Color(0, 0, 153));
    lblUser.setText(bundle.getString("LoginWindow.lblUser.text")); // NOI18N
    fieldsPanel.add(lblUser);

    txtUser.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(204, 204, 204)));
    txtUser.setOpaque(false);
    txtUser.addFocusListener(new FocusAdapter() {
        public void focusGained(FocusEvent evt) {
            txtUserFocusGained(evt);
        }
        public void focusLost(FocusEvent evt) {
            txtUserFocusLost(evt);
        }
    });
    txtUser.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent evt) {
            txtUserKeyTyped(evt);
        }
    });
    fieldsPanel.add(txtUser);

    lblPassword.setFont(lblUser.getFont());
    lblPassword.setForeground(new Color(0, 0, 153));
    lblPassword.setText(bundle.getString("LoginWindow.lblPassword.text")); // NOI18N
    fieldsPanel.add(lblPassword);

    txtPsswd.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(204, 204, 204)));
    txtPsswd.setOpaque(false);
    txtPsswd.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent evt) {
            txtPsswdKeyTyped(evt);
        }
    });
    fieldsPanel.add(txtPsswd);

    fieldsAndLogoPanel.add(fieldsPanel);

    backgroundedPanel.add(fieldsAndLogoPanel, BorderLayout.CENTER);

    btnPanel.setOpaque(false);

    btnAccept.setBackground(new Color(0, 255, 0));
    btnAccept.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        ResourceBundle bundle1 = ResourceBundle.getBundle("inventarios/desktop/Bundle"); // NOI18N
    btnAccept.setText(bundle1.getString("LoginWindow.btnAccept.text")); // NOI18N
    btnAccept.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(102, 255, 102), new Color(102, 255, 102), new Color(51, 102, 0), new Color(51, 153, 0))));
    btnAccept.setContentAreaFilled(false);
    btnAccept.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    btnAccept.setMargin(new Insets(18, 24, 18, 24));
    btnAccept.setOpaque(true);
    btnAccept.setSelected(true);
    btnAccept.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            btnAcceptActionPerformed(evt);
        }
    });
    btnPanel.add(btnAccept);

    btnClean.setBackground(new Color(50, 201, 235));
    btnClean.setFont(new Font("Tahoma", 1, 24)); // NOI18N
    btnClean.setText(bundle1.getString("LoginWindow.btnClean.text")); // NOI18N
    btnClean.setBorder(BorderFactory.createCompoundBorder(new LineBorder(new Color(0, 0, 0), 2, true), BorderFactory.createBevelBorder(BevelBorder.RAISED)));
    btnClean.setContentAreaFilled(false);
    btnClean.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    btnClean.setMargin(new Insets(18, 24, 18, 24));
    btnClean.setOpaque(true);
    btnClean.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            btnCleanActionPerformed(evt);
        }
    });
    btnPanel.add(btnClean);

    backgroundedPanel.add(btnPanel, BorderLayout.SOUTH);

    getContentPane().add(backgroundedPanel, BorderLayout.CENTER);

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        loginAttempt();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnCleanActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        clearFields();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void txtUserKeyTyped(KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            loginAttempt();
        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPsswdKeyTyped(KeyEvent evt) {//GEN-FIRST:event_txtPsswdKeyTyped
        char cTeclaPresionada = evt.getKeyChar();
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            loginAttempt();
        }
    }//GEN-LAST:event_txtPsswdKeyTyped

    private void windowCloseHandler(WindowEvent evt) {//GEN-FIRST:event_windowCloseHandler
        shutdownManager.confirmExit();
    }//GEN-LAST:event_windowCloseHandler

    private void txtUserFocusGained(FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (USER_PLACEHOLDER.equals(txtUser.getText())) {
            txtUser.setText("");
            txtUser.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        final String text = txtUser.getText();
        if (text.isEmpty()) {
            txtUser.setForeground(Color.GRAY);
            txtUser.setText(USER_PLACEHOLDER);
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void loginAttempt() {
        String user = txtUser.getText();
        if (!user.isEmpty() && !user.equals("Ingresa tu usuario")) {
            String password = txtPsswd.getText();

            LoginUser loginUser = new LoginUser(user, password);

            if (usersService.authenticate(loginUser)) {
                navigationHandler.goToMenu(this);
                clearFields();
                return;
            }

            JOptionPane.showMessageDialog(null, "Usuario " + user + " no encontrado", "Credenciales incorrectas", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void clearFields() {
        txtUser.setForeground(Color.GRAY);
        txtUser.setText(USER_PLACEHOLDER);
        txtPsswd.setText("");
    }

}
