package com.restaurant.baseEntity.attachmenttype;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "TBL_ATTACHMENT_TYPE")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AttachmentTypeEntity extends EntityBasic<Long> {

    @Column(name = "ATTACHMENT_TYPE_PERSIAN_NAME")
    private String persianName;
    @Column(name = "ATTACHMENT_TYPE_ENGLISH_NAME")
    private String englishName;
    @Column(name = "ATTACHMENT_TYPE_CODE")
    private Integer code;
    @Column(name = "ATTACHMENT_TYPE_IS_ACTIVE")
    private Boolean isActive;

}
