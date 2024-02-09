package com.example.demo.entity;

import io.micrometer.common.util.StringUtils;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

/**
 * @author meow
 */
@Setter
@Getter
@MappedSuperclass
public abstract class BaseStringIdDO extends BaseDO implements Persistable<String> {

    @Id
    private String id;

    @Override
    public boolean isNew() {
        return StringUtils.isBlank(id);
    }
}
