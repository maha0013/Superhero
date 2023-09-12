public class Superhero {

    private String name;
    private String realName;
    private String superPower;
    private int yearCreated;
    private final String race;
    private int strength;

    public Superhero(String name, String realName, String superPower, int yearCreated, String race, int strength) {
        this.name = name;
        this.realName = name;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.race = race;
        this.strength = strength;
    }

        public String getName () {
            return name;
        }

        public void setName (String name) {
            this.name = name;
        }

        public String getrealName () {
            return realName;
        }

        public void setrealName (String realName){
            this.realName = realName;
        }

        public String getsuperPower () {
            return superPower;
        }

        public void setsuperPower (String superPower) {
            this.superPower = superPower;
        }

        public int getyearCreated () {
            return yearCreated;
        }

        public void setyearCreated (int yearCreated) {
            this.yearCreated = yearCreated;
        }

        public String getRace () {
            return race;
        }

        public void setRace (String race) {
        }

        public int getstrength () {
            return strength;
        }

        public void setgetstrenght (int getstrength){
            this.strength = strength;
        }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", superPower='" + superPower + '\'' +
                ", yearCreated=" + yearCreated +
                ", race='" + race + '\'' +
                ", strength='" + strength + '\'' +
                '}';
    }
}




