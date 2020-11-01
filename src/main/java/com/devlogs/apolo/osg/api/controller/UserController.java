package com.devlogs.apolo.osg.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/api/v1/user/")
@RestController
public class UserController {

    @GetMapping("getuser")
    public ResponseEntity<GetUserRespondEntity> getUserInfo (HttpServletRequest request) {
        String email = (String) request.getAttribute("userEmail");
        String name = (String) request.getAttribute("userName");
        String campus = (String) request.getAttribute("campus");
        int admission = (int) request.getAttribute("admission");
        String pictureUrl = (String) request.getAttribute("pictureUrl");
        String studentId = (String) request.getAttribute("studentId");

        System.out.println("hello");

        return new ResponseEntity(new GetUserRespondEntity(name, studentId, email, campus, admission, pictureUrl), HttpStatus.OK);
    }


    public static class GetUserRespondEntity {
         public String name;
         public String studentId;
         public String email;
         public String campus;
         public int admission;
         public String pictureUrl;

        public GetUserRespondEntity(String name, String studentId, String email, String campus, int admission, String pictureUrl) {
            this.name = name;
            this.studentId = studentId;
            this.email = email;
            this.campus = campus;
            this.admission = admission;
            this.pictureUrl = pictureUrl;
        }
    }
}
