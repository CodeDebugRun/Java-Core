package Day19_Scope;

public class C03_ClassVariables {
    public static void main(String[] args) {

        C02_StaticVariables.staticMethod(); //Cagirilan method da deger neyse o deger yazdirir.
        System.out.println(C02_StaticVariables.staticNumber); //Class calismadan sadece variable ye gider bu nedenle
                                                                // en son verilen deger yazdirilir.
        System.out.println(C02_StaticVariables.staticValueNotAssigned);//Atanmis bir deger olmadigi icin sifir yazdirir.

        System.out.println(C02_StaticVariables.staticValueAssignedName);

        //Class level variable de deger atayip atamamak bize kalmistir. Eger deger atamissak java onu kabul eder.
        //Eger deger atamazsak DEFAULT int => 0 *****  String => null **** boolean => false **** char => '' hiclik ;
        //Baska classlarda instance variable ye OBJECT olusturarak ulasabiliriz.

        C02_StaticVariables newObject01 = new C02_StaticVariables();
        newObject01.nonStaticMethod(); //Static olmayan degere gidip orda gordugu degeri yazdirir.
        System.out.println(C02_StaticVariables.staticNumber); //Method icerisindeki en son deger atanmis olur
        System.out.println(newObject01.nameValueAssigned); // Class icinde atadigimiz degeri yazdi
        System.out.println(newObject01.nonStaticValueNotAssigned); // deger atanmadi

        System.out.println(newObject01.nameValueNotAssigned); // deger atanmayinca null yazdirir.

        C01_ClassLevelVariables object2 = new C01_ClassLevelVariables();



    }
}
