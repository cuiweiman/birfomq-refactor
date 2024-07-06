package com.zachary.bifromq.plugin.eventcollector.distservice;

import com.zachary.bifromq.plugin.eventcollector.Event;
import com.zachary.bifromq.plugin.eventcollector.EventType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true, chain = true)
@ToString(callSuper = true)
public final class DeliverNoInbox extends Event<DeliverNoInbox> {
    private int brokerId;
    private String delivererKey;
    private SubInfo subInfo;
    private TopicMessagePack messages;

    @Override
    public EventType type() {
        return EventType.DELIVER_NO_INBOX;
    }

    @Override
    public void clone(DeliverNoInbox orig) {
        super.clone(orig);
        this.brokerId = orig.brokerId;
        this.delivererKey = orig.delivererKey;
        this.subInfo = orig.subInfo;
        this.messages = orig.messages;
    }
}
