package org.exception.handel.throwable;

public class checkProductExist {
    public String pName = "mobile";

    public void checkValidProduct(String proName)  {
        try {
            System.out.println("The product is available in the list -> " + compareName(proName));

        } catch (RuntimeException ex) {
            throw new ThrowableException("Product not exist in the list", ex);
        }

    }
    private String compareName(String productName) {
        if (pName.equals(productName)) {
            return productName;
        } else {
            throw new ThrowableException("Product not exist in the list if block", new RuntimeException());
        }
    }

    public static void main(String[] args) throws ThrowableException {
        checkProductExist checkProductExist = new checkProductExist();
        checkProductExist.checkValidProduct("mobile2");
    }


}
