package com.restaurant.baseProject.controllerbasic;

import com.restaurant.baseProject.servicebasic.BaseService;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

@MappedSuperclass
//        (entity , dto , primaryKey , serviceName)
public abstract class BasicController<E,D,P extends Serializable,S extends BaseService<E,D,P>>{

    protected final String SAVE = "/save";
    protected final String UPDATE = "/update";
    protected final String FIND_BY_ID="/find-by";
    protected final String FIND_ALL = "/find-all";

    public S service;

    @PostMapping(SAVE)
    public ResponseEntity<?> save(@Valid @RequestBody D d){
     return new ResponseEntity<>(service.saveOrUpdate(d), HttpStatus.CREATED);
    }
    @PutMapping(UPDATE)
    public ResponseEntity<?> update(@Valid @RequestBody D d){
        return new ResponseEntity<>(service.saveOrUpdate(d),HttpStatus.OK);
    }
    @GetMapping(FIND_BY_ID)
    public ResponseEntity<?> findById(@RequestParam(name = "id") P id){
        return new ResponseEntity<>(service.findById(id),HttpStatus.OK);
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
    }

}
