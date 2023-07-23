package org.example.servlet;

public interface HandlerMapping {
    Object findHandler(HandlerKey handlerKey);
}
