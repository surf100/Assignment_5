class HealAction extends GameAction {
    @Override
    protected void performAction(Character character) {
        System.out.println(character.getName() + " heals!");
    }
}