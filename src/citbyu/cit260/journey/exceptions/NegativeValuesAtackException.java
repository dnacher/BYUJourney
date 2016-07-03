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
public class NegativeValuesAtackException extends Exception{

    public NegativeValuesAtackException() {
    }

    public NegativeValuesAtackException(String message) {
        super(message);
    }

    public NegativeValuesAtackException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeValuesAtackException(Throwable cause) {
        super(cause);
    }

    public NegativeValuesAtackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
