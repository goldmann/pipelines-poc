package com.redhat.cpaas.controller;

public class EventControllerImpl implements EventController {
    @Override
    public void sendEvent(String event) {
        System.out.println("Event sent: " + event);
    }
}
