public class Main {
    public static void main(String[] args) {

        /*objects*/

        FirePokemon charmander = new FirePokemon(
                "Charmander",70, 0.6,8.5, 309, "blaze", "lizard");
        ElectricPokemon pikachu = new ElectricPokemon(
                "Pikachu", 35, 1.04, 6.0, 320, "static_electricity", "mouse");
        GrassPokemon bulbasaur = new GrassPokemon(
                "Bulbasaur", 45, 0.7, 6.9, 318, "overgrow", "seed pokemon");
        WaterPokemon wartortle = new WaterPokemon(
                "Wartortle", 59, 1.0, 22.5, 405, "torrent", "turtle");


        /*code*/

        charmander.firelash();
        charmander.weakness();

        pikachu.height();
        pikachu.electroball();
        pikachu.hp();
        pikachu.setHp(34);
        pikachu.hp();
        wartortle.total_stats();
        }
}


