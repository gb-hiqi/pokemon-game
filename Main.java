import java.util.Scanner;

public class Main { 

    static Pokedex pokedex = new Pokedex();

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int option;

        do {

            System.out.println("1. Cadastrar pokemon");
            System.out.println("0. Sair");
            option = scanner.nextInt();

        switch(option) {
            case 1:
            scanner.nextLine();
            System.out.print("Digite o Nome do pokemon: ");
            String name = scanner.nextLine();
            System.out.print("Digite o tipo do pokemon: ");
            String type = scanner.nextLine();
            System.out.print("Qual o level do pokemon? ");
            int level = scanner.nextInt();
            System.out.print("Qual o hp do pokemon? ");
            int hp = scanner.nextInt();
            System.out.print("Qual o atk do pokemon? ");
            int atk = scanner.nextInt();
            System.out.print("Qual a def do pokemon? ");
            int def = scanner.nextInt();
            pokedex.adicionarPokemon(new Pokemon(name, type, hp, level, def, atk));
            break;


        }

        } while (option != 0);


        for(int i = 0; i < pokedex.getPokemons().size(); i++){
            Pokemon pokemon = pokedex.getPokemons().get(i);
                System.out.println("Pokemon " + (i + 1) + ":");
                System.out.println("Nome: " + pokemon.getName());
                System.out.println("Tipo: " + pokemon.getType());
                System.out.println("Level: " + pokemon.getLevel());
                System.out.println("HP: " + pokemon.getHp());
                System.out.println("ATK: " + pokemon.getAtk());
                System.out.println("DEF: " + pokemon.getDef());
                System.out.println();
        }
        scanner.close();
        
    }
}