package command.receiver;

public abstract class abstractReciver {

    abstract boolean InitCommand();
    public abstractReciver() {
        this.InitCommand();
    }
    abstract boolean DestroyedCommand();
    abstract boolean WithdrawCommand();

}
