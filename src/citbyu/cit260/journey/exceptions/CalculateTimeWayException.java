/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.exceptions;

/**
 *
 * @author Dani-Fla-Mathi
 */
public class CalculateTimeWayException extends Exception{

    public CalculateTimeWayException() {
    }

    public CalculateTimeWayException(String message) {
        super(message);
    }

    public CalculateTimeWayException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculateTimeWayException(Throwable cause) {
        super(cause);
    }

    public CalculateTimeWayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
