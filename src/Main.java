import edu.cis.petapp.GeneralFunctions.GeneralFunctions;
import edu.cis.petapp.accountManagement.User;
import edu.cis.petapp.adoptionprocessing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = (ArrayList<User>) GeneralFunctions.ReadFromFile("User.txt") ;
        ArrayList<Pet> pets = (ArrayList<Pet>) GeneralFunctions.ReadFromFile("Pet.txt") ;
        ArrayList<Shelter> shelters = (ArrayList<Shelter>) GeneralFunctions.ReadFromFile("Shelter.txt") ;
        ArrayList<Adoption> adoptions = (ArrayList<Adoption>) GeneralFunctions.ReadFromFile("Adoption.txt") ;

        System.out.println("Welcome\n");
        int chose=1;
        System.out.println("Log in\n");
        System.out.println("sign up\n");

        if (chose==1){
            String username="Ahmed";
            String Password="1234" ;
            int userid = User.Log_in();
        }
        else if(chose==2){
            System.out.println("Admin\n");
            System.out.println("adopter\n");
            chose=1;
            if(chose==1){
                Admin newAdmin=new Admin(GeneralFunctions.GenerateId(User.getCount_user()));
                newAdmin.Sing_up();
                Shelter newshelter=newAdmin.add_shelter();
                users.add(newAdmin);
                shelters.add(newshelter);
                int userid = User.Log_in();
            }
            else if(chose==2){
                Adopter newAdopter=new Adopter(GeneralFunctions.GenerateId(User.getCount_user()));
                newAdopter.Sing_up();//call write file func
                users.add(newAdopter);
                int userid = User.Log_in();

            }


        }




        GeneralFunctions.WriteInFile("User.txt",users);
        GeneralFunctions.WriteInFile("Pet.txt",pets);
        GeneralFunctions.WriteInFile("Shelter.txt",shelters);
        GeneralFunctions.WriteInFile("Adoption.txt",adoptions);
    }
}