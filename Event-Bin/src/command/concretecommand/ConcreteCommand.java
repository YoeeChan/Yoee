package command.concretecommand;

import command.Commandable;
import command.receiver.abstractReciver;

public class ConcreteCommand extends abstractConcreteCommand {
    @Override
    public boolean execute(Commandable command) {
        return false;
    }


    @Override
    boolean Reciver(abstractReciver abstractReciver) {

        return false;
    }
}
