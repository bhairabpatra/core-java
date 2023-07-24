package org.exception.handel.throwable;

public class checkProductExist {
    public String pName = "mobile";

    public boolean checkValidProduct(String proName) throws ThrowableException {
        try {
            if (pName == proName) {
                return true;
            }
        } catch (Exception ex) {
            throw new ThrowableException("Product NOT Exist", ex);
        }
        return false;
    }
}
