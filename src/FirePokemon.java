public class FirePokemon extends Pokemon {

    /*instance variables*/

    private String blaze;

    private String lizard;


    /*constructor*/

    public FirePokemon(String name, int hp, double height, double weight, int total_stats, String ability, String species) {
        super(name, hp, height, weight, total_stats);
        this.blaze = ability;
        this.lizard= species;
    }

    /*getters & setters*/

    public String getBlaze() {

        return blaze;
    }

    public void setBlaze(String blaze) {

        this.blaze = blaze;
    }

    public String getLizard() {
        return lizard;
    }

    public void setLizard(String lizard) {

        this.lizard = lizard;
    }

    /*methods*/

    public void firelash(){
        System.out.println(getName() + " uses firelash attack!");
    }

    public void inferno(){
        System.out.println(getName() + " uses inferno attack!");
    }

    /*override method*/

    @Override
    public void weakness() {
        System.out.println(getName() + " doesn't like water pokemons!");
    }
}
