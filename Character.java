public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }

    public void sayMyStrength() {
            System.out.println("My Strength is " + strength);

    }

    public void sayMyAgility() {
        System.out.println("My Agility is " + agility);
    }

    public void sayMyIntelligence() {
        System.out.println("My Intelligence " + intelligence);
    }

    public void sayMyStrength() {
        System.out.println("My Strength is " + "Agility" + "Intelligence" + strength + agility + intelligence);
    }

}