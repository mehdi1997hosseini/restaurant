package com.restaurant.baseEntity.attachmenttype;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttachmentTypeServiceImpl extends ServiceBasicImpl<AttachmentTypeEntity,Long,AttachmentTypeRepository> implements AttachmentTypeService {

    @Autowired
    public AttachmentTypeServiceImpl(AttachmentTypeRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(AttachmentTypeEntity entity) {

    }

}
