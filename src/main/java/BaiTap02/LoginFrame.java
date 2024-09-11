/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BaiTap02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class LoginFrame extends JFrame {

    private JLabel lblUser, lblPass;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JButton btnLogin, btnReset;

    public LoginFrame(String title) {
        super(title);
        taoGiaoDien();
        processEvent();
        pack();
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void taoGiaoDien() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 2, 10, 10));
        p.add(lblUser = new JLabel("User name"));
        p.add(txtUser = new JTextField(10));
        p.add(lblPass = new JLabel("Password"));
        p.add(txtPass = new JPasswordField(10));
        p.add(btnLogin = new JButton("Login"));
        p.add(btnReset = new JButton("Reset"));
        btnLogin.setIcon(new ImageIcon(this.getClass().getResource("/hinh/login.png")));
        btnReset.setIcon(new ImageIcon(this.getClass().getResource("/hinh/reset.png")));
        add(p);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginFrame frm = new LoginFrame("Login System");
        frm.setVisible(true);
    }

    private void processEvent() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = txtUser.getText();
                String pass = txtPass.getText();
                if (user.equals("admin") || pass.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Dang nhap thanh cong.");
                } else {
                    JOptionPane.showMessageDialog(null, "Dang nhap khong thanh cong.","Thong bao loi",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUser.setText("");
                txtPass.setText("");
                txtUser.requestFocus();
            }
        });
    }
}
