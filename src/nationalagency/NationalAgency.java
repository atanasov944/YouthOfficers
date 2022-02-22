package nationalagency;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin.atanasov
 */
public class NationalAgency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sector mySector = new Sector();
        mySector.setNameOfDept("Youth");
        mySector.setHeadOfDept("Snezana Kikokovska");
        mySector.setNumberOfEmployees(4);
        mySector.setNameOfContact("Dejan Dejanov");
        mySector.setNameOfContact1("Martin Martinov");
        mySector.setNameOfContact2("Elena Elenova");
        
        Sector heSector = new Sector();
        heSector.setNameOfDept("Higher Education");
        heSector.setHeadOfDept("Aleksandar Aleksandrov");
        heSector.setNumberOfEmployees(2);
        heSector.setNameOfContact("Elena Elenovska");
        
        Sector itSector = new Sector();
        itSector.setNameOfDept("IT");
        itSector.setHeadOfDept("Dejan Dejanovic");
        itSector.setNumberOfEmployees(2);
        itSector.setNameOfContact("Emir Emirovic");
        
        
        JFrame frame = new JFrame();
        String name = JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        
        String nameSector = JOptionPane.showInputDialog("Are you interested in knowing basic info about our sectors?  \nFor Youth enter 1, \nfor HE enter 2, \nfor IT enter 3, \n if you wish to proceed enter 4");
        
        
        
            
        
        
        switch (nameSector){
            case "1":
                JOptionPane.showMessageDialog(null, mySector.getHeadOfDept() + " is the head of Departmant and has " + mySector.getNumberOfEmployees() + " employees");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, heSector.getHeadOfDept() + " is the head of Departmant and has " + heSector.getNumberOfEmployees() + " employees");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, itSector.getHeadOfDept() + " is the head of Departmant and has " + itSector.getNumberOfEmployees() + " employees");
                break;
            case "4": 
                JOptionPane.showMessageDialog(null, "Now you can proceed by choosing the Key action that you are interested in");
                break;
            default: 
                JOptionPane.showMessageDialog(null, "You enter a digit that is out of the box, \nstart again", "Error!!!", JOptionPane.ERROR_MESSAGE);
                return;
        }
//        if(nameSector.equals("1")){
//            JOptionPane.showMessageDialog(null, mySector.getHeadOfDept() + " is the head of Departmant and has " + mySector.getNumberOfEmployees() + " employees");
//        }
//        else if(nameSector.equals("2")){
//            JOptionPane.showMessageDialog(null, heSector.getHeadOfDept() + " is the head of Departmant and has " + heSector.getNumberOfEmployees() + " employees");
//        }
//        else if(nameSector.equals("3")){
//            JOptionPane.showMessageDialog(null, itSector.getHeadOfDept() + " is the head of Departmant and has " + itSector.getNumberOfEmployees() + " employees");
//        }
        String nameAction = JOptionPane.showInputDialog("What action are you interested in? \nIf you are interested in KA150 enter 1, \nif you are interested in KA154 enter 2, \nif you are interested in ESC30 enter 3, "
                + " \nif you are interested in KA220 enter 4, \nif you want to get in contact with IT sector, enter 5");
                
        switch (nameAction){
            case("1"): JOptionPane.showMessageDialog(null, mySector.getNameOfContact() 
                    + " is the contact person for KA150, and you can reach him on dejan.milanov@na.org.mk ");
            break;
            case("2"):  JOptionPane.showMessageDialog(null, mySector.getNameOfContact1() 
                    + " is the contact person for KA154, and you can reach him on martin.atanasov@na.org.mk "); 
            break;
            case("3"): JOptionPane.showMessageDialog(null, mySector.getNameOfContact2() 
                    + " is the contact person for ESC30, and you can reach him on elena.tomashevska@na.org.mk ");
            break;
            case("4"): JOptionPane.showMessageDialog(null, heSector.getNameOfContact() 
                    + " is the contact person for KA220, and you can reach her on elena.mishevska@na.org.mk ");
            break;
            case("5"): JOptionPane.showMessageDialog(null, itSector.getNameOfContact() 
                    + " is the contact person for IT, and you can reach him on emir.murikj@na.org.mk ");
            break;
            default: 
                JOptionPane.showMessageDialog(null, "You enter a digit that is out of the box, \nstart again", "Error!!!", JOptionPane.ERROR_MESSAGE);
                break;
        }
        
//        if(nameAction.equals("1")){
//            JOptionPane.showMessageDialog(null, mySector.getNameOfContact() 
//                    + " is the contact person for KA150, and you can reach him on dejan.milanov@na.org.mk ");            
//        }
//        else if(nameAction.equals("2")){
//            JOptionPane.showMessageDialog(null, mySector.getNameOfContact1() 
//                    + " is the contact person for KA154, and you can reach him on martin.atanasov@na.org.mk "); 
//        }
//        else if(nameAction.equals("3")){
//            JOptionPane.showMessageDialog(null, mySector.getNameOfContact2() 
//                    + " is the contact person for ESC30, and you can reach him on elena.tomashevska@na.org.mk ");
//    }
//        else if(nameAction.equals("4")){
//            JOptionPane.showMessageDialog(null, heSector.getNameOfContact2() 
//                    + " is the contact person for KA220, and you can reach her on elena.mishevska@na.org.mk ");
//            
//        }
//        else if(nameAction.equals("5")){
//            JOptionPane.showMessageDialog(null, itSector.getNameOfContact() 
//                    + " is the contact person for IT, and you can reach him on emir.murikj@na.org.mk ");
//        }
        
    
    }
}
