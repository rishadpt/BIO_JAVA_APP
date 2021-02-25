/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.*;
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame("QUIZ");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       frame.setSize(600,500);
       frame.setResizable(true);
      
      frame.getContentPane().setBackground(Color.yellow);
       frame.setLayout(new FlowLayout());
       
      /* JTextArea textArea = new JTextArea();
       textArea.setText("SOFTWARE END_USER LICENSE AGREEEMENT \n\n"
               + "An end-user license agreement is a legal contract entered into"
               + "between a software developer or vendor and the user of the"
               + "this tool is fully copyrighted to hackphiles only"
               + "if we found you violate our community guidliness"
               + "we revoke the tool and you cant use this"
               + "so please obey the rules guysbetween a software developer or vendor and the user of the"
               + "between a software developer or vendor and the user of the"
               + "between a software developer or vendor and the user of the");
       textArea.setBounds(50, 50, 500, 300);
       textArea.setLineWrap(true);
       textArea.setWrapStyleWord(true);
       textArea.setBackground(Color.black);
       textArea.setBorder(BorderFactory.createBevelBorder(1));
       textArea.setForeground(Color.white);
       textArea.setFont(new Font("Comic Sans",Font.ITALIC,20));*/
       
       
       
       
       
       
       ImageIcon image = new ImageIcon("C:\\Users\\user\\Desktop\\insta clone\\image\\bio.jpg");
       Image logImage = image.getImage();
       Image modifiedLogImage = logImage.getScaledInstance(600, 700, java.awt.Image.SCALE_SMOOTH);
       image = new ImageIcon(modifiedLogImage);
       JLabel label = new JLabel("",image,JLabel.CENTER);
        // label.setVerticalAlignment(JLabel.BOTTOM);
       //label.setHorizontalAlignment(JLabel.RIGHT);
     //  label.setVerticalTextPosition(JLabel.TOP);
    //   label.setHorizontalTextPosition(JLabel.CENTER);
      // label.setForeground(new Color(25,70,50));
       //label.setFont(new Font("MV Boli",Font.BOLD,0));
       
       
       JPanel panel =new JPanel();
       panel.setBounds(50,75,300,300);
       panel.setBackground(Color.white);
       panel.setBorder(BorderFactory.createBevelBorder(0));
       panel.setLayout(new BorderLayout());
       panel.add(label);
       
       frame.add(panel);
       
      // frame.add(textArea);       
       frame.setVisible(true);
       
       
       
    }
    
}
