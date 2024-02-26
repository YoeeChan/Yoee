package event.repository;

import event.repository.entity.ColumnType;
import event.repository.entity.Guid;

public class Event {
    private ColumnType type;
    //point to next table aggregate table:foreign key
    private Guid aggregateId;
    private String Data;
    private int version;
}