package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("example")
@Api(value = "customer-service", description = "Main service")
public class Controller {

    @Autowired
    private Service service;

    @PostMapping("create")
    @ApiOperation(value = "Create entity")
    public ResponseEntity createEntity(@RequestBody Entity entity) {
        return new ResponseEntity(service.create(entity.getField1(), entity.getField2()), HttpStatus.OK);
    }

    @GetMapping("get")
    @ApiOperation(value = "Get account")
    public ResponseEntity readEntity(@RequestHeader String field1) {
        return new ResponseEntity(service.read(field1), HttpStatus.OK);
    }

    @PutMapping("update/{field1}")
    @ApiOperation(value = "Update account")
    public ResponseEntity updateEntity(@PathVariable String field1) {
        return new ResponseEntity(service.update(field1), HttpStatus.OK);
    }

    @DeleteMapping("delete/{field1}")
    @ApiOperation(value = "Delete account")
    public ResponseEntity deleteEntity(@PathVariable String field1) {
        return new ResponseEntity(service.delete(field1), HttpStatus.OK);
    }


}
