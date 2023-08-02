/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package createFrame;

import comp_decomp.Compressor;
import comp_decomp.Decompress;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.white;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;



/**
 *
 * @author User
 */
public class Window implements ActionListener {
    
    JFrame frame;
    JButton compress;
    JButton decompress;
    
    Window(){
        frame = new JFrame("File Accessing");
        frame.getContentPane().setBackground(black);
        frame.setSize(1000, 600);
        compress = new JButton("SELECT FILE TO COMPRESS");
        Font compressfont = compress.getFont();
        compress.setFont(new Font(compressfont.getName(),Font.BOLD,14));
        compress.setForeground(black);
        compress.setBackground(white);
        compress.setBounds(200, 250, 250, 50);
       
        decompress = new JButton("SELECT FILE TO DECOMPRESS");
         Font decompressfont = decompress.getFont();
        decompress.setFont(new Font(decompressfont.getName(),Font.BOLD,14));
        decompress.setForeground(black);
        decompress.setBackground(white);
        decompress.setBounds(500, 250, 250, 50);
        compress.addActionListener(this);
        decompress.addActionListener(this);
        frame.add(compress);
        frame.add(decompress);
        frame.setLayout(null);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    } 
        @Override 
        
        public void actionPerformed(ActionEvent e)
     {
        
        if(e.getSource()==compress){
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                try{
                    
                    Compressor.method(file);
                }
                   
                 catch (Exception ee){
                     JOptionPane.showMessageDialog(null, ee.toString());
                 }
                     
            }
        }
        if(e.getSource()==decompress){
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                try{
                    
                    Decompress.method(file);
                }
               catch (Exception ee){
                     JOptionPane.showMessageDialog(null, ee.toString());
                 }
                     
            }
        }
     }
       }

    


