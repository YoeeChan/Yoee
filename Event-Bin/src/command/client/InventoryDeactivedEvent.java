package command.client;

import event.repository.entity.Guid;

public class InventoryDeactivedEvent {
    public final Guid inventoryDeactivedEventId;
    public  final String Comment;
    public InventoryDeactivedEvent(Guid inventoryDeactivedEventId,String comment) {
        this.inventoryDeactivedEventId = inventoryDeactivedEventId;
        this.Comment = comment;
    }
}
