public class GarageDoorOpenCommand implements  Command {  // this is the object that encapsulates the request

    GarageDoor garageDoor; // this is the receiver object that does the actual work

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {  // this is a common method that the invoker calls when it wants work done
        garageDoor.up();
    }
}
