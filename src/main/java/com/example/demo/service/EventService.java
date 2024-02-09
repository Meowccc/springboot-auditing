package com.example.demo.service;

import com.example.demo.entity.EventLogDO;
import com.example.demo.enums.EventActionEnum;
import com.example.demo.enums.ServiceCodeEnum;
import com.example.demo.repository.EventRepo;
import com.example.demo.repository.projection.EventProjection;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author meow
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepo eventRepo;

    @Transactional()
    public void createEvent(final EventActionEnum event) {
        eventRepo.save(EventLogDO.builder()
                .serviceCode(ServiceCodeEnum.V1)
                .event(event)
                .build());
    }

    @Transactional(readOnly = true)
    public List<EventLogDO> listEvents() {
        return eventRepo.findAll();
    }

    @Transactional(readOnly = true)
    public List<EventLogDO> listEventsJPQL() {
        return eventRepo.listEventsJPQL();
    }

    @Transactional(readOnly = true)
    public List<EventProjection> listEventsNative() {
        return eventRepo.listEventsNativeQuery();
    }
}
