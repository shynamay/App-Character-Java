public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 8;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Erza";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character();

        mage.strength = 10;
        mage.agility = 9;
        mage.intelligence = 10;
        mage.name = "Natsu";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        Character thief = new Character();

        thief.strength = 8;
        thief.agility = 8;
        thief.intelligence = 8;
        thief.name = "Merlin";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character archer = new Character();
        archer.strength = 9;
        archer.agility = 8;
        archer.intelligence = 8;
        archer.name = "Lucy";
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();

    }
}