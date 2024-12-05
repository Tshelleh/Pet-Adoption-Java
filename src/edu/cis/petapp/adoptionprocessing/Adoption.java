package edu.cis.petapp.adoptionprocessing;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class Adoption {
private final int AdoptionId;
private Pet pet;  //has admin id
private int petId;   //get it from pet
private Adopter adopter;
private int adopterId;
private String status;
private LocalDate Adoption_Date;  //determined after adoption is accepted by admin //use LocalData.now()
private static int AdoptionCount;

    public Adoption(int adoptionId) {
       this(adoptionId,-1,-1,"Initiated",null);
    }

    public Adoption(int adoptionId, int petId, int adopterId, String status, LocalDate adoption_Date) {
        AdoptionId = adoptionId;
        this.petId = petId;
        this.adopterId = adopterId;
        this.status = status;
        Adoption_Date = adoption_Date;
    }

    public LocalDate getAdoption_Date() {
        return Adoption_Date;
    }

    public void setAdoption_Date(LocalDate adoption_Date) {
        Adoption_Date = adoption_Date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAdopterId() {
        return adopterId;
    }

    public void setAdopterId(int adopterId) {
        this.adopterId = adopterId;
    }

    public int getAdoptionId() {
        return AdoptionId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public static int getAdoptionCount() {
        return AdoptionCount;
    }

    public String Adoption_pet(Adopter user,Pet pet){return null;} //will return status

}
