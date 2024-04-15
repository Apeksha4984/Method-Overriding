

package com.mycompany.overriding;



public class Derived extends Base {
    public void show()
    {
        System.out.println("show derived class");
    
    }
    public void view()
    {
        System.out.println("view method");
        super.show();
    }
    
}
