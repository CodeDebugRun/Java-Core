package Assignment02_Methods;

public class A02_Method {
    public static void main(String[] args) {
        //sayHello();
        String name = "Ali";
        String greeting = sayHello(name);
        System.out.println(greeting);
        String greeting2 = sayHello(sayHello(name),"Techpro");
        System.out.println(greeting2);




    }

    public static String sayHello(String name) {

        return ("Hello! " + name);
    }
    public static String sayHello(String name, String fromCompany) {
        String result = name  + " from " + fromCompany;
        return result;
    }
    public static String sayHello(String name, String fromCompany, String fromCity) {
        return name + " from " + fromCompany + fromCity + " is away from here";

    }
    public static String sayHello(String name, String fromCompany, String fromCity, String goAway){
        return sayHello(name, fromCompany, fromCity) + " go away";
    }



}
