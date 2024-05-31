package command.concretecommand;

import command.Commandable;
import command.receiver.Reciver;
public class ConcreteCommand extends abstractConcreteCommand {
    @Override
    public boolean execute(Commandable command) {
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
        Reciver reciver  = new Reciver();
        return true;
    }

}
