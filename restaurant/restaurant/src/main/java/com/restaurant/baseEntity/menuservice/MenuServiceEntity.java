package com.restaurant.baseEntity.menuservice;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TBL_MENU")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class MenuServiceEntity extends EntityBasic<Long> {

    @Column(name = "MENU_TITLE")
    private String title;
    @Column(name = "IS_ACTIVE")
    private Boolean isActive;


    @ManyToOne
    @JoinColumn
    private MenuServiceEntity menu;

}
