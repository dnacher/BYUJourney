/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyu.cit260.journey.exceptions;

/**
 *
 * @author gus
 */

  public class controlPlayerException extends Exception{

    public controlPlayerException() {
    }

    public controlPlayerException(String message) {
        super(message);
    }

    public controlPlayerException(String message, Throwable cause) {
        super(message, cause);
    }

    public controlPlayerException(Throwable cause) {
        super(cause);
    }

    public controlPlayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
