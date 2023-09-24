package com.mylearning.product.service.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/categories")
@RefreshScope
public class CategoryController {
    @Value("${app.testProp}")
    private String testProp;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getTestProp()
    {
        return testProp;
    }
}
