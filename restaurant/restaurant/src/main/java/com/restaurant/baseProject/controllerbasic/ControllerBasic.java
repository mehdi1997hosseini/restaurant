package com.restaurant.baseProject.controllerbasic;

import com.restaurant.baseProject.entitybasic.EntityBasic;
import com.restaurant.baseProject.servicebasic.ServiceBasic;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

@MappedSuperclass
public abstract class ControllerBasic<E extends EntityBasic<P>,P extends Serializable,S extends ServiceBasic<E,P>> {

    protected final String SAVE = "/save";
    protected final String UPDATE = "/update";
    protected final String FIND_BY_ID="/find-by";
    protected final String FIND_ALL = "/find-all";

    protected final S service;

    public ControllerBasic(S service) {
        this.service = service;
    }

    @PostMapping(SAVE)
    public ResponseEntity<?> save(@Valid @RequestBody E entity){
        return new ResponseEntity<>(service.saveOrUpdate(entity), HttpStatus.CREATED);
    }
    @PutMapping(UPDATE)
    public ResponseEntity<?> update(@Valid @RequestBody E entity){
        return new ResponseEntity<>(service.saveOrUpdate(entity),HttpStatus.OK);
    }
    @GetMapping(FIND_BY_ID)
    public ResponseEntity<?> findById(@RequestParam(name = "id") P id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
    }

}
