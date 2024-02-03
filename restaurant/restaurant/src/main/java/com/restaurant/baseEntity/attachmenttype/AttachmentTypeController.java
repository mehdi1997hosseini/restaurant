package com.restaurant.baseEntity.attachmenttype;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attachment-type")
public class AttachmentTypeController extends ControllerBasic<AttachmentTypeEntity,Long,AttachmentTypeService> {

    @Autowired
    public AttachmentTypeController(AttachmentTypeService service) {
        super(service);
    }

}
