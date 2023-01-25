package bank.managment.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignupTwo extends JFrame implements ActionListener  {
    
    String formno;
    JButton go;
    JRadioButton syes,sno,eyes, eno;
    JComboBox  religion,category,income,educational, occuption;
    JLabel  name, fname,email, marital, gender,dob, citizen,account,existing;
    SignupTwo(String formno){
        
        this.formno =  formno;
        
        setTitle("Application Form-Page2");
        setLayout(null);
   
   
        JLabel additionalDetails = new JLabel("Page 2:  Additional Details");
        additionalDetails.setFont(new Font("Rakeway",Font.BOLD,28));
        additionalDetails.setBounds(220,60 ,400 ,40 );
        add(additionalDetails);
        
        
        name = new JLabel("Religion :");
        name.setFont(new Font("Rakeway",Font.BOLD,18));
        name.setBounds(100,120 ,100 ,30 );
        add(name);
        
        String valReligion[] = {"Muslim","Christion","Sikh","Other"};
        religion = new JComboBox(valReligion);
        religion .setBounds(290,120 ,300 ,28 );
        add(religion );
        
       
        
        fname = new JLabel("Category :");
        fname.setFont(new Font("Rakeway",Font.BOLD,18));
        fname.setBounds(100,170 ,150 ,30 );
        add(fname);
        
        String valCategory[] = {"Genral","Business","Saving","Other"};
        category = new JComboBox(valCategory);
        category.setBounds(290,170 ,300 ,28 );
        add(category);
        
        dob = new JLabel("Income. :");
        dob.setFont(new Font("Rakeway",Font.BOLD,18));
        dob.setBounds(100,220 ,150 ,30 );
        add(dob);
        
        String valIncome[] = {"Null","< 1,00,000","< 2,00,000","< 3,00,000","Other"};
        income = new JComboBox(valIncome);
        income.setBounds(290,220 ,300 ,28 );
        add(income);
        
        
        gender = new JLabel("Educational");
        gender.setFont(new Font("Rakeway",Font.BOLD,18));
        gender.setBounds(100,270 ,150 ,30 );
        add(gender);
        
        String valEducational[] = {"Not Educated","Matric","Higher Secandory","Graduated","Other"};
        educational = new JComboBox(valEducational);
        educational.setBounds(290,290 ,300 ,28 );
        add(educational);
        
        email = new JLabel("Qualification:");
        email.setFont(new Font("Rakeway",Font.BOLD,18));
        email.setBounds(100,290 ,150 ,30 );
        add(email);
        
        
        marital = new JLabel("Occuption :");
        marital.setFont(new Font("Rakeway",Font.BOLD,18));
        marital.setBounds(100,350 ,150 ,30 );
        add(marital);
        
        
        String valOccuption[] = {"Salaried","Self_Employ","Bussiness","Studentd","Retired","Other"};
        occuption = new JComboBox(valOccuption);
        occuption.setBounds(290,350 ,300 ,28 );
        add(occuption);
        
        
                
        citizen = new JLabel("Senior Citizen :");
        citizen.setFont(new Font("Rakeway",Font.BOLD,18));
        citizen.setBounds(100,400 ,220 ,30 );
        add(citizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,400 ,70 ,30 );
        syes.setBackground(Color.white);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(400,400 ,80 ,30 );
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);
        
        
        existing = new JLabel("Existing");
        existing.setFont(new Font("Rakeway",Font.BOLD,18));
        existing.setBounds(100,450 ,150 ,30 );
        add(existing);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,460 ,70 ,30 );
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(400,460 ,80 ,30 );
        eno.setBackground(Color.white);
        add(eno);
        
        account = new JLabel("Account:");
        account.setFont(new Font("Rakeway",Font.BOLD,18));
        account.setBounds(100,470 ,150 ,30 );
        add(account);
        
        
        
        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(eyes);
        accountgroup.add(eno);
        
        
 
        
        
       go = new JButton("Next");
       go .setFont(new Font("Rakeway",Font.BOLD,16));
       go .setBounds(500,550 ,100 ,28 );
       go .setBackground(Color.BLACK);
       go .setForeground(Color.WHITE);
       go.addActionListener(this);
       add(go); 
       
   
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(800,700);
        setLocation(350,10);
        setVisible(true);
    
    }   
    @Override
    public void actionPerformed(ActionEvent ae){
         
        
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducational= (String)educational.getSelectedItem();
        String soccupation= (String)occuption.getSelectedItem();
        String citizen = null;
        if(syes.isSelected()){
            citizen = "Yes";
        } else if (sno.isSelected()){
            citizen = "No";
        }
        String existing = null;
        if(eyes.isSelected()){
        existing = "Yes";
        }else if (eno.isSelected()){
        existing = "No";
        }
        try{
            if (sreligion.equals("")){
            JOptionPane.showMessageDialog(null, "Religion is Requied");
            }else if(scategory.equals("")){
                JOptionPane.showMessageDialog(null, "Category is Requied");
            }else if(seducational.equals("")){
                JOptionPane.showMessageDialog(null, "Educational is Requied");
            }else if(soccupation.equals("")){
                JOptionPane.showMessageDialog(null, "Occuption is Requied");
            }else if(sincome.equals("")){
                JOptionPane.showMessageDialog(null, "Income is Requied");
            }else if(citizen.equals("")){
                JOptionPane.showMessageDialog(null, "Choose Citizen Name is Requied");
            }else if(existing.equals("")){
                JOptionPane.showMessageDialog(null, "Choose Account is Requied");
            }
            else{
             Conn c = new Conn();
            String query = "insert  into signuptwo values('"+ formno +"', '"+ sreligion +"', '"+ scategory +"', '"+ sincome +"', '"+ seducational +"', '"+ soccupation +"','"+citizen +"','"+existing+"')";
             c.s.executeUpdate(query);
            setVisible(false);
            new SignupThree(formno).setVisible(true);
     
            }
        }catch(HeadlessException | SQLException e){
        System.out.println(e);
        }
    
    
    }
    
    
    
    public static void main (String args[]){
        new SignupTwo("");
    }
}
