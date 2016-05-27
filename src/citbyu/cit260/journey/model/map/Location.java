package citbyu.cit260.journey.model.map;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Location implements Serializable{
    
    private int id;
    private String name; 
    private ArrayList locationList;
   
    
    public ArrayList getLocationList() {
        return locationList;
    }

    public void setLocationList(ArrayList locationList) {
        this.locationList = locationList;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.name);       
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }        
        return true;
    }

    @Override
    public String toString() {
        return "Place{" + "id=" + id + ", name=" + name + '}';
    }
    
    public Location(){
    }
    
    public Location(int id, String name){
        this.id=id;
        this.name=name;
    }
        
}
