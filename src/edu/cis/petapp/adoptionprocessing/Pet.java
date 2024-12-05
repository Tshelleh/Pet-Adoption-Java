package edu.cis.petapp.adoptionprocessing;

public class Pet {
    private static int petCount = 0;
    private final int petId;
    private String petName;
    private String Species;
    private String Breed;
    private int Age;
    private String Health;
    private String Availability;
    private int admin_Id;  //equal shelter id


    public Pet(int PetId) {
        this(PetId,"default","default","default",-1,"default");
    }

    public Pet(int PetId, String petName, String species, String breed, int age, String health) {
        this.petId = PetId;
        this.petName = petName;
        Species = species;
        Breed = breed;
        Age = age;
        Health = health;
    }

    public static int getPetCount() {
        return petCount;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getHealth() {
        return Health;
    }

    public void setHealth(String health) {
        Health = health;
    }

    public static void setPetCount(int petCount) {
        Pet.petCount = petCount;
    }

    public int getID() {
        return petId;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }

    public void EditPet(){}
    public void DeletePet(){}

    //tostring ,displayinfo //in main will use  admin.shelter.pets.foreach(pet =>(pet.method or attribute))
}
