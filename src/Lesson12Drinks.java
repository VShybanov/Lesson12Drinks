import java.util.Scanner;

public class Lesson12Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrinksMachine.showMenu();
        String sel;
        Drinks drink;
        do {
            System.out.print("Що бажаєте замовити? ");
            try {
                sel = scanner.nextLine().toUpperCase().trim();
            } catch (RuntimeException e) {
                continue;
            }
            if (sel.equals("EXIT")) {
                DrinksMachine.exit();
                break;
            } else {
                // drink = Drinks.valueOf(sel);
                // замість цього за умовами завдання #5 використовую switch-case
                switch (sel) {
                    case "COFFEE":
                        drink = Drinks.COFFEE;
                        break;
                    case "TEA":
                        drink = Drinks.TEA;
                        break;
                    case "LEMONADE":
                        drink = Drinks.LEMONADE;
                        break;
                    case "MOJITO":
                        drink = Drinks.MOJITO;
                        break;
                    case "MINERAL":
                        drink = Drinks.MINERAL;
                        break;
                    case "COCA_COLA":
                        drink = Drinks.COCA_COLA;
                        break;
                    default:
                        System.out.println("Помилка. Невірний вибір.");
                        continue;
                }
                DrinksMachine.makeDrink(drink);
            }
        } while (true);
    }
}
