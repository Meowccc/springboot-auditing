package com.example.demo.controller;

import com.example.demo.entity.EventLogDO;
import com.example.demo.enums.EventActionEnum;
import com.example.demo.repository.projection.EventProjection;
import com.example.demo.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author meow
 */
@RestController
@RequestMapping
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping("events/{action}")
    public void event(@PathVariable("action") final EventActionEnum action) {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken("meow.lin", null, List.of());
        securityContext.setAuthentication(authentication);
        eventService.createEvent(action);
    }

    @GetMapping("events")
    public List<EventLogDO> listEvents() {
        return eventService.listEvents();
    }

    @GetMapping("jpql-events")
    public List<EventLogDO> listEventsJPQL() {
        return eventService.listEventsJPQL();
    }

    @GetMapping("native-events")
    public List<EventProjection> listEventsNative() {
        return eventService.listEventsNative();
    }
}
