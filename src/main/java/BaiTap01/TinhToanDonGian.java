/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package BaiTap01;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author DELL
 */
public class TinhToanDonGian extends JFrame {
    private JLabel lb1, lb2, lb3;
    private JTextField txtso1, txtso2, txtKq;
    private JButton btnCong, btnTru, btnNhan, btnChia;
    
    public TinhToanDonGian(){
        setTitle("Tinh toan don gian");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);
    }
    private void taoGiaoDien(){
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 5 ,5));
        p1.add(lb1 = new JLabel("So 1: "));
        p1.add(txtso1 = new JTextField());
        p1.add(lb2 = new JLabel("So 2: "));
        p1.add(txtso2 = new JTextField());
        p1.add(lb3 = new JLabel("Ket qua: "));
        p1.add(txtKq = new JTextField());
        
        JPanel p2 = new JPanel();
        p2.add(btnCong = new JButton("Cong"));
        p2.add(btnTru = new JButton("Tru"));
        p2.add(btnNhan = new JButton("Nhan"));
        p2.add(btnChia = new JButton("Chia"));
        
        setLayout(new BorderLayout());
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        
        //Xu li cong
        btnCong.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double x = Double.parseDouble(txtso1.getText());
                double y = Double.parseDouble(txtso2.getText());
                double kq = x+y;
                txtKq.setText(String.valueOf(kq));
            }
        });
        btnNhan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double x = Double.parseDouble(txtso1.getText());
                double y = Double.parseDouble(txtso2.getText());
                double kq = x*y;
                txtKq.setText(String.valueOf(kq));
            }
        });
        btnTru.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double x = Double.parseDouble(txtso1.getText());
                double y = Double.parseDouble(txtso2.getText());
                double kq = x-y;
                txtKq.setText(String.valueOf(kq));
            }
        });
        btnChia.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double x = Double.parseDouble(txtso1.getText());
                double y = Double.parseDouble(txtso2.getText());
                double kq = x/y;
                txtKq.setText(String.valueOf(kq));
            }
        });
    }
    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        TinhToanDonGian frm = new TinhToanDonGian();
        frm.setVisible(true);
    }
}
