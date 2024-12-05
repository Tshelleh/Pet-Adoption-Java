package edu.cis.petapp.adoptionprocessing;

import edu.cis.petapp.GeneralFunctions.*;
import edu.cis.petapp.accountManagement.User;

import java.util.Scanner;

public class Admin extends User {
    Scanner input =new Scanner(System.in);
    private Shelter shelter;
    private int shelterId;
    public Admin(int id) {
        this(id,"default","default",-1);
    }

    public Admin(int ID, String UserName, String Password,int shelterId) {
        super(ID, UserName, Password,"Admin");
        this.shelterId=shelterId;
    }

    public int getShelter() {
        return shelterId;
    }

    public void setShelter(int shelterId) {
        this.shelterId = shelterId;
    }

    @Override
    public String toString() {
        return "Admin: " +getID()+";"+getUserName()+";"+getPassword()+
                ";" + shelterId;
    }

    public void Sing_up(){
        System.out.println("Enter User Name:\n");
        String userName=input.next().toLowerCase().trim();
        setUserName(userName);
        System.out.println("Enter Password:\n");
        String password=input.next();
        setPassword(password);
        System.out.println("Enter Shelter Information:\n");

    }

    public void Menu(){
        System.out.println("this Admin\n");
    }
    //in sing up
    public Shelter add_shelter(){
        this.shelter=new Shelter(GeneralFunctions.GenerateId(Shelter.getCountShelter()));
        this.shelterId= shelter.getId();
        return shelter;
        //يدخل معلومات shelter
        // edit file
    }//return shelter id
//    public void managePetList(){}  //add pet , accept
public void DeleteAccount(){}

}

