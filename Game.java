public class Game {
    public static void main(String[] args) {
        Character hero = new Character("Hero");

        GameAction attackAction = new AttackAction();
        attackAction.executeAction(hero);

        hero.setState(new PoweredUpState());
        hero.setStrategy(new RangedStrategy());

        attackAction.executeAction(hero);

        hero.setState(new DefeatedState());

        attackAction.executeAction(hero);

        EffectVisitor boost = new BoostVisitor();
        EffectVisitor damage = new DamageVisitor();

        boost.applyBoost(hero);
        damage.applyDamage(hero);
    }
}