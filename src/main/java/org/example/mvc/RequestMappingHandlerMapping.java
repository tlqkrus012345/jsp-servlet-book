package org.example.mvc;

import org.example.controller.*;
import org.example.mvc.controller.Controller;
import org.example.mvc.controller.ForwardController;
import org.example.mvc.controller.RequestMethod;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping implements HandlerMapping{
    // key 는 /url 과 같은 urlPath 이며 컨트롤러를 저장하기 위한 용도의 map 이다.
    private Map<HandlerKey, Controller> mappings = new HashMap<>();

    void init() {
        mappings.put(new HandlerKey(RequestMethod.GET, "/"), new HomeController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/users"), new UserListController());
        mappings.put(new HandlerKey(RequestMethod.POST, "/users"), new UserCreateController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/user/form"), new ForwardController("/user/form"));
        mappings.put(new HandlerKey(RequestMethod.POST, "/user/login"), new UserLoginController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/user/logout"), new ForwardController("/user/logout"));
        mappings.put(new HandlerKey(RequestMethod.GET, "/user/logout"), new UserLogoutController());
    }

    public Controller findHandler(HandlerKey handlerKey) {
        return mappings.get(handlerKey);
    }
}
