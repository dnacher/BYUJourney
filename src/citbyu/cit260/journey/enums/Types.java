/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.enums;

/**
 *
 * @author Dani-Fla-Mathi
 */
public enum Types {
    
     /*
    Types:
    0 magic
    1 spell
    2 power
    3 armor
    4 map
    5 search*/
    
    Magic(0),
    Spell(1),
    Power(2),
    Armor(3),
    Map(4),
    Search(5);
    
    private int value;
    
    
    private Types(int value){

    this.value=value;

    }

    public int getValue(){
        return value;
    }
    
}
