package edu.cis.petapp.accountManagement;

import edu.cis.petapp.GeneralFunctions.GeneralFunctions;

import javax.xml.stream.StreamFilter;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Filter;
import java.util.stream.Stream;

public abstract class User {
    private final int ID;
    private String UserName;
    private String Password;
    private String Role;
    private static int count_user=0;

  static Scanner input =new Scanner(System.in);

    public User(int ID,String UserName,String Password,String Role){
        this.ID=ID;
        this.UserName=UserName;
        this.Password=Password;
        this.Role=Role;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public static int getCount_user() {
        return count_user;
    }

    public int getID() {
        return ID;
    }

    public static int Log_in(){//id user
        int CurrantUserid;
        String EntryUserName=input.next().toLowerCase().trim(); ;
        String EntryPassword=input.next();
        ArrayList<User> Userlist = (ArrayList<User>) GeneralFunctions.ReadFromFile("User.txt");

        Optional<User> optionalUser =Userlist.stream()
                .filter(user -> (user.UserName.equals(EntryUserName)) && user.Password.equals(EntryPassword))
                .findFirst();
        if (optionalUser.isPresent()){
            CurrantUserid = optionalUser.get().getID();
            optionalUser.get().Menu();
            return CurrantUserid;
        }
        else {
            System.out.println("User Not Found!\n");
            return -1;
        }
    }

    public abstract void Sing_up();

    public abstract void Menu();

    public static void Log_out(){}

}
