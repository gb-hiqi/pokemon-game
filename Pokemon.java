import java.util.Random;

public class Pokemon {
    private String name;
    private String type;
    private int hp;
    private int level;
    private int atk;
    private int def;
    private Random rnd = new Random();

    public Pokemon(String name, String type, int hp, int level, int def, int atk){
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public void exibirDados(String name, String type, int level){
        System.out.println("Nome: " + name);
        System.out.println("Tipo: " + type);
        System.out.println("Nivel: " + level);
    }

    public int calcularAtaque() {
        int probabilidade = rnd.nextInt(101);
        int atkTotal = this.atk;

        if(probabilidade <= 10){
            atkTotal *= 2;
        } else if (probabilidade > 10 && probabilidade <= 20) {
            atkTotal = 1;
        }

        return atkTotal;
    }

    public int calcularAtaque(int fator){
        return fator * this.calcularAtaque();
    }

    public int calcularDefesa() {
        int defesa = def + rnd.nextInt(6);

        return defesa;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHp(){
        return hp;
    }

    public int getLevel(){
        return level;
    }

    public int getAtk(){
        return atk;
    }

    public int getDef() {
        return def;
    }
}