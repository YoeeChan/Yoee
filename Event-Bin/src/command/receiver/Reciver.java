package command.receiver;

public class Reciver extends  abstractReciver{
    @Override
    boolean InitCommand() {
        return false;
    }

    @Override
    boolean DestroyedCommand() {
        return false;
    }

    @Override
    boolean WithdrawCommand() {
        return false;
    }
}
