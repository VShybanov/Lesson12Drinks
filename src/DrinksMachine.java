public class DrinksMachine {
    private static float billAmount;
    private static int drinksNumber;
    public static void showMenu(){
        System.out.println("*** Меню DrinksMachine ***");
        for (Drinks drinks: Drinks.values()) {
            System.out.printf("\"%s\" - %s\n", drinks.name(), drinks);
        }
        System.out.println("\"EXIT\" - вихід.");
    }

    public static void makeDrink(Drinks drink) {
        System.out.printf("Вартіть %s - %.2f грн.\n", drink.getName(), drink.getPrice());
        billAmount += drink.getPrice();
        drinksNumber++;
        System.out.printf("Готую %s...\n", drink.getName());
    }

    public static void exit() {
        if (drinksNumber>0)
            System.out.printf("Замовлено %d напоїв. Ваш рахунок - %.2f грн.\n", drinksNumber, billAmount);
        else
            System.out.println("Нажаль Ви нічого не замовляли.");
        System.out.println("На все добре.");
    }

}
