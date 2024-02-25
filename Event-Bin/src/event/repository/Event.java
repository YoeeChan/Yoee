package event.repository;

import event.repository.entity.ColumnType;
import event.repository.entity.Guid;

public class Event {
    private ColumnType columnName;
    //point to next table aggregate table:foreign key
    private Guid aggregateId;
    private int version;
}
