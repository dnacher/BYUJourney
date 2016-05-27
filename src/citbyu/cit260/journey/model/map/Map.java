package citbyu.cit260.journey.model.map;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Map implements Serializable{
    
    private int id;
    private List<Location> placesList;

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Location> getPlacesList() {
        return placesList;
    }

    public void setPlacesList(List<Location> placesList) {
        this.placesList = placesList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.placesList);
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
        final Map other = (Map) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.placesList, other.placesList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "id=" + id + ", placesList=" + placesList + '}';
    }
    
    
}
