package com.lumatik.core;

import javax.persistence.*;

/**
 * Created by mgull on 6/17/2017.
 */
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    @Version
    private Long version;

    protected BaseEntity() {
        id = null;
    }
}
