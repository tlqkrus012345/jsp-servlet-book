package org.example.mvc;

import org.example.mvc.controller.RequestMethod;

import java.util.Objects;


public class HandlerKey {
    private final RequestMethod requestMethod;
    private final String uriPath;
    public HandlerKey(RequestMethod requestMethod, String uriPath) {
        this.requestMethod = requestMethod;
        this.uriPath = uriPath;
    }
    // 핸들러를 get 할 때 객체와 객체의 비교이기 때문에 해당 메서드 구현이 필요하다
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HandlerKey that = (HandlerKey) o;
        return requestMethod == that.requestMethod && Objects.equals(uriPath, that.uriPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestMethod, uriPath);
    }
}
