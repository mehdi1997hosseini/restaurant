package com.restaurant.baseEntity.color;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ColorServiceImpl extends ServiceBasicImpl<ColorEntity,Long,ColorRepository> implements ColorService {

    public ColorServiceImpl(ColorRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(ColorEntity entity) {
        List<Integer> lastColorCode = this.repository.findLastColorCode();
        if (lastColorCode==null||lastColorCode.isEmpty())
            entity.setColorCode(1);
        else
            entity.setColorCode(lastColorCode.get(0)+1);
    }

}
