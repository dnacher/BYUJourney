package journey.map;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Place implements Serializable{
    
    private int id;
    private String name;
    private List<Character> CharacterList;

   
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

    public List<Character> getCharacterList() {
        return CharacterList;
    }

    public void setCharacterList(List<Character> CharacterList) {
        this.CharacterList = CharacterList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.CharacterList);
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
        final Place other = (Place) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.CharacterList, other.CharacterList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Place{" + "id=" + id + ", name=" + name + ", CharacterList=" + CharacterList + '}';
    }
        
}
