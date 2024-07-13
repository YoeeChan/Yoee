package command.entity;

import java.util.List;

public class Command {
    public List<String> receiver;

    public List<String> getReceiver() {
        return receiver;
    }
    public void setReceiver(List<String> receiver) {
        this.receiver = receiver;
    }
}
