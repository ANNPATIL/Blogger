package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Blog extends PanacheEntity {

    @Column
    public String author = "vivek";

    @Column
    public String name = "HR";

}


