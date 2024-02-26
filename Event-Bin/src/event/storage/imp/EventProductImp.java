package event.storage.imp;

import event.repository.Event;
import event.storage.EventProductAbstroct;

public class EventProductImp extends EventProductAbstroct {
    @Override
    public Event generateEventProduct() {
        Event  event = new Event();
        EventWrapperImp eventWrapper = new EventWrapperImp(event);
        Event wrappedEvent = eventWrapper.getWrappedEvent();
        return wrappedEvent;
    }
}
