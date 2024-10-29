class PoweredUpState implements CharacterState {
    @Override
    public void attack(Character character) {
        System.out.println(character.getName() + " attacks with a powered-up strike!");
        character.setAttackStrength(20);
    }
}