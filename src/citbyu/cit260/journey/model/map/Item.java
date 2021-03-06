package citbyu.cit260.journey.model.map;

import citbyu.cit260.journey.enums.ItemDescription;
import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable{
    
    private int id;
    private String name;       
    private boolean inUse;   
    private int Level;
    private ItemDescription Description;
    private int Type;
    private boolean found;
   
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

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }   

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }    
    

    public ItemDescription getDescription() {
        return Description;
    }

    public void setDescription(ItemDescription Description) {
        this.Description = Description;
    }

    public int getType() {
        return Type;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    public boolean isFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + (this.inUse ? 1 : 0);
        hash = 89 * hash + this.Level;
        hash = 89 * hash + Objects.hashCode(this.Description);
        hash = 89 * hash + this.Type;
        hash = 89 * hash + (this.found ? 1 : 0);
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
        final Item other = (Item) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.inUse != other.inUse) {
            return false;
        }
        if (this.Level != other.Level) {
            return false;
        }
        if (this.Description != other.Description) {
            return false;
        }
        if (this.Type != other.Type) {
            return false;
        }
        if (this.found != other.found) {
            return false;
        }
        return true;
    }   
            
    public Item(){
        this.id=-1;
    }
    
    public Item(int id,String name,boolean inUse, int Level, ItemDescription description, int Type){        
        this.id=id;
        this.name=name;
        this.inUse=inUse;       
        this.Level=Level;
        this.Description=description;
        this.Type=Type; 
        this.found=false;
    }
    
    
}
