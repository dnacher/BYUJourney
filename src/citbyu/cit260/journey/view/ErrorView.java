/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.view;

import citbyu.cit260.journey.Journey;
import java.io.PrintWriter;
import sun.rmi.log.ReliableLog;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class ErrorView {
    
    private static final PrintWriter errorFile= Journey.getOutFile();
    private static final PrintWriter logFile=Journey.getLogFile();
    
    public static void display(String className, String errorMessage){
        errorFile.println("--------------------------------------" +
                        "\n- ERROR - " + errorMessage +
                        "\n--------------------------------------");
        //log error
        logFile.println(className + " - " + errorMessage);
    }
}
