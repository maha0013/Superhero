import java.util.ArrayList;

public class Database {

    //private Superhero[] heroList;
    int count = 0;
    private ArrayList<Superhero> superheros = new ArrayList<>();

    public Database() {
        this.superheros = new ArrayList<Superhero>();
    }

    public void addHero(String name, String realName, String superPower, int yearCreated, String race, int strength) {
        Superhero hero1 = new Superhero(name, realName, superPower, yearCreated, race, strength);
        superheros.add(hero1);
    }

    public void printheroes(){
        for(Superhero hero: superheros){
            System.out.println(hero.toString());




        }
    }


}
