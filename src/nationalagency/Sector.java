/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nationalagency;

/**
 *
 * @author martin.atanasov
 */
public class Sector {
    private String nameOfDepartmant;
    private String headOfDepartmant;
    private int numberOfEmployees;
    private String nameOfContact;
    private String nameOfContact1;
    private String nameOfContact2;
    private String nameOfBubu;
    
    
    public void setNameOfDept(String name){
        this.nameOfDepartmant = name;
    }
    
    public String getNameOfDept(){
        return nameOfDepartmant;
    }
    public void setHeadOfDept(String name){
        this.headOfDepartmant = name;
    }
    public String getHeadOfDept(){
        return headOfDepartmant;
    }
    public void setNumberOfEmployees(int name){
        this.numberOfEmployees = name;
    }
    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }
    public void setNameOfContact(String name){
        this.nameOfContact = name;
    }
    public String getNameOfContact(){
        return nameOfContact;
    }
    public void setNameOfContact1(String name){
        this.nameOfContact1 = name;
    }
    public String getNameOfContact1(){
        return nameOfContact1;
    }
    public void setNameOfContact2(String name){
        this.nameOfContact2 = name;
    }
    public String getNameOfContact2(){
        return nameOfContact2;
    }
    public void setNameOfBubu(String name){
        this.nameOfBubu = name;
    }
    public String getNameOfBubu(){
        return nameOfBubu;
    }
    
}
