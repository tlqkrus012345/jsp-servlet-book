package org.example.servlet;

import org.example.servlet.controller.*;

import java.util.HashMap;
import java.util.Map;

// String 경로 , Controller 해당 경로를 통해 요청하면 실행되는 컨트롤러 저장 및 관리를 위한 클래스
public class RequestMappingHandlerMapping {
    private Map<HandlerKey, Controller> mappings = new HashMap<>();
    void init() {
        mappings.put(new HandlerKey(RequestMethod.GET, "/"), new HomeController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/users"), new UserListController());
        mappings.put(new HandlerKey(RequestMethod.POST, "/users"), new UserCreateController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/user/form"), new ForwardController("/user/form.jsp"));
    }
    public Controller findHandler(HandlerKey handlerKey) {
        return mappings.get(handlerKey);
    }
}
