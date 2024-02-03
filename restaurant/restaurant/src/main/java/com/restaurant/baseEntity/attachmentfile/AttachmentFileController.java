package com.restaurant.baseEntity.attachmentfile;

import com.restaurant.baseProject.controllerbasic.ControllerBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attachment-file")
public class AttachmentFileController extends ControllerBasic<AttachmentFileEntity,Long,AttachmentFileService> {

    @Autowired
    public AttachmentFileController(AttachmentFileService service) {
        super(service);
    }

}
