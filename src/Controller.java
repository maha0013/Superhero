import java.util.Scanner;

public class Controller {
    private Database db;
    private final Scanner keyboard = new Scanner(System.in);
    private final Database superHeroList = new Database();


    public void GUI() {
        boolean isRunning = true;
        while(isRunning) {
            System.out.println("Vælg handling");
            System.out.println("1: Skab helt");
            System.out.println("2: Vis helte");
            System.out.println("3: Afslut");
            int option = keyboard.nextInt();
            switch (option) {
                case 1:
                    createHero();
                    break;
                case 2:
                    listHeroes();
                    break;
                case 3:
                    isRunning = false;
                    break;
            }
        }
    }

     public void createHero() {
             String name;
             String realName;
             String superPower;
             int yearCreated;
             String race;
             int strength;

             System.out.println("Hvad er superheltens navn?");
             keyboard.nextLine();
             name = keyboard.nextLine();

             System.out.println("Hvad er superheltens rigtige navn?");
             realName = keyboard.nextLine();

             System.out.println("Hvad er superheltens superkraft?");
             superPower = keyboard.nextLine();

             System.out.println("Hvilket år er superhelten skabt?");
             yearCreated = keyboard.nextInt();
             keyboard.nextLine();

             System.out.println("Hvad er superheltens race?");
             race = keyboard.nextLine();

             System.out.println("Hvad er superheltens styrke?");
             strength = keyboard.nextInt();

             superHeroList.addHero(name, realName, superPower, yearCreated, race, strength);
         }

     public void listHeroes() {
          superHeroList.printheroes();
     }

}
