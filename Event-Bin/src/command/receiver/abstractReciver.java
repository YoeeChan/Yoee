package command.receiver;

import command.entity.Command;

public abstract class abstractReciver {

    abstract boolean InitCommand(Command command);
    public abstractReciver() {}
    abstract boolean DestroyedCommand();
    abstract boolean WithdrawCommand();

}
