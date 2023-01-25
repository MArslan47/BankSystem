
package bank.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
      
    
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    JLabel text, cardno,pin, label;
    Login(){
        
        setTitle("ATM");
        setLayout(null);
        
        
        
        // for image icon 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        // for  labels
        text = new JLabel("Welcome To ATM");
        text.setFont(new Font("Osward",Font.BOLD, 38 ));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        cardno = new JLabel("Cardno:");
        cardno.setFont(new Font("Osward",Font.BOLD, 38 ));
        cardno.setBounds(150, 150, 150, 30);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(350,150,230,30);
        add(cardTextField);
        
        
        pin = new JLabel("Pin:");
        pin.setFont(new Font("Osward",Font.BOLD, 38 ));
        pin.setBounds(150, 220, 150, 30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(350,220,230,30);
        add(pinTextField);
        
        
        login = new JButton("Login");
        login.setBounds(350, 280, 80, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("Clear");
        clear.setBounds(490, 280, 80, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SignUP");
        signup.setBounds(350, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        
        
        
        // background 
        getContentPane().setBackground(Color.white);
        //  for set the size of frame
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    
    }
    // Ation performed on different buttons 
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ae.getSource()== login){
        }
        else if (ae.getSource()== signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
    
}
