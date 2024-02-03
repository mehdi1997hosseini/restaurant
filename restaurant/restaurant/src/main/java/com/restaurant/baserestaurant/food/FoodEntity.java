package com.restaurant.baserestaurant.food;

import com.restaurant.baseEntity.attachmentfile.AttachmentFileEntity;
import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TBL_FOOD")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FoodEntity extends EntityBasic<Long> {

    @Column(name = "FOOD_NAME")
    private String name;
    @Column(name = "FOOD_CODE")
    private String code;
    @Column(name = "FOOD_PRICE")
    private String price;
    @Column(name = "FOOD_FOOD_TYPE")
    @Enumerated
    private FoodType foodType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FOOD_PICTURE")
    private AttachmentFileEntity picture;

}
