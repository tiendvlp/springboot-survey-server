package com.devlogs.apolo.osg.api.controller;

import com.devlogs.apolo.osg.domain.entity.StatusEntity;
import com.devlogs.apolo.osg.services.GetAllStatusService;
import com.devlogs.apolo.osg.services.PushNewStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("api/v1/status")
@RestController
public class StatusController {
    private GetAllStatusService mGetAllStatusService;
    private PushNewStatusService mPushNewStatusService;

    @Autowired
    public StatusController (GetAllStatusService getAllStatusService, PushNewStatusService pushNewStatusService) {
        mGetAllStatusService = getAllStatusService;
        mPushNewStatusService = pushNewStatusService;
    }

    @GetMapping("/getAllStatus")
    public ResponseEntity<List<StatusEntity>> getAllStatus (HttpServletRequest request, HttpServletResponse response) {
        return new ResponseEntity(mGetAllStatusService.execute(), HttpStatus.OK);
    }

    @PostMapping("/pushNewStatus")
    public ResponseEntity<Object> pushNewStatus (@RequestBody PushNewStatusReqBody body) {
        int result = mPushNewStatusService.execute(body.type, body.content);

        if (result  == 1) {
            return new ResponseEntity(new Object() {
               public String message = "Writing success";
            }, HttpStatus.OK);
        } else {
            return new ResponseEntity(new Object() {
                public String message = "Writing failed";
            }, HttpStatus.NOT_ACCEPTABLE);
        }
    }

    private static class PushNewStatusReqBody {
        public String type;
        public String content;

        public PushNewStatusReqBody(String type, String content) throws Exception {
            this.type = type;
            this.content = content;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
