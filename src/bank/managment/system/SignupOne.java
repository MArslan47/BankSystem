package bank.managment.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class SignupOne extends JFrame implements ActionListener  {
    Long random;
    JLabel formno, personalDetails, name, fname, phoneno, cnic, address, state, marital, gender,dob, city;
    JButton next;
    JTextField nameTextField, fnameTextField, phonenoTextField, cnicTextField, addressTextField, stateTextField, cityTextField;
    JRadioButton male, female, other, married, unmarried;
    JDateChooser dateChooser;
    SignupOne(){
        setTitle("Application Form-Page1");
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
    
        
        
        
        formno = new JLabel("Application Form no." + random);
        formno.setFont(new Font("Rakeway",Font.BOLD,38));
        formno.setBounds(190,20 ,600 ,40 );
        add(formno);
        
        personalDetails = new JLabel("Page 1:  Personal Details");
        personalDetails.setFont(new Font("Rakeway",Font.BOLD,28));
        personalDetails.setBounds(250,70 ,400 ,40 );
        add(personalDetails);
        
        
        name = new JLabel("Name :");
        name.setFont(new Font("Rakeway",Font.BOLD,18));
        name.setBounds(100,120 ,100 ,30 );
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Rakeway",Font.BOLD,16));
        nameTextField.setBounds(290,120 ,300 ,28 );
        add(nameTextField);
        
        fname = new JLabel("Father Name :");
        fname.setFont(new Font("Rakeway",Font.BOLD,18));
        fname.setBounds(100,170 ,150 ,30 );
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Rakeway",Font.BOLD,16));
        fnameTextField.setBounds(290,170 ,300 ,28 );
        add(fnameTextField);
        
        phoneno = new JLabel("PhoneNO. :");
        phoneno.setFont(new Font("Rakeway",Font.BOLD,18));
        phoneno.setBounds(100,220 ,150 ,30 );
        add(phoneno);
        
        phonenoTextField = new JTextField();
        phonenoTextField.setFont(new Font("Rakeway",Font.BOLD,16));
        phonenoTextField.setBounds(290,220 ,300 ,28 );
        add(phonenoTextField);
        
        
        cnic = new JLabel("CNIC :");
        cnic.setFont(new Font("Rakeway",Font.BOLD,18));
        cnic.setBounds(100,270 ,150 ,30 );
        add(cnic);
        
        cnicTextField = new JTextField();
        cnicTextField.setFont(new Font("Rakeway",Font.BOLD,16));
        cnicTextField.setBounds(290,270 ,300 ,28 );
        add(cnicTextField);
        
        
        dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Rakeway",Font.BOLD,18));
        dob.setBounds(100,320 ,150 ,30 );
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(290,320 ,300 ,30 );
        
        add(dateChooser);
                
        address = new JLabel("Address :");
        address.setFont(new Font("Rakeway",Font.BOLD,18));
        address.setBounds(100,370 ,150 ,30 );
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Rakeway",Font.BOLD,16));
        addressTextField.setBounds(290,370 ,300 ,28 );
        add(addressTextField);
        
        
        gender = new JLabel("Gender :");
        gender.setFont(new Font("Rakeway",Font.BOLD,18));
        gender.setBounds(100,420 ,150 ,30 );
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(290,420 ,70 ,30 );
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(370,420 ,80 ,30 );
        female.setBackground(Color.white);
        add(female);
        
        other = new JRadioButton("Other");
        other.setBounds(480,420 ,80 ,30 );
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Rakeway",Font.BOLD,18));
        marital.setBounds(100,470 ,150 ,30 );
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(290,470 ,80 ,30 );
        married.setBackground(Color.white);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(370,470 ,100 ,30 );
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        
    
        
        city = new JLabel("City:");
        city.setFont(new Font("Rakeway",Font.BOLD,18));
        city.setBounds(100,520 ,150 ,30 );
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Rakeway",Font.BOLD,16));
        cityTextField.setBounds(290,520 ,300 ,28 );
        add(cityTextField);
        
        state = new JLabel("State :");
        state.setFont(new Font("Rakeway",Font.BOLD,18));
        state.setBounds(100,570 ,150 ,30 );
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Rakeway",Font.BOLD,16));
        stateTextField.setBounds(290,570 ,300 ,28 );
        add(stateTextField);
        
        
       next = new JButton("Next");
       next.setFont(new Font("Rakeway",Font.BOLD,16));
       next.setBounds(500,620 ,100 ,28 );
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.addActionListener(this);
       add(next); 
       
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setSize(800,750);
        setLocation(350,10);
        setVisible(true);
    
    }   
    @Override
    public void actionPerformed(ActionEvent ae){
         
        String formno = "" + random ;//long into string
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()){
            gender = "Female";
        }else if (other.isSelected()){
        gender = "Other";
                }
        String cnic = cnicTextField.getText();
        String marital = null;
        if(married.isSelected()){
        marital = "Married";
        }else if (unmarried.isSelected()){
        marital = "Un,arried";
        }
        String state = stateTextField.getText();
        String city = cityTextField.getText();
        String address = addressTextField.getText();
        String phoneno = phonenoTextField.getText();
        
        try{
            if (name.equals("")){
            JOptionPane.showMessageDialog(null, "Name is Requied");
            }else if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "FName is Requied");
            }else if(phoneno.equals("")){
                JOptionPane.showMessageDialog(null, "PhoneNo. is Requied");
            }else if(cnic.equals("")){
                JOptionPane.showMessageDialog(null, "Cnic is Requied");
            }else if(dob.equals("")){
                JOptionPane.showMessageDialog(null, "Date Of Birth is Requied");
            }else if(city.equals("")){
                JOptionPane.showMessageDialog(null, "City Name is Requied");
            }else if(state.equals("")){
                JOptionPane.showMessageDialog(null, "State Name is Requied");
            }else if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is Requied");
            }
            else{
             Conn c = new Conn();
             String query = "insert into signup values('"+ formno +"', '"+ name +"', '"+ fname +"', '"+ phoneno +"', '"+ cnic +"', '"+ dob +"','"+ address +"', '"+ gender +"', '"+ marital +"', '"+ city +"', '"+ state +"')";
            c.s.executeUpdate(query);
            setVisible(false);
            new SignupTwo(formno).setVisible(true);
            }
        }catch(HeadlessException | SQLException e){
        System.out.println(e);
        }
    
    
    }
    
    
    
    public static void main (String args[]){
        new SignupOne();
    }
}
