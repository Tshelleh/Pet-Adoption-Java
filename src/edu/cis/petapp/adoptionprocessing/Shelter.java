package edu.cis.petapp.adoptionprocessing;

import edu.cis.petapp.GeneralFunctions.GeneralFunctions;

import java.util.ArrayList;

public class Shelter {
    private final int id;
    private String ShelterName;
    private String Location;
    private int contact_info;
    private ArrayList <Integer> petId;
    private ArrayList<Pet> pets = new ArrayList<>();
    private static int CountShelter=0;

    public Shelter(int id) {
        this(id,"default","default",-1,new ArrayList<>());
    }

    public Shelter(int id, String shelterName, String location, int contact_info, ArrayList<Integer> petId) {
        this.id = id;
        ShelterName = shelterName;
        Location = location;
        this.contact_info = contact_info;
        this.petId = petId;
    }

    public int getId() {
        return id;
    }

    public String getShelterName() {
        return ShelterName;
    }

    public void setShelterName(String shelterName) {
        ShelterName = shelterName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getContact_info() {
        return contact_info;
    }

    public void setContact_info(int contact_info) {
        this.contact_info = contact_info;
    }

    public ArrayList<Integer> getPetId() {
        return petId;
    }

    public void setPetId(ArrayList<Integer> petId) {
        this.petId = petId;
    }

    public static int getCountShelter() {
        return CountShelter;
    }

    public void add_Pet() {
        //read file "Shelter.txt" and save output in ArrayList<Shelter> note use downcast
        Pet Newpet=new Pet(GeneralFunctions.GenerateId(Pet.getPetCount()));
        //add pet info, use setter/getter in pet class
        //edit file "Pet.txt"
        this.pets.add(Newpet);
        petId.add(Newpet.getID());
        //get this object from list (filter) then edit PetId list in ArrayList<Shelter>
        // and rewrite file using WriteInFile function ("Shelter.txt",ArrayList<Shelter>)
    }
    public void EditShelter(){}
    public void DeleteShelter(){}

    //tostring, displayinfo
}
