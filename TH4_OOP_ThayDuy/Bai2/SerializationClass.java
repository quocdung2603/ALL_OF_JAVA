package Bai2;


import java.io.*;
import java.util.*;

public class SerializationClass implements Serializable{
    private static final long serialVersionUID = 1L;
    private ArrayList<XE> ds;


    public SerializationClass(ArrayList<XE> ds) {
        this.ds = ds;
    }

    public ArrayList<XE> getDs() {
        return this.ds;
    }

    public void setDs(ArrayList<XE> ds) {
        this.ds = ds;
    }
    
    public void serialize(String filename)
    {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) 
        {
            out.writeObject(this);
            System.out.println("Serialization completed successfully!");
        } 
        catch (Exception e) 
        {
            System.err.println("Serialization failed: " + e.getMessage());
        }
    }
}
