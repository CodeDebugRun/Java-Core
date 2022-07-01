package PracticeElif;

class HomeBudget {
    static int homeIncome = 20000;

    int ownIncome = 100000;
    int ownOutcome = 20000;
    int budget;
    int extraIncome;

    static int incomeCalculator(int salary, int sideHustle){
        return salary + sideHustle;
    }

    void totalOutcome(int mandatorySpendings, int unnecessarySpending){
        System.out.println( mandatorySpendings + unnecessarySpending);

    }



}
