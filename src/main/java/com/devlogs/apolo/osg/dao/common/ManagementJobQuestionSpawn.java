package com.devlogs.apolo.osg.dao.common;


public class ManagementJobQuestionSpawn {
    public String id = "ssg103Health";
    public String description = "Bạn có nhiều sở thích liên quan đến nhóm QUẢN LÝ? " +
            "Vậy hãy trả lời những câu hỏi sau để tìm ra được ngành nghề phù hợp với bản thân nhé!";
    public String title = "Student Health";
    public String topicId = "7673";

    public SurveyQuestion[] questions = {
            // khi tạo một câu hỏi mới chỉ cần copy rồi sửa lại mấy cái nội dung là được
            new SurveyQuestion("1. Thông thường khi làm việc nhóm, bạn sẽ đóng vai trò như thế nào?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Trưởng nhóm", "1: Người đưa ra ý kiến", "2: Người nhận xét, đánh giá", "3: Người lắng nghe và thực hiện"};
                    return arr;
                }
            }),
            new SurveyQuestion("2. Bạn có thường xuyên đặt ra các mục tiêu, kế hoạch trong cuộc sống không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, thường xuyên", "1: Thỉnh thoảng", "2: Hiếm khi", "3: Không bao giờ", " 4: Rất tốt"};
                    return arr;
                }
            }),
            new SurveyQuestion("3. Bạn có cầu toàn và muốn làm công việc cho đến khi hoàn tất, không thích bỏ dở giữa chừng không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, tôi không thể chịu được khi việc đang dang dở", "1: Bình thường, tôi không cảm thấy khó chịu lắm", "2: Sao cũng được", "3: Không"};
                    return arr;
                }
            }),
            new SurveyQuestion("4. Việc quản lý và sửa dụng tiền bạc của bạn như thế nào?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Thích tiết kiệm và quản lý tốt", "1: Tôi thường xuyên chi tiêu không có kế hoạch", "2: Tôi lên kế hoạch nhưng hiếm khi hoàn thành", "3: Tôi không thích lập kế hoạch", " 4: Không, tôi không có kế hoạch"};
                    return arr;
                }
            }),
            new SurveyQuestion("5. Bạn có phải là người rất quyết đoán, khó thay đổi được suy nghĩ?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Đúng vậy", "1: Tôi có thể lắng nghe và thay đổi nếu phù hợp", "2: Tôi rất dễ bị dao động, thay đổi", "3: Tùy vào trường hợp, hoàn cảnh", " 4: Không"};
                    return arr;
                }
            }),
            new SurveyQuestion("6. Bạn có suy nghĩ sau này sẽ trở thành chủ một doanh nghiệp không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, tôi muốn làm chủ", "1: Không, tôi chỉ muốn làm nhân viên", " 2: Tùy thuộc vào việc đó có mang nhiều lợi ích cho tôi không", "3: Tôi chỉ làm nếu đủ khả năng"};
                    return arr;
                }
            }),
            new SurveyQuestion("7. Bạn có phải là người thích việc lên kế hoạch, tổ chức, quản lý hay tổng hợp công việc của những thành viên khác trong nhóm?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, tôi cảm thấy hào hứng", "1: Bình thường ", "2: Tôi sẽ làm nếu đó là trách nhiệm", "3: Không thích"};
                    return arr;
                }
            }),
            new SurveyQuestion("8. Bạn có thích được trở thành người lãnh đạo trong nhóm, trong lớp hoặc trong các tổ chức không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, rất thích", "1: Bình thường", "2: Nếu được phân công thì tôi sẽ làm", "3: Không, tôi không thích"};
                    return arr;
                }
            }),
            new SurveyQuestion("9. Bạn có nhiều bạn bè không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, tôi có rất nhiều bạn bè", "1: Tôi chỉ có một vài người bạn thân", "2: Tôi có bạn nhưng chỉ dừng lại ở mức xã giao", "3: Tôi không có bạn"};
                    return arr;
                }
            }),
            new SurveyQuestion("10. Thông thường, khi gặp mặt người lạ, bạn sẽ đối xử với họ như thế nào?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Cư xử lịch thiệp và tử tế", "1: Lịch sự, xả giao", "2: Thân thiện, nhiệt tình", "3: Xa cách", "4: Tùy vào ấn tượng của họ với mình"};
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

