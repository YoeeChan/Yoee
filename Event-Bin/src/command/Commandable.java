package command;

import command.entity.Command;

public interface Commandable {
    boolean execute(Command command);
}
