package com.vinhblue.controller;

import com.vinhblue.model.entity.ModelManager;
import com.vinhblue.model.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/modelRest")
public class ModelRestController {

    @Autowired
    private ModelService modelService;

    @GetMapping("/list")
    public ResponseEntity<List<ModelManager>> getListModel(UriComponentsBuilder ucBuilder){
        HttpHeaders headers = new HttpHeaders();
        headers.set("message","Vinh Blue");
        new ResponseEntity<>("create successfully", HttpStatus.OK);
        return new ResponseEntity<>(this.modelService.findAll(),headers, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    private ResponseEntity<ModelManager> getModelDetail(@PathVariable Integer id){
        return new ResponseEntity<>(this.modelService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createModel(@RequestBody ModelManager model, UriComponentsBuilder ucBuilder){
        this.modelService.save(model);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/modelRest/detail/{id}").buildAndExpand(model.getModelId()).toUri());
        headers.set("message", "Vinh Blue");
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
}
