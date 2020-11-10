package com.devlogs.apolo.osg.api.controller;


import com.devlogs.apolo.osg.domain.entity.QuickQuestionEntity;
import com.devlogs.apolo.osg.services.AddNewQuickQuestionService;
import com.devlogs.apolo.osg.services.GetAllQuickQuestionService;
import com.devlogs.apolo.osg.services.PushQuickQuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("api/v1/quickquestion")
@Controller
public class QuickQuestionController {
    private PushQuickQuestionAnswerService mPushQuickQuestionAnswer;
    private AddNewQuickQuestionService mAddNewQuickQuestionService;
    private GetAllQuickQuestionService mGetAllQuickQuestionService;

    @Autowired
    public QuickQuestionController(PushQuickQuestionAnswerService mPushQuickQuestionAnswer, AddNewQuickQuestionService mAddNewQuickQuestionService, GetAllQuickQuestionService mGetAllQuickQuestionService) {
        this.mPushQuickQuestionAnswer = mPushQuickQuestionAnswer;
        this.mAddNewQuickQuestionService = mAddNewQuickQuestionService;
        this.mGetAllQuickQuestionService = mGetAllQuickQuestionService;
    }

    @GetMapping("/getall")
    public ResponseEntity<List<QuickQuestionEntity>> getAllQuickQuestion () {
        return new ResponseEntity(mGetAllQuickQuestionService.execute(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity addNewQuickQuestion (@RequestBody AddNewQuickQuestionReqBody body) {
        int result = mAddNewQuickQuestionService.execute(body.question, body.answer);

        if (result == 1) {
            return new ResponseEntity(new Object () {public String message = "Success";}, HttpStatus.OK);
        }
        return new ResponseEntity(new Object () {public String message = "Failed"; }, HttpStatus.NOT_ACCEPTABLE);
    }

    public static class AddNewQuickQuestionReqBody {
        String question;
        List<String> answer;

        public AddNewQuickQuestionReqBody(String question, List<String> answer) {
            this.question = question;
            this.answer = answer;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public List<String> getAnswer() {
            return answer;
        }

        public void setAnswer(List<String> answer) {
            this.answer = answer;
        }
    }

    @PostMapping("/addNewResult")
    public ResponseEntity addNewResult (@RequestBody AddNewQuickQuestionResult body) {
       int result = mPushQuickQuestionAnswer.execute(body.questionId, body.answer, body.email);

        if (result == 1) {
            return new ResponseEntity(new Object () {public String message = "Success";}, HttpStatus.OK);
        }
        return new ResponseEntity(new Object () {public String message = "Failed"; }, HttpStatus.NOT_ACCEPTABLE);
    }


    public static class AddNewQuickQuestionResult {
        public String questionId;
        public int answer;
        public String email;

        public AddNewQuickQuestionResult(String questionId, int answer, String email) {
            this.questionId = questionId;
            this.answer = answer;
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getQuestionId() {
            return questionId;
        }

        public void setQuestionId(String questionId) {
            this.questionId = questionId;
        }

        public int getAnswer() {
            return answer;
        }

        public void setAnswer(int answer) {
            this.answer = answer;
        }
    }


}
