package com.devlogs.apolo.osg.dao.common;

public class TechJobQuestionSpawn {
    public String id = "711912001";
    public String title = "Tech Job";
    public String description = "Bạn có nhiều sở thích liên quan đến nhóm KỸ THUẬT? " +
            "Vậy hãy trả lời những câu hỏi sau để tìm ra được ngành nghề phù hợp với bản thân nhé!";
    public String topicId = "7121";
    public SurveyQuestion[] questions = {
            // khi tạo một câu hỏi mới chỉ cần copy rồi sửa lại mấy cái nội dung là được
            new SurveyQuestion("1.  Bạn là người độc lập và thích làm việc một mình?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Đúng vậy","1: Không phải" };
                    return arr;
                }
            }),
            new SurveyQuestion("2. Bạn thích những công việc sử dụng tay chân hơn là trí óc?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Đúng vậy","1: Không phải" };
                    return arr;
                }
            }),
            new SurveyQuestion("3. Bạn có hay tò mò về bất cứ thứ gì xung quanh mình (Thiên nhiên, khoa học kỹ thuật, không gian;...) không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Thường xuyên","1: Thỉnh thoảng","2: Hiếm khi" };
                    return arr;
                }
            }),
            new SurveyQuestion("4. Bạn hãy đánh giá khả năng dùng lời nói để truyền đạt đến mọi người (Thuyết trình, hướng dẫn, giải thích,...)?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Giỏi ","1: Khá","2: Trung bình","3: Yếu"};
                    return arr;
                }
            }),
            new SurveyQuestion("5. Khả năng phân tích vấn đề của bạn như thế nào?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Giỏi ","1: Khá","2: Trung bình","3: Yếu" };
                    return arr;
                }
            }),
            new SurveyQuestion("6. Bạn có thích suy nghĩ về những vấn đề phức tạp, làm công việc phức tạp không? ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có","1: Không","2: Không rõ"};
                    return arr;
                }
            }),
            new SurveyQuestion("7. Bạn có thích các trò chơi ô chữ, giải đố;... không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có","1: Không","2: Không có sở thích cụ thể" };
                    return arr;
                }
            }),
            new SurveyQuestion("8. Bạn hãy đánh giá khả năng tranh luận của mình (Diễn giải lưu loát, rõ nghĩa, logic, thuyết phục được người khác)?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Giỏi ","1: Khá","2: Trung bình","3: Yếu" };
                    return arr;
                }
            }),
            new SurveyQuestion("9. Khi giải một bài toán, bạn có thường phân tích sâu và tìm nhiều lời giải khác nhau cho nó?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không thường xuyên","1: Lâu lâu","2:Thường xuyên" };
                    return arr;
                }
            }),
            new SurveyQuestion("10. Bạn cảm thấy khả năng dự đoán kết quả của bạn,dựa trên những dữ kiện hoặc căn cứ có sẵn như thế nào??", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Giỏi ","1: Khá","2: Trung bình","3: Yếu" };
                    return arr;
                }
            }),

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
}

}
