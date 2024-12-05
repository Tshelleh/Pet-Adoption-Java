package edu.cis.petapp.GeneralFunctions;

import edu.cis.petapp.adoptionprocessing.*;

import java.io.*;
import java.util.ArrayList;

public class GeneralFunctions {
    public static void WriteInFile(String filename, ArrayList<?> infoList){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for(Object object:infoList){
                writer.write(object.toString());
                writer.newLine();
            }
            writer.close();
        }
        catch (IOException e){
            System.out.println("File is not found\n"+e.getMessage());
        }
    }
    public static ArrayList<?> ReadFromFile(String filename){
        ArrayList<Object> infoList=new ArrayList<>();
        try {
            BufferedReader reader=new BufferedReader(new FileReader(filename));
            String Line;
            while ((Line=reader.readLine())!=null){
                if(Line.startsWith("Adopter: ")){

                    String[] parts=Line.substring(9).split(";");
                    if(parts.length==6){
                        infoList.add(new Adopter((Integer.parseInt(parts[0])),parts[1],parts[2],(Integer.parseInt(parts[3])),(Integer.parseInt(parts[4])),parts[5]));
                    }
                }
                else if(Line.startsWith("Admin: ")){
                    String[] parts=Line.substring(7).split(";");
                    if(parts.length==4){
                        infoList.add(new Admin(Integer.parseInt(parts[0]),parts[1],parts[2],Integer.parseInt(parts[3])));
                    }
                }

            }
            reader.close();
        }
        catch (IOException e){
            System.out.println("File Reading Error\n"+e.getMessage());
        }
        return infoList;
    }
    public static void EditFile(String filename,Object object){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));
            writer.write(object.toString());
            writer.newLine();
            writer.close();
        }
        catch (IOException e){
            System.out.println("File is not found\n"+e.getMessage());
        }
    }
    public static int GenerateId(int currantId){
        currantId=ReadFromFile("User.txt").size();
        return ++currantId;
    }
}
