import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokemons = new ArrayList<>();

    public void adicionarPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }
}