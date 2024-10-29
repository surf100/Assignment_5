class DamageVisitor implements EffectVisitor {
    @Override
    public void applyDamage(Character character) {
        System.out.println(character.getName() + " takes damage!");
        character.setAttackStrength(character.getAttackStrength() - 5);
    }

    @Override
    public void applyBoost(Character character) {
        // No effect for damage
    }
}