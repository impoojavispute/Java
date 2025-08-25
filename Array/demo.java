package Array;

class SuperClass {
    private void privateMethod()
    {
        System.out.println(
            "it is a private method in SuperClass");
    }

    public void publicMethod()
    {
        System.out.println(
            "it is a public method in SuperClass");
        privateMethod();
    }
}

class SubClass extends SuperClass {
    // This is a new method with the same name as the
    // private method in SuperClass
    private void privateMethod()
    {
        System.out.println(
            "it is private method in SubClass");
    }

    // This method overrides the public method in SuperClass
    public void publicMethod()
    {
        // calls the private method in
        // SubClass, not SuperClass
        System.out.println(
            "it is a public method in SubClass");
        privateMethod();
    }
}

public class demo {
    public static void main(String[] args)
    {
        SuperClass o1 = new SuperClass(); // calls the public method in// SuperClass
        o1.publicMethod();
       SubClass o2 = new SubClass(); 
        // calls the overridden public
        // method in SubClass
        o2.publicMethod();
    }
}