abstract class GameAction {
    public final void executeAction(Character character) {
        prepareAction(character);
        performAction(character);
        finalizeAction(character);
    }

    protected abstract void performAction(Character character);

    private void prepareAction(Character character) {
        System.out.println(character.getName() + " is preparing for the action...");
    }

    private void finalizeAction(Character character) {
        System.out.println(character.getName() + " has completed the action!");
    }
}