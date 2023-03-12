public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonHasPressed() {
        // invoke the execute method the command object interface
        slot.execute();
    }
}
