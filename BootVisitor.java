class BoostVisitor implements EffectVisitor {
    @Override
    public void applyBoost(Character character) {
        System.out.println(character.getName() + " receives a boost!");
        character.setAttackStrength(character.getAttackStrength() + 5);
    }

    @Override
    public void applyDamage(Character character) {
        // No effect for boost
    }
}