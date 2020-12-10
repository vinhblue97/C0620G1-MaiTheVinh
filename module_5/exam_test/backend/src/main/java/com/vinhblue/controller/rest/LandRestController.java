package com.vinhblue.controller.rest;

import com.vinhblue.model.entity.Landing;
import com.vinhblue.model.service.LandingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LandRestController {

    @Autowired
    private LandingService landingService;

    @GetMapping("/list")
    private ResponseEntity<Page<Landing>> findAll(@PageableDefault(size = 2) Pageable pageable){
        return new ResponseEntity<>(this.landingService.findAll(pageable), HttpStatus.OK);
    }

    @PostMapping("/create")
    private ResponseEntity<Void> create(@RequestBody Landing landing){
        this.landingService.save(landing);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
