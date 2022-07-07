package Day19_Scope;
public class C02_StaticVariables {

    static int staticNumber = 10;
    String nameValueAssigned = "Johnson";
    String nameValueNotAssigned;
    static String staticValueAssignedName = "Name of School";

    static int staticValueNotAssigned;
    int nonStaticValueNotAssigned;

    public static void main(String[] args) {

        staticNumber = 12;
        System.out.println(staticNumber);
        staticMethod();
        //C01_ClassLevelVariables newObject = new C01_ClassLevelVariables();
        C02_StaticVariables newObject = new C02_StaticVariables();
        newObject.nonStaticMethod();
        System.out.println(staticNumber);
    }
    public static void staticMethod (){

        staticNumber = 99;
        System.out.println(staticNumber);
    }
    public void nonStaticMethod(){

        staticNumber = 13;
        System.out.println(staticNumber);
        staticNumber = 999;
    }
}
