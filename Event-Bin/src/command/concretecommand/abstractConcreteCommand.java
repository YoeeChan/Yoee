package command.concretecommand;

import command.Commandable;
import command.entity.Command;
import command.receiver.abstractReciver;

public abstract class abstractConcreteCommand  implements Commandable {
    abstract boolean Reciver();

    @Override
    public boolean execute(Command command) {
        return false;
    }
}
