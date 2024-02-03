package com.restaurant.baseEntity.attachmentfile;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttachmentFileServiceImpl extends ServiceBasicImpl<AttachmentFileEntity,Long,AttachmentFileRepository> implements AttachmentFileService {

    @Autowired
    public AttachmentFileServiceImpl(AttachmentFileRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(AttachmentFileEntity entity) {

    }
}
