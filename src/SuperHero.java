public class SuperHero extends Person{
    private String alterEgo;

    public SuperHero(String officialName, String alterEgo) {
        super(officialName);
        this.alterEgo = alterEgo;
    }

    public String getName() {
        return alterEgo;
    }

    public String getSecretIdentity() {
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero theDarkKnight = new SuperHero("Bruce Wayne", "Batman");

        System.out.println("theDarkKnight.getName() = " + theDarkKnight.getName());

        System.out.println("theDarkKnight.getSecretIdentity() = " + theDarkKnight.getSecretIdentity());
    }
}
