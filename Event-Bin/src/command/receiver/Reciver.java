package command.receiver;

import command.entity.Command;

public class Reciver extends abstractReciver{
    public Reciver(Command command) {
        this.InitCommand(command);
    }
    @Override
     boolean InitCommand(Command command) {
        return false;
    }
    @Override
   public boolean DestroyedCommand() {
        return false;
    }

    @Override
    public boolean WithdrawCommand() {
        return false;
    }
}
