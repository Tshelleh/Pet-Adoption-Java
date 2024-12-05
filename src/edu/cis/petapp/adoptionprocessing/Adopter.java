package edu.cis.petapp.adoptionprocessing;

import edu.cis.petapp.GeneralFunctions.GeneralFunctions;
import edu.cis.petapp.accountManagement.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Adopter extends User implements Comparable {
    Scanner input =new Scanner(System.in);
    private int Contact_info;
    private int Age;
    private String Location;
    private ArrayList<Adoption> Adoption_history;

    public Adopter(int id){
        this(id,"default","default",0,0,"default");
    }
    public Adopter(int ID, String UserName, String Password, int contact_info,int age,String location) {
        super(ID, UserName, Password,"Adopter");
        Contact_info = contact_info;
        Age=age;
        Location=location;
    }

    public void setContact_info(int contact_info) {
        Contact_info = contact_info;
    }

    public void addAdoption_history(Adoption adoption_history) {
        Adoption_history.add(adoption_history);
    }

    public int getContact_info() {
        return Contact_info;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }


    public ArrayList <Adoption> getAdoption_history() {
        return Adoption_history;
    }

    @Override
    public String toString() {
        return "Adopter: "+getID()+";"+getUserName()+";"+getPassword()+";"+Contact_info+";"+Age+
                ";" + Location ;
    }

    public void Sing_up(){
        System.out.println("Enter User Name:\n");
        String userName=input.next().toLowerCase().trim();
        setUserName(userName);
        System.out.println("Enter Password:\n");
        String password=input.next();
        setPassword(password);
        System.out.println("Enter Age:\n");
        int age= input.nextInt();
        Age=age;
        System.out.println("Enter Phone Number\n");
        int contact_info= input.nextInt();
        Contact_info=contact_info;
        System.out.println("Enter City Name\n");
        String location=input.next().toLowerCase().trim();
        Location=location;
    }

    public void Menu(){
        System.out.println("this Adopter\n");
    }
    public void Edit_info(int index_info){}

    public void delete_user_account(){}//delete from arr then rewrite file
    //name
    public int compareTo(Object object){
        Adopter other_adopter=(Adopter) object;
        return 0;
    }
    // length of adoption list
    public int compare(Object object1,Object object2){
        Adopter adopter1=(Adopter) object1;
        Adopter adopter2=(Adopter) object2;
        return 0;
    }
}

