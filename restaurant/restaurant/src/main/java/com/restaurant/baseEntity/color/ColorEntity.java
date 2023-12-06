package com.restaurant.baseEntity.color;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "TBL_COLOR")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ColorEntity extends EntityBasic<Long> {
    @Column(name = "COLOR_NAME")
    private String colorName;
    @Column(name = "COLOR_CODE")
    private Integer colorCode;

}
