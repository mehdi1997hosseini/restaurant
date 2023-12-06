package com.restaurant.baseProject.entitybasic;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@MappedSuperclass
public abstract class EntityBasic<P extends Serializable> extends AuditedBaseEntity implements Serializable  {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected P id;

    public P getId() {
        return this.id;
    }
}
