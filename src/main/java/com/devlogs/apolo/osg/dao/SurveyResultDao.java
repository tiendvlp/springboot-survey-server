package com.devlogs.apolo.osg.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurveyResultDao {

    int insertNewResult (SurveyResult surveyResult);

    class SurveyResult {
        private String ownerEmail;
        private String ownerName;
        private String ownerPictureUrl;
        private String campus;
        private int admission;
        private String surveyId;
        private List<Integer> answer;

        public SurveyResult(String ownerEmail, String ownerName, String ownerPictureUrl, String campus, int admission, String surveyId, List<Integer> answer) {
            this.ownerEmail = ownerEmail;
            this.ownerName = ownerName;
            this.ownerPictureUrl = ownerPictureUrl;
            this.campus = campus;
            this.admission = admission;
            this.surveyId = surveyId;
            this.answer = answer;
        }

        public String getOwnerPictureUrl() {
            return ownerPictureUrl;
        }

        public String getCampus() {
            return campus;
        }

        public int getAdmission() {
            return admission;
        }

        public String getOwnerEmail() {
            return ownerEmail;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public String getSurveyId() {
            return surveyId;
        }

        public List<Integer> getAnswer() {
            return answer;
        }

    }

    long removeSurveyResult (String ownerEmail, String surveyId);

}
