package createFrame;

import comp_decomp.Compressor;
import comp_decomp.Decompressor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
public class Window extends JFrame implements ActionListener {
     JButton compressbutton;
     JButton decompressbutton;
    Window(){
        this.setSize(1000,1000);
        this.getContentPane().setBackground(Color.black);
        compressbutton = new JButton("SELECT FILE TO COMPRESS");
        compressbutton.setBounds(200,200,250,50);
        decompressbutton = new JButton("SELECT FILE TO DECOMPRESS");
        decompressbutton.setBounds(500,200,250,50);
        compressbutton.addActionListener(this);
        decompressbutton.addActionListener(this);
        this.add(compressbutton);
        this.add(decompressbutton);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==compressbutton){
            JFileChooser fileselect = new JFileChooser();
            int response = fileselect.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(fileselect.getSelectedFile().getAbsolutePath());
                try {
                    Compressor obj1 = new Compressor();
                    obj1.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
        if(e.getSource()==decompressbutton){
            JFileChooser fileselect = new JFileChooser();
            int response = fileselect.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(fileselect.getSelectedFile().getAbsolutePath());
                try {
                    Decompressor obj2 = new Decompressor();
                    obj2.method(file);
                }
                catch (Exception ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            }
        }
    }
}
