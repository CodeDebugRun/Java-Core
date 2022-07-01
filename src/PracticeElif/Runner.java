package PracticeElif;

public class Runner {
    public static void main(String[] args) {

        HomeBudget father = new HomeBudget();
        HomeBudget mother = new HomeBudget();
        HomeBudget brother = new HomeBudget();
        HomeBudget sister = new HomeBudget();
        father.ownIncome = 2000; //Non-static variable for home budget class assigned in constructor
        mother.ownIncome = 1000;
        brother.ownIncome = 500;
        sister.ownIncome = 200;

        father.budget = 25000; // Not assigned in constructor
        mother.budget = 15000;
        brother.budget = 10000;
        sister.budget = 200;

        father.extraIncome = 1000;


        System.out.println("Home income : " + HomeBudget.homeIncome); //Static variable for home budget  class
        HomeBudget.homeIncome = 500000;
        System.out.println("Home income : " + HomeBudget.homeIncome); //Static variable for home budget  class

        // Static method in HomeBudget class
        System.out.println("Father income : " + HomeBudget.incomeCalculator(father.ownIncome, father.extraIncome));
        //Non-Static method in HomeBudget class
        System.out.print("Father outcome is : ");
        father.totalOutcome (2000,3000);
        System.out.print("Mother outcome is : ");
        mother.totalOutcome (1000,500);



    }
}
