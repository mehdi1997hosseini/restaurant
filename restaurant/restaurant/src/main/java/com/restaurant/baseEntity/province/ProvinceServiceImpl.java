package com.restaurant.baseEntity.province;

import com.restaurant.baseProject.servicebasic.ServiceBasicImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl extends ServiceBasicImpl<ProvinceEntity,Long,ProvinceRepository> implements ProvinceService {

    public ProvinceServiceImpl(ProvinceRepository repository) {
        super(repository);
    }

    @Override
    public void beforeSaveOrUpdate(ProvinceEntity entity) {
        List<Integer> lastProvinceCode = this.repository.findLastProvinceCode();
        if (lastProvinceCode==null||lastProvinceCode.isEmpty())
            entity.setProvinceCode(1);
        else
            entity.setProvinceCode(lastProvinceCode.get(0)+1);
    }
}
