public class WaterPokemon extends Pokemon{

    /* instance variables*/

    private String torrent;

    private String turtle;

    /*constructor*/

    public WaterPokemon(String name, int hp, double height, double weight, int total_stats, String ability, String species) {
        super(name, hp, height, weight, total_stats);
        this.torrent = ability;
        this.turtle = species;
    }

    /*getters & setters*/

    public void setTorrent(String torrent) {
        this.torrent = torrent;
    }

    public void setTurtle(String turtle) {
        this.turtle = turtle;
    }

    public String getTorrent() {
        return torrent;
    }

    public String getTurtle() {
        return turtle;
    }

    /*methods*/

    public void hydroCanon() {
        System.out.println(getName() + "uses hydro canon attack!");
    }

    public void rainDance() {
        System.out.println(getName() + "uses a rain dance attack!");
    }

    /*override methods*/

    @Override
    public void weakness() {
        System.out.println(getName() + "doesn't like grass pokemons!");
    }
}
