/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragon.exceptions;

/**
 *
 * @author Karina
 */
public class DragonCControlException extends Exception {

    public DragonCControlException() {
    }

    public DragonCControlException(String message) {
        super(message);
    }

    public DragonCControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public DragonCControlException(Throwable cause) {
        super(cause);
    }

    public DragonCControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
