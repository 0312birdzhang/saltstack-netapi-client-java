package com.suse.saltstack.netapi.listener;

/**
 * Defines a client notification interface for different implementations of
 * SSE stream events.
 */
public interface EventListener {

    /**
     * Notify the listener of a new event stream event.  Returned data is a {@link String}
     * in JSON format.
     * @param data Return a JSON representation of the latest stream event.
     */
    void notify(String data);

    /**
     * Notify the listener that the backing event stream was closed.  Listener may
     * need to recreate the event stream or take other actions.
     */
    void eventStreamClosed();
}
