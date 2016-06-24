package citbyu.cit260.journey.model.map;

import java.io.Serializable;
import java.util.Objects;

public class Map implements Serializable{
    
    private int id;
    private Location[][] placesList;
    private Location currentLocation;
    
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location[][] getPlacesList() {
        return placesList;
    }

    public void setPlacesList(Location[][] placesList) {
        this.placesList = placesList;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
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
