import ifloop.Support;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //region Demo
    /**
     * Ukázka použítí metody {@link Support#safeReadInt()}
     *
     * Tato metoda použije metodu {@link Support#safeReadInt() k načtení
     * jednoho čísla od uživatele a vypsání tohoto čísla na výstup.
     *
     * Podobně můžeš používat metodu {@link Support#safeReadInt()}
     * i v dalších metodách.
     */

    public static void readOneIntFromInputAndPrintIt() {
        int input = Support.safeReadInt();
        System.out.println("You entered: "+input);
    }

    //endregion

    //region Úlohy na cykly

    /**
    * Čte čísla, která zadává uživatel a vypisuje je na výstup.
    * Metoda pokračuje ve čtení opakovaně tak dlouho, dokud uživatel zadává kladná čísla či nulu.
    *
    * Jakmile uživatel zadá záporné číslo, metoda skončí.
    */




    public static void readIntsFromInputAndPrintItUntilNegative() {
        // Pomocná proměnná k uložení pořízeného čísla
        int input;

        // Vlastní algoritmus řešící zadání
        do {
            input = Support.safeReadInt();
            System.out.println("Zadali jste: " + input);
        }
        while (input>=0);
    }

    /**
    * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
    * Jako návratovou hodnotu vrátí součet zadaných čísel (záporné číslo by nemělo být zahrnuto).
    *
    * @return Součet všech zadaných čísel (záporné číslo ukončující vstup není zahrnuto).
    */

    public static int sumAllInputUntilNegative() {

        // pomocná proměnná k uložení pořízeného čísla
        int input;
        // pomocná proměnná sloužící k ukládání součtu pořízených čísel.
        // Inicializace na nulu provádím jen z bezpečnostních důvodů,
        //  nulovou hodnotu by měla mít proměnná implicitně při svém vzniku
        int soucet = 0;

        //vlastní algoritmus řešící zadání
        do {
            input = Support.safeReadInt();
            if (input>0) {soucet += input;}
        }
        while (input>=0);
        return soucet;

    }

    /**
    * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
    * Všechna načtená čísla uloží do listu, který vrátí jako návratovou hodnotu.
    *
    * @return List načtených hodnot (záporná hodnota není zahrnuta v listu)
    */

    public static List<Integer> storeAllInputInArrayListUntilNegative() {

        // pomocná proměnná k uložení pořízeného čísla
        int input;
        // pomocná proměnná k uložení pořízených čísel
        ArrayList<Integer> listInteger = new ArrayList<>();

        //vlastní algoritmus řešící zadání
        do {
            input = Support.safeReadInt();
            if (input>0) {listInteger.add(input);}
        }
        while (input>=0);
        return listInteger;
    }

    /**
    * Dostane jako parametr list čísel. Vypíše čísla na obrazovku. Každé číslo vypiš na samostatný řádek.
    * @param list List čísel, která se mají vypsat.
    */

    public static void printAllIntegersFromList(List<Integer> list) {
        //vlastní algoritmus řešící zadání
        for (Integer i : list) { System.out.println(i);}
    }

    /**
    * Sečte hodnoty z listu a vrátí výsledek jako návratovou hodnotu.
    @param list List čísel, která chceme sečíst.
    @return Součet všech čísel v listu.
    */

    public static Integer sumAllIntegersFromList(List<Integer> list) {
        // pomocná proměnná sloužící k ukládání součtu čísel z pole.
        // Inicializace na nulu provádím jen z bezpečnostních důvodů,
        //  nulovou hodnotu by měla mít proměnná implicitně při svém vzniku
        int soucet = 0;

        //vlastní algoritmus řešící zadání
        for (int i : list) { soucet = soucet + i;} return soucet;
    }

    //endregion


    //region Podmínky

    /**
    * Vypíše čísla ze seznamu, která jsou menší než zadaný limit.
    * @param list Seznam čísel, která máme zkontrolovat.
    * @param limit Limit - vypsána budou pouze čísla z listu, která jsou menší než limit
    */

    public static void printIntegersUnderLimit(List<Integer> list, int limit) {
        //vlastní algoritmus řešící zadání
        for (Integer i : list) { if (i<limit) {System.out.println(i);} }
    }

    /**
    * Vypíše čísla ze zadaného listu.
    * Při výpisu ale nahradí:
    * - číslo 1 slovem "one",
    * - číslo 2 slovem "two",
    * - číslo 3 slovem "three"
    * Ostatní čísla vypíše jako číselnou hodnotu.
    * Například pokud dostane jako parametr seznam [5, 3, 1, 48, 2],
    * vypíše: 5, three, one, 48, two.
    * @param list Seznam čísel, která se mají vypsat.
    */

    public static void printIntegersWithReplace(List<Integer> list) {
        //vlastní algoritmus řešící zadání
        for (Integer i : list) {
            switch (i.byteValue()) {
                case 1 -> System.out.println("one");
                case 2 -> System.out.println("two");
                case 3 -> System.out.println("tree");
                default -> System.out.println(i);
            }

        }

    }

    //endregion

    public static void main(String[] args) {
        // Příklad:
        System.out.println("--- Example - read and print one integer ---");
        readOneIntFromInputAndPrintIt();
        // ---
        System.out.println("--- Task 1 - read and print integers until negative ---");
        readIntsFromInputAndPrintItUntilNegative();
        // ---
        System.out.println("--- Task 2 - sum all integers until negative ---");
        System.out.println("Total sum: " + sumAllInputUntilNegative());
        // ---
        System.out.println("--- Task 3 - read integers to list until negative ---");
        List<Integer> list = storeAllInputInArrayListUntilNegative();
        System.out.println(list);
        // ---
        System.out.println("--- Task 4 - print all integers from list ---");
        printAllIntegersFromList(list);
        // ---
        System.out.println("--- Task 5 - sum all integers in list ---");
        System.out.println("Total sum: " + sumAllIntegersFromList(list));
        // ---
        System.out.println("--- Task 6 - print integers under 5 from list ---");
        printIntegersUnderLimit(list, 5);
        // ---
        System.out.println("--- Task 7 - print integers - replace: 1 => \"one\", 2 => \"two\", 3 => \"three\" ---");
        printIntegersWithReplace(list);
    }

}
