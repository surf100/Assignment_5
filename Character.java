class Character {
    private String name;
    private CharacterState state;
    private FightingStrategy strategy;
    private int attackStrength;

    public Character(String name) {
        this.name = name;
        this.state = new NormalState();
        this.strategy = new MeleeStrategy();
        this.attackStrength = 10;
    }

    public String getName() {
        return name;
    }

    public void attack() {
        state.attack(this);
        strategy.fight();
        System.out.println("Attack strength: " + attackStrength);
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }
}