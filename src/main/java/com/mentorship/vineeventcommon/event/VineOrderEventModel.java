package com.mentorship.vineeventcommon.event;

import java.time.Clock;
import org.springframework.context.ApplicationEvent;

public class VineOrderEventModel extends ApplicationEvent {

    private String message;
    private Long orderId;

    public VineOrderEventModel(Object source, String message, Long orderId) {
        super(source);
        this.message = message;
        this.orderId = orderId;
    }

    public String getMessage() {
        return message;
    }

    public Long getOrderId() {
        return orderId;
    }
}
