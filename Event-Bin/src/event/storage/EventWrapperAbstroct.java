package event.storage;

import event.repository.Event;

public abstract class EventWrapperAbstroct {


    protected abstract void init(Event event);
    protected abstract  Event  wrapEvent(Event events);
}
