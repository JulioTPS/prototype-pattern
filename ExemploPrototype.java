public class ExemploPrototype {
    public static void main(String[] args) {
        PersonagemPrototype personagem = new PersonagemPrototype("nome 1", 12, 222);

        PersonagemPrototype personagemClone = (PersonagemPrototype) personagem.clone();

        personagemClone.setNome("clone do personagem");

        System.out.printf("nome personagem: %s%nlevel personagem: %d%nexp personagem: %d%n",
                personagem.getNome(), personagem.getLevel(), personagem.getExp());

        System.out.printf("nome clone: %s%nlevel clone: %d%nexp clone: %d%n",
                personagemClone.getNome(), personagemClone.getLevel(), personagemClone.getExp());

    }
}