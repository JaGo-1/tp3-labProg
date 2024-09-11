
package tp3_labprog_login;

import java.awt.Color;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        formBg = new javax.swing.JPanel();
        title_2 = new javax.swing.JLabel();
        title_1 = new javax.swing.JLabel();
        title_3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        user_input = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btn = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formBg.setBackground(new java.awt.Color(3, 22, 32));

        title_2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        title_2.setForeground(new java.awt.Color(225, 225, 225));
        title_2.setText("¡Bienvenido!");

        title_1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        title_1.setForeground(new java.awt.Color(225, 225, 225));
        title_1.setText("Inicia sesión con tu correo electrónico y ");

        title_3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        title_3.setForeground(new java.awt.Color(225, 225, 225));
        title_3.setText("contraseña para continuar.");

        jSeparator1.setBackground(new java.awt.Color(225, 225, 225));
        jSeparator1.setForeground(new java.awt.Color(225, 225, 225));

        user_input.setBackground(new java.awt.Color(3, 22, 32));
        user_input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        user_input.setForeground(new java.awt.Color(204, 204, 204));
        user_input.setText("Ingrese su usuario");
        user_input.setBorder(null);
        user_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_inputMouseClicked(evt);
            }
        });
        user_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_inputActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(3, 22, 32));
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("userpassword");
        password.setBorder(null);
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(225, 225, 225));
        jSeparator2.setForeground(new java.awt.Color(225, 225, 225));

        btn.setBackground(new java.awt.Color(175, 29, 65));
        btn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn.setForeground(new java.awt.Color(255, 255, 255));
        btn.setText("INICIAR SESIÓN");
        btn.setBorder(null);
        btn.setBorderPainted(false);
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout formBgLayout = new javax.swing.GroupLayout(formBg);
        formBg.setLayout(formBgLayout);
        formBgLayout.setHorizontalGroup(
            formBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBgLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(formBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(formBgLayout.createSequentialGroup()
                        .addGroup(formBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user_input)
                            .addComponent(title_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(title_2, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formBgLayout.setVerticalGroup(
            formBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBgLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(title_2)
                .addGap(27, 27, 27)
                .addComponent(title_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_3)
                .addGap(46, 46, 46)
                .addComponent(user_input, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        bg.add(formBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 550));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.jpg"))); // NOI18N
        img.setText("jLabel1");
        bg.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 360, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_inputActionPerformed
     
    }//GEN-LAST:event_user_inputActionPerformed

    private void user_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_inputMouseClicked
        if ("Ingrese su usuario".equals(user_input.getText())){
            user_input.setText("");
            user_input.setForeground(Color.WHITE);

        }
        if ("".equals(String.valueOf(password.getPassword()))){
            password.setForeground(Color.GRAY);
            password.setText("userpassword");
        }
    }//GEN-LAST:event_user_inputMouseClicked

    private void btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseClicked
        if ("alumno@ulp.edu.ar".equals(user_input.getText()) && "12345678".equals(String.valueOf(password.getPassword())) ){
            JOptionPane.showMessageDialog(rootPane, "Bienvenido ");
        } else JOptionPane.showMessageDialog(rootPane, "Usuario y/o contrasenia incorrectos.");
    }//GEN-LAST:event_btnMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        if("userpassword".equals(String.valueOf(password.getPassword()))){
            password.setText("");
            password.setForeground(Color.WHITE);
           
        }
        if("".equals(user_input.getText())){
            user_input.setForeground(Color.GRAY);
            user_input.setText("Ingrese su usuario");
        }
    }//GEN-LAST:event_passwordMouseClicked

 
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn;
    private javax.swing.JPanel formBg;
    private javax.swing.JLabel img;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel title_1;
    private javax.swing.JLabel title_2;
    private javax.swing.JLabel title_3;
    private javax.swing.JTextField user_input;
    // End of variables declaration//GEN-END:variables
}
