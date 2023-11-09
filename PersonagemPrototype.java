public class PersonagemPrototype implements Prototype {
    private String nome;
    private int level;
    private int exp;

    public PersonagemPrototype(PersonagemPrototype source) {
        this.nome = source.nome;
        this.level = source.level;
        this.exp = source.exp;
    }

    public PersonagemPrototype(String nome, int level, int exp) {
        this.nome = nome;
        this.level = level;
        this.exp = exp;
    }


    @Override
    public Prototype clone() {
        return new PersonagemPrototype(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
