package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.Column;

@Entity
public class Blog extends PanacheEntity {
    @Column
    public String title = "Rashmi";
    @Column
    public String name = "Automation";
    @Column
    public  String Content = "The blog is related to";

}