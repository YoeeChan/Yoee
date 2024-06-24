package command.concretecommand;

import command.Commandable;
import command.receiver.abstractReciver;

public abstract class abstractConcreteCommand  implements Commandable {
    abstract boolean Reciver();

    @Override
    public boolean execute(Commandable command) {
        return false;
    }
}
