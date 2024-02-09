package com.example.demo.repository;

import com.example.demo.entity.BaseLongIdDO;
import com.example.demo.entity.EventLogDO;
import com.example.demo.repository.projection.EventProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author meow
 */
@Repository
public interface EventRepo extends JpaRepository<EventLogDO, BaseLongIdDO> {

    @Query("SELECT e FROM EventLogDO e")
    List<EventLogDO> listEventsJPQL();

    @Query(value = " SELECT e.event as event, e.service_code as serviceCode  FROM event_log e ", nativeQuery = true)
    List<EventProjection> listEventsNativeQuery();
}
