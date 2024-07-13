package command.concretecommand;

import command.Commandable;
import command.entity.Command;
import command.receiver.Reciver;
public class ConcreteCommand extends abstractConcreteCommand {
    @Override
    public boolean execute(Command command) {
      try {
          this .Reciver();
          return  true;
      }catch (Exception e){
          e.printStackTrace();
          throw e;
      }
    }

    @Override
    boolean Reciver() {
       // Reciver reciver  = new Reciver();
        return true;
    }

}
