package pt.personal.Library.controller;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@RestController("/lib")
public class Test {

    @GetMapping("/test")
    public void test(){
    }
}
