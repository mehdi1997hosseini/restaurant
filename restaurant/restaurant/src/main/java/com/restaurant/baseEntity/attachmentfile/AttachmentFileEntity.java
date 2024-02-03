package com.restaurant.baseEntity.attachmentfile;

import com.restaurant.baseEntity.attachmenttype.AttachmentTypeEntity;
import com.restaurant.baseProject.entitybasic.EntityBasic;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "TBL_ATTACHMENT_FILE")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AttachmentFileEntity extends EntityBasic<Long> {

    @Column(name = "ATTACHMENT_FILE_FORMAT_FILE")
    private String formatFile;
    @Column(name = "ATTACHMENT_FILE_NAME_FILE")
    private String nameFile;
    @Column(name = "ATTACHMENT_FILE_FILE")
    @Lob
    private String file;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATTACHMENT_FILE_ATTACHMENT_TYPE_FK")
    private AttachmentTypeEntity attachmentType;


}
