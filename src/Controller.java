import java.util.Scanner;

public class Controller {
    private Database db;
     public void createHero() {
         Scanner keyboard = new Scanner(System.in);
         Database superHeroList = new Database();
         for (int i = 0; i < 2; i++) {
             String name = "";
             String realName = "";
             String superPower = "";
             int yearCreated = 0;
             String race = "";
             String strength = "";

             System.out.println("Hvad er superheltens navn?");
             name = keyboard.next();

             System.out.println("Hvad er superheltens rigtige navn?");
             realName = keyboard.next();

             System.out.println("Hvad er superheltens superkraft?");
             superPower = keyboard.next();

             System.out.println("Hvilket år er superhelten skabt?");
             yearCreated = keyboard.nextInt();
             keyboard.nextLine();

             System.out.println("Hvad er superheltens race?");
             race = keyboard.next();

             System.out.println("Hvad er superheltens styrke?");
             strength = keyboard.next();

             superHeroList.addHero(name, realName, superPower, yearCreated, race, strength);
         }
         superHeroList.printheroes();
     }

}
