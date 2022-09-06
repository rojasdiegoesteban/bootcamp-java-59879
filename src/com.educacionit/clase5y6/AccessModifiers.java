package com.educacionit.clase5y6;

/**
 * {@code AccessModifiers} contains examples about access level modifiers
 * <p>
 * Documentation: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 *
 * @author Jonathan Manera
 */
public class AccessModifiers {

    /*
         public modifier is visible to all classes everywhere
     */

    public String worldAttribute;

    public void worldMethod() {
    }

    /*
        protected modifier specifies that the member can be accessed within its own package, classes and subclasses
     */
    protected String superclassAttribute;

    protected void superclassMethod() {
    }

     /*
        no modifier or 'package-private' specifies that the member can be accessed within its own package and classes
     */

    String packageAttribute;

    void packageMethod() {
    }

    /*
        private specifies that the member can be accessed only within its own classes
     */

    private String classAttribute;

    private void classMethod() {
    }

}
