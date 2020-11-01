package com.devlogs.apolo.osg.dao.common;


public class SurveyHealthSpawn {
    public String id = "ssg103Health";
    public String description = "The weather these days is very bad, very easy to catch colds and the COVID-19 epidemic is raging, so we decided to do a survey on your health.";
    public String title = "Student Health";
    public String topicId = "7673";

    public SurveyQuestion[] questions = {
            // khi tạo một câu hỏi mới chỉ cần copy rồi sửa lại mấy cái nội dung là được
            new SurveyQuestion("1.Nhìn chung, bạn đánh giá tình hình sức khỏe của mình như thế nào", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất xấu", "1: Xấu", "2:Bình thường", "3: Tốt", " 4: Rất tốt"};
                    return arr;
                }
            }),
            new SurveyQuestion("2.Trong tháng vừa qua, bạn có gặp khó khăn gì trong việc đi lại không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất xấu", "1: Xấu", "2:Bình thường", "3: Tốt", " 4: Rất tốt"};
                    return arr;
                }
            }),
            new SurveyQuestion("3.Trong tháng vừa qua, bạn có hay thường xuyên bị nhức mỏi xương khớp mà không rõ nguyên nhân không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0:Rất Thường xuyên", "1:Thường xuyên ", "2:Lâu lâu", "3: Rất ít", " 4: Không"};
                    return arr;
                }
            }),
            new SurveyQuestion("4.Bạn có thường xuyên bị bệnh, nhất là khi chuyển trời không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0:Rất Thường xuyên", "1:Thường xuyên ", "2:Lâu lâu", "3: Rất ít", " 4: Không"};
                    return arr;
                }
            }),
            new SurveyQuestion("5.Bạn có thường xuyên hút thuốc lá không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0:Rất Thường xuyên", "1:Thường xuyên ", "2:Lâu lâu", "3: Rất ít", " 4: Không"};
                    return arr;
                }
            }),
            new SurveyQuestion("6.Bạn dành bao nhiêu giờ 1 tuần để hoạt động thể thao", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0:Dưới 30 phút", "1:Từ 30 đến 60 phút", " 2:Từ 60 phút đến 90 phút", "3:Từ 90 phút đến 120 phút", "4.Trên 120 phút"};
                    return arr;
                }
            }),
            new SurveyQuestion("7.Bạn có thường xuyên gặp vấn đề liên quan đến tim mạch không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0:Rất Thường xuyên", "1:Thường xuyên ", "2:Lâu lâu", "3: Rất ít", " 4: Không"};
                    return arr;
                }
            }),
            new SurveyQuestion("8.Chỉ số BMI của bạn là bao nhiêu(Lấy cân nặng(kg) chia cho bình phương chiều cao(m))", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0:>40", "1:35.5-39.9", "2:30-34.9", "3:25-29.9", "4:18.5-24.9"};
                    return arr;
                }
            }),
            new SurveyQuestion("9.Bạn có cảm thấy mệt khi phải hoạt động mạnh không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0:Rất mệt", "1:Mệt ", "2:Lâu lâu", "3: Rất ít", " 4: Không"};
                    return arr;
                }
            }),
            new SurveyQuestion("10.Bạn có thường xuyên ăn rau củ không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0:Không", "1:Rất ít ", "2:Lâu lâu", "3: thường xuyên", " 4: Rất thường xuyên"};
                    return arr;
                }
            })

    };

// KHÔNG CẦN SỬA GÌ HẾT
public interface CreateAnswer {
    String[] createAnswer();
}

// KHÔNG CẦN SỬA GÌ HẾT
public class SurveyQuestion {
     public String question;
     public String[] answers;

    public SurveyQuestion(String question, CreateAnswer createAnswer) {
        this.question = question;
        this.answers = createAnswer.createAnswer();
    }

}
}

