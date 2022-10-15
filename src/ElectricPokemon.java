public class ElectricPokemon extends Pokemon {

    /*instance variables*/

    private String static_electricity;
    private String mouse;

    /*constructor*/

    public ElectricPokemon(String name, int hp, double height, double weight, int total_stats, String ability, String species) {
        super(name, hp, height, weight, total_stats);
        this.static_electricity = ability;
        this.mouse = species;
    }

    /* getters & setters*/

    public void setStatic_electricity(String static_electricity) {
        this.static_electricity = static_electricity;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getStatic_electricity() {
        return static_electricity;
    }

    public String getMouse() {
        return mouse;
    }

    /*methods*/

    public void electroball() {
        System.out.println(getName() + " uses electroball attack!");
    }

    public void thunderPunch() {
        System.out.println(getName() + " uses a thunderpunch attack!");
    }

    /*override methods*/

    @Override
    public void weakness() {
        System.out.println(getName() + " doesn't like ground pokemons");
    }
}


