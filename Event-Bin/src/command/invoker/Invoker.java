package command.invoker;

import command.concretecommand.ConcreteCommand;
import command.entity.Command;
import command.receiver.Reciver;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    private void InvokerReceive(Command command){
        ConcreteCommand concreteCommand = new ConcreteCommand();
        concreteCommand.execute(command);
    }
}
