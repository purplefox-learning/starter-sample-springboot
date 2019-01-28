package com.ycm.controller;

import com.ycm.data.SampleBusinessObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SampleRestController {

    //visit the following urls to test
    //- http://localhost:8080/hello
    //- http://localhost:8080/news

    //if the return type is a String, RestController returns a simple string
    //if the return type is a Object, RestController returns a rest response
    //{
    // "summary":"THis is breaking news",
    // "timestamp":"2019-01-28T13:41:34.609+0000",
    // "names":["China","Singapore","United States"]
    //}
    //if the return type is a List, RestController returns a rest response
    //which is a list
    //[{"summary":"...","timestamp":"...","names":[...]},
    // {"summary":"...","timestamp":"...","names":[...]}]


    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @RequestMapping("/news")
    public SampleBusinessObject getNews() {
        return SampleBusinessObject.createSampleBOInstance();
    }

    @RequestMapping("/newslist")
    public List<SampleBusinessObject> getNewsList() {
        return SampleBusinessObject.createSampleBOList();
    }

}
