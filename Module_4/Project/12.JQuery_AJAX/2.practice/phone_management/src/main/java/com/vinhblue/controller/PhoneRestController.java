package com.vinhblue.controller;

import com.vinhblue.model.entity.Phone;
import com.vinhblue.model.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/phoneRest")
@CrossOrigin
public class PhoneRestController {

    @Autowired
    private PhoneService phoneService;

    @GetMapping("list")
    private ResponseEntity<List<Phone>> list(){
        return new ResponseEntity<>(this.phoneService.findAll(),HttpStatus.OK);
    }

    @PostMapping("/create")
    private ResponseEntity<Void> createNewPhone(@RequestBody Phone phone) {
        this.phoneService.save(phone);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping("/update")
    private ResponseEntity<Void> updatePhone(@RequestBody Phone phone) {
        this.phoneService.save(phone);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("delete")
    private ResponseEntity<Void> deletePhone(@PathVariable Integer id) {
        this.phoneService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
