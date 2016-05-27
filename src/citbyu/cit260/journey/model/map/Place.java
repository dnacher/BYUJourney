package citbyu.cit260.journey.model.map;

import java.util.ArrayList;

public class Place {
    
    private int id;
    private String name;
    private ArrayList itemList ;
    private ArrayList enemiesList;

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

    public ArrayList getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList itemList) {
        this.itemList = itemList;
    }

    public ArrayList getEnemiesList() {
        return enemiesList;
    }

    public void setEnemiesList(ArrayList enemiesList) {
        this.enemiesList = enemiesList;
    }
    
    
    public Place(){
    }
    
    public Place(int id, String name, ArrayList itemList, ArrayList enemiesList){
        this.id=id;
        this.name=name;
        this.itemList=itemList;
        this.enemiesList=enemiesList;
    }
    
}
