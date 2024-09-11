/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BaiTap02;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class DemoJRadioButton extends JFrame {

    private JLabel lbl1, lbl2, lbl3, lbl4;
    private JTextField txtSo1, txtSo2, txtKq;
    private JButton btnTinh;
    private JRadioButton rdCong, rdTru, rdNhan, rdChia;

    public DemoJRadioButton() {
        setTitle("Tinh toan don gian");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        DemoJRadioButton rd = new DemoJRadioButton();
        rd.setVisible(true);
        // TODO code application logic here
    }

    private void taoGiaoDien() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2, 5, 5));
        p1.add(lbl1 = new JLabel("So 1"));
        p1.add(txtSo1 = new JTextField());
        txtSo1.setPreferredSize(new Dimension(100, 30));
        p1.add(lbl2 = new JLabel("So 2"));
        p1.add(txtSo2 = new JTextField());

        JPanel p2 = new JPanel();
        p2.add(rdCong = new JRadioButton("+"));
        p2.add(rdTru = new JRadioButton("-"));
        p2.add(rdNhan = new JRadioButton("x"));
        p2.add(rdChia = new JRadioButton(":"));

        p1.add(lbl3 = new JLabel("Phep tinh"));
        p1.add(p2);

        p1.add(lbl4 = new JLabel("Ket qua"));
        p1.add(txtKq = new JTextField());

        add(p1);
        add(btnTinh = new JButton("Tinh"), BorderLayout.SOUTH);

        ButtonGroup btnPhepTinh = new ButtonGroup();
        btnPhepTinh.add(rdCong);
        btnPhepTinh.add(rdTru);
        btnPhepTinh.add(rdNhan);
        btnPhepTinh.add(rdChia);
        rdCong.setSelected(true);

        btnTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x = Double.parseDouble(txtSo1.getText());
                    double y = Double.parseDouble(txtSo2.getText());
                    double kq = 0;
                    if (rdCong.isSelected()) {
                        kq = x + y;
                    }
                    if (rdTru.isSelected()) {
                        kq = x - y;
                    }
                    if (rdNhan.isSelected()) {
                        kq = x * y;
                    }
                    if (rdChia.isSelected()) {
                        kq = x / y;
                    }
                    txtKq.setText(String.valueOf(kq));
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Loi nhap lieu", "Thong bao loi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

}
