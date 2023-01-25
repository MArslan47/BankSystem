
package bank.managment.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener {
    
    
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JLabel account,card,cnumber,clabel,pin,pnumber,plabel,services;
    JRadioButton saving,current,fixed,recurring;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno){
        this.formno = formno;
        setTitle("Application Form-Page3");
        setLayout(null);
    
        JLabel l1 = new JLabel ("Page 3: Accont Details");
        l1.setFont(new Font("Rakeway",Font.BOLD,28));
        l1.setBounds(220,50 ,400 ,40 );
        add(l1);
        
        
        
        account = new JLabel("Account Type:");
        account.setFont(new Font("Rakeway",Font.BOLD,20));
        account.setBounds(100,110 ,150 ,30 );
        add(account);
        
        saving = new JRadioButton("Saving Account");
        saving.setBounds(100,140 ,150 ,28 );
        saving.setBackground(Color.white);
        add(saving);
        
        current = new JRadioButton("Current Account");
        current.setBounds(350,140 ,150 ,28 );
        current.setBackground(Color.white);
        add(current);
        
        
        fixed = new JRadioButton("Fixed Deposit Account");
        fixed.setBounds(100,170 ,200 ,28 );
        fixed.setBackground(Color.white);
        add(fixed);
        
        recurring = new JRadioButton("Recurring Deposit Account");
        recurring.setBounds(350,170 ,200 ,28 );
        recurring.setBackground(Color.white);
        add(recurring);
        
        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(saving);
        accountgroup.add(current);
        accountgroup.add(fixed);
        accountgroup.add(recurring);
        
        
        
        card = new JLabel ("Card Number :");
        card.setFont(new Font("Rakeway",Font.BOLD,20));
        card.setBounds(100,220 ,200 ,40 );
        add(card);
        
        
        cnumber = new JLabel ("XXXX-XXXX-XXXX-XXXX");
        cnumber.setFont(new Font("Rakeway",Font.BOLD,20));
        cnumber.setBounds(310,220 ,300 ,40 );
        add(cnumber);
        
        
        clabel = new JLabel ("Your 16 digit card no.");
        clabel.setFont(new Font("Rakeway",Font.BOLD,12));
        clabel.setBounds(100,240 ,200 ,30 );
        add(clabel);
        
        pin = new JLabel ("Pin No. :");
        pin.setFont(new Font("Rakeway",Font.BOLD,20));
        pin.setBounds(100,290 ,200 ,40 );
        add(pin);
        
        pnumber = new JLabel ("XXXX");
        pnumber.setFont(new Font("Rakeway",Font.BOLD,20));
        pnumber.setBounds(310,290 ,200 ,40 );
        add(pnumber);
        
        plabel = new JLabel ("Your 4 digit Pin No.");
        plabel.setFont(new Font("Rakeway",Font.BOLD,12));
        plabel.setBounds(100,310 ,200 ,30 );
        add(plabel);
        
        
        
        
        services = new JLabel ("Services Required :");
        services.setFont(new Font("Rakeway",Font.BOLD,20));
        services.setBounds(100,340 ,200 ,40 );
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        
        c1.setFont(new Font("Rakeway",Font.BOLD,20));
        c1.setBounds(100,380 ,130 ,30 );
        add(c1);
        
        c2 = new JCheckBox("Cheque Book");
       c2.setFont(new Font("Rakeway",Font.BOLD,20));
        c2.setBounds(350,380 ,180 ,30 );
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
       c3.setFont(new Font("Rakeway",Font.BOLD,20));
        c3.setBounds(100,420 ,190 ,30 );
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setFont(new Font("Rakeway",Font.BOLD,20));
        c4.setBounds(350,420 ,230 ,30 );
        add(c4);
        
        c5 = new JCheckBox("Internet Banking");
       c5.setFont(new Font("Rakeway",Font.BOLD,20));
        c5.setBounds(100,460 ,190 ,30 );
        add(c5);
        
        c6 = new JCheckBox("E Statement");
        c6.setFont(new Font("Rakeway",Font.BOLD,20));
        c6.setBounds(350,460 ,170 ,30 );
        add(c6);
        
        c7 = new JCheckBox("I hereby the declear that the above entered details are correct ");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Rakeway",Font.BOLD,12));
        c7.setBounds(100,500 ,500 ,30 );
        add(c7);
        
        
        submit = new JButton("Submit");
        submit .setBackground(Color.BLACK);
        submit .setForeground(Color.WHITE);
        submit .setFont(new Font("Rakeway",Font.BOLD,16));
        submit .setBounds(250,550 ,100 ,28 );
        submit.addActionListener(this);
        add(submit); 
       
        cancel = new JButton("Cancel");
        cancel .setBackground(Color.BLACK);
        cancel .setForeground(Color.WHITE);
        cancel .setFont(new Font("Rakeway",Font.BOLD,16));
        cancel .setBounds(400,550 ,100 ,28 );
        cancel.addActionListener(this);
        add(cancel); 
       
        
        
      
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(800,700);
        setLocation(350,10);
        setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource() == submit){
        String account = null;{
          if(saving.isSelected()){
              account = "Saving Account";
           }else if (current.isSelected()){
               account = "Current Account";
           }else if (fixed.isSelected()){
               account ="Fixed Deposit Account";
           }else if (recurring.isSelected()){
              account = "Recurring Deposit Account";
           }
       Random random = new Random();
       String cardnumber = "" +Math.abs((random.nextLong()% 90000000L) + 0325600000000000L);
       String pinnumber = "" +Math.abs((random.nextLong() % 9000L) + 1000);
       String facility = "";
       if(c1.isSelected()){
         facility = facility + "ATM Card";
       }else if(c2.isSelected()){
         facility = facility + "Cheque Book";
       }else if(c3.isSelected()){
         facility = facility + "Mobile Banking";
       }else if(c4.isSelected()){
         facility = facility + "Email & SMS Alerts";
       }else if(c5.isSelected()){
         facility = facility + "Internet Banking";
       }else if(c6.isSelected()){
         facility = facility + "E Statment";
       }
       try{
           if (account.equals("")){
            JOptionPane.showMessageDialog(null, "Account Type is Requied");
            }else if(cardnumber.equals("")){
                JOptionPane.showMessageDialog(null, "Category is Requied");
            }else if(pinnumber.equals("")){
                JOptionPane.showMessageDialog(null, "Educational is Requied");
            }else if(facility.equals("")){
                JOptionPane.showMessageDialog(null, "Occuption is Requied");
            }else {
              Conn conn =new Conn();
              String query1 = "insert into signupthree values('"+formno +"','"+account +"','"+cardnumber +"','"+pinnumber +"','"+facility +"')";
              String query2 = "insert into login values('"+formno +"','"+cardnumber +"','"+pinnumber +"')";
              conn.s.executeUpdate(query1);
              conn.s.executeUpdate(query2);
              JOptionPane.showMessageDialog(null, "Card No. :"+ cardnumber+ "\n Pin :"+pinnumber);
            }
       
       }catch (Exception e){
        System.out.println(e);
       }
       
        }
      }else if (ae.getSource()== cancel){
          System.exit(0);
          
      }
    }
    

    
    
    
    
    
    
    
    public static void main (String ards[]){
        
        new SignupThree("");
    }

  
}
