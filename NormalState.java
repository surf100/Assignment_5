class NormalState implements CharacterState {
    @Override
    public void attack(Character character) {
        System.out.println(character.getName() + " attacks normally!");
        character.setAttackStrength(10);
    }
}