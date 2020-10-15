package AES;
import javax.swing.*; 
import java.lang.*;
 
import java.awt.event.*;  
public class Main implements ActionListener{  
    JTextField tf1,tf2;   JLabel l1 ,l2; JTextArea tf3 ;
    JButton b1,b2;  
    Main(){  
        JFrame f= new JFrame(); 
        l1 = new JLabel("Enter Text Here");
       // l1.setText("Enter text here : ");
        l1.setBounds(50,10, 250,20);  
        tf1=new JTextField();  
        tf1.setBounds(50,50,150,20); 
        l2 = new JLabel("Enter Key Here");
        l2.setBounds(50,100, 250,20); 
        tf2=new JTextField();  
        tf2.setBounds(50,150,150,20);  
        tf3=new JTextArea();  
        tf3.setBounds(50,250,300,50);  
        tf3.setEditable(false);   
        b1=new JButton("Encrypt");  
        b1.setBounds(50,350,100,50);  
        b2=new JButton("Decrypt");  
        b2.setBounds(130,350,100,50);  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);  
        f.add(l1);
        f.add(l2);
        f.setSize(500,500);  
        f.setLocationRelativeTo(null);
        f.setLayout(null);  
        f.setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) { 
    	
    	String s1=tf1.getText();  
        String s2=tf2.getText();  
    	AESCryp ob = new AESCryp();
    	
    	ob.setEncryptionKey(s2);
    	String encryptStr = ob.encrypt(s1);
    	String decryptStr = ob.decrypt(encryptStr);
    	
    	
    	  
          
        String c = "";
   
        if(e.getSource()==b1){  
            c=c+"Encrypted Value is :"+encryptStr;
        }else if(e.getSource()==b2){  
            c=c+"Decrypted value is :"+decryptStr;
        }  
         
        tf3.setText(c);  
    }  
public static void main(String[] args) {  
    new Main();  
} }  