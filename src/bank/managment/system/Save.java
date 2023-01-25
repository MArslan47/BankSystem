
package bank.managment.system;
import java.io.*;
import java.util.*;



public class Save {
    public static void main(String args[]){
        /*File myfile = new File("save.txt");
        try{
            myfile.createNewFile();
         }catch (IOException e){
             System.out.println("unable to creat file");
             e.printStackTrace();
         
         }*/
         
        
        Random random = new Random();
        
        String formno = "" +Math.abs((random.nextLong() % 9000L) + 1000);
        String cardnumber = "" +Math.abs((random.nextLong()% 90000000L) + 0325600000000000L);
        String pinnumber = "" +Math.abs((random.nextLong() % 9000L) + 1000);
      
        try{
        FileWriter filewriter = new FileWriter("save.txt");
        filewriter.write("Form No :"+formno+"\nCard NO :"+cardnumber+"\n Pin :"+pinnumber);
        filewriter.close();
        
        }catch(IOException e){
           e.printStackTrace(); 
        }
      
    
    
    
    }
    
}
