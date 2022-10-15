public class GrassPokemon extends Pokemon{

    /*instance variables*/

    private String overgrow;
    private String seed;

    /*constructor*/

    public GrassPokemon(String name, int hp, double height, double weight, int total_stats, String ability, String species) {
        super(name, hp, height, weight, total_stats);
        this.seed = species;
        this.overgrow = ability;
    }

    /*getters & setters*/

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public void setOvergrow(String overgrow) {
        this.overgrow = overgrow;
    }

    public String getSeed() {
        return seed;
    }

    public String getOvergrow() {
        return overgrow;
    }

    /*methods*/

    public void leafStorm() {
        System.out.println(getName() + " use a leafstorm attack!");
    }

    public void leaveBlade() {
        System.out.println(getName() + " use a leaveblade attack!");
    }

    /*override methods*/

    @Override
    public void weakness() {
        System.out.println(getName() + " doesn't like firepokemons!");
    }
}
