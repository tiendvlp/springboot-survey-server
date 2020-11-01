package com.devlogs.apolo.osg.dao.common;

public class FacilitiesSurveySpawn {
    public String id = "faci9120";
    public String title = "Facilities";
    public String description = "Oh no ! Lots of student feed back about the wifi is too slow, but we want to know exactly what happen ! Let’s us know ! ok ?";
    public String topicId = "7672";

    public SurveyQuestion[] questions = {
            // khi tạo một câu hỏi mới chỉ cần copy rồi sửa lại mấy cái nội dung là được
            new SurveyQuestion("1.Bạn có cảm thấy trong trường mát mẻ khi vào mùa nóng không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất nóng","1: Nóng","2:Bình thường","3: Mát"," 4: Rất mát" };
                    return arr;
                }
            }),
            new SurveyQuestion("2.Bạn mất bao nhiêu thời gian để tìm kiếm phòng học", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất Lâu","1: Lâu","2: Bình thường","3: Nhanh"," 4: Rất nhanh" };
                    return arr;
                }
            }),
            new SurveyQuestion("3.Bạn đánh giá chất lượng bàn ghế trong phòng học thế nào", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất tệ","1: Tệ","2:Bình thường","3: Tốt"," 4: Rất tốt" };
                    return arr;
                }
            }),
            new SurveyQuestion("4. Bạn đánh giá các cơ sở vật chất khác (máy lạnh, tivi) trong phòng học thế nào", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất xấu","1: Xấu","2:Bình thường","3: Tốt"," 4: Rất tốt" };
                    return arr;
                }
            }),
            new SurveyQuestion("5.Phòng học có thường xuyên bị cúp điện không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất thường xuyên","1: Thường xuyên","2:Bình thường","3: Hiếm"," 4: Rất hiếm" };
                    return arr;
                }
            }),
            new SurveyQuestion("6.Bạn có cảm thấy sân tập vovinam có thoải mái không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không thoải mái ","1: Bình thường","2:Khá rộng rãi, thoải mái","3: Rộng rãi,thoải mái",};
                    return arr;
                }
            }),
            new SurveyQuestion("7. Bạn thấy nhà vệ sinh trường có sạch sẽ không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất dơ","1: Dơ","2:Bình thường","3: Sạch"," 4: Rất sạch" };
                    return arr;
                }
            }),
            new SurveyQuestion("8.Bạn cảm thấy thời gian chờ ở nhà xe có lâu không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất lâu","1:Lâu","2:Bình thường","3: Nhanh"," 4: Rất nhanh" };
                    return arr;
                }
            }),
            new SurveyQuestion("9. Bạn có hài lòng với cách phục của phòng công tác sinh viên (phòng 202) của trường không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không hài lòng", "1:Bình thường", "2: Hài lòng"};
                    return arr;
                    }
                })

            };
// KHÔNG CẦN SỬA GÌ HẾT
    public interface CreateAnswer {
        String[] createAnswer ();
    }

    // KHÔNG CẦN SỬA GÌ HẾT
    public class SurveyQuestion {
        public String question;
        public String[] answers;

        public SurveyQuestion (String question, CreateAnswer createAnswer) {
            this.question = question;
            this.answers = createAnswer.createAnswer();
        }
    }}

