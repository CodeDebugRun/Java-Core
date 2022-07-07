package Day19_Scope;

public class C01_ClassLevelVariables {
    int num = 38;
    static int num1 = 34;
    static String sentence = "This is static string";
    static String valueNotAssigned;
    String nonStatic = "Can not be reached without object creation";



    public static void main(String[] args) {
        System.out.println(sentence);
        System.out.println(valueNotAssigned);
        // System.out.println(nonStatic); Non-static field 'nonStatic' cannot be referenced from a static context
        C01_ClassLevelVariables object01 = new C01_ClassLevelVariables();

        System.out.println(object01.nonStatic);
        System.out.println(object01.num);
        C01_ClassLevelVariables.staticMethod();
        /*****************************/
        object01.nonStaticMethod();



    }
    public static void staticMethod (){
        System.out.println("reachable directly from class");



    }
    public void nonStaticMethod(){
        System.out.println("reachable from object");



    }
}
