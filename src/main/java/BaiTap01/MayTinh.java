/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BaiTap01;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author DELL
 */
public class MayTinh  extends JFrame{
    private JTextField txtDisplay;
    private JButton btReset;
    private final JButton[] bt = new JButton[16];
    private final String[] str = {"7","8","9","+","4","5","6","-","1","2","3","*","0",".","=","/"};
    
    public MayTinh() {
        setTitle("May tinh");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void taoGiaoDien() {
        JPanel p1 = new JPanel();       
        
        p1.add(txtDisplay=new JTextField());
        txtDisplay.setPreferredSize(new Dimension(200, 30));
        p1.add(btReset= new JButton("C"));

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 4, 5, 5));
        for (int i = 0; i < bt.length; i++) {
            bt[i] = new JButton(str[i]);
            p2.add(bt[i]);
        }

        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MayTinh frm = new MayTinh();
        frm.setVisible(true);
    }
    
}
