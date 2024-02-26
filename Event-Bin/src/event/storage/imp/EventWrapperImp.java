package event.storage.imp;

import event.repository.Event;
import event.storage.EventWrapperAbstroct;

public class EventWrapperImp extends EventWrapperAbstroct {
    private  Event event;
    EventWrapperImp(Event event){
        this.init(event);
        this.event = event;
    }
    @Override
    protected void init(Event event) {
         this.wrapEvent(event);
    }
    @Override
    protected Event wrapEvent(Event event) {
        return event;
    }
    public  Event getWrappedEvent(){
        return this.event;
    }

}
