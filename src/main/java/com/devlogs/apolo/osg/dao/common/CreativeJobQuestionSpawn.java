package com.devlogs.apolo.osg.dao.common;


public class CreativeJobQuestionSpawn {
    public String id = "ssg103Health";
    public String description = "Bạn có nhiều sở thích liên quan đến nhóm NGHỆ THUẬT? " +
            "Vậy hãy trả lời những câu hỏi sau để tìm ra được ngành nghề phù hợp với bản thân nhé!";
    public String title = "Creative Question";
    public String topicId = "76573";

    public SurveyQuestion[] questions = {
            // khi tạo một câu hỏi mới chỉ cần copy rồi sửa lại mấy cái nội dung là được
            new SurveyQuestion("1. Bạn có thích làm những công việc mới, những công việc đòi hỏi sự sáng tạo không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, rất thích", "1: Thích", "2: Bình thường", "3: Không thích"};
                    return arr;
                }
            }),
            new SurveyQuestion("2. Bạn có thoải mái bộc lộ những ý thích cá nhân của mình cho mọi người xung quanh không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có", "1: Khá thoải mái", "2: Bình thường", "3: Không thích"};
                    return arr;
                }
            }),
            new SurveyQuestion("3. Bạn hãy đánh giá độ nhanh nhạy và khéo léo của bạn khi đưa ra quyết định trong những tình huống cấp bách?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất Thấp", "1: Thấp ", "2: Trung bình", "3: Cao", " 4: Rất cao"};
                    return arr;
                }
            }),
            new SurveyQuestion("4. Bạn đánh giá khả năng sáng tạo ra những đồ vật mới từ ý tưởng của chính mình (Có thể là đồ dùng hàng ngày như quần áo, giày dép,... cho tới đồ vật lưu niệm) như thế nào?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất Thấp", "1: Thấp ", "2: Trung bình", "3: Cao", " 4: Rất cao"};
                    return arr;
                }
            }),
            new SurveyQuestion("5. Bạn có dễ bị hấp dẫn bởi cái đẹp (Một gương mặt đẹp, một bức tranh đẹp, một bài hát hay,...) không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, luôn luôn", "1: Thỉnh thoảng ", "2: Bình thường", "3: Hiếm khi", " 4: Không"};
                    return arr;
                }
            }),
            new SurveyQuestion("6. Bạn có phải người đa sầu đa cảm, dễ xúc động và không giỏi kiềm chế cảm xúc không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Đúng vậy, chính tôi", "1: Hơi đa sầu đa cảm", " 2: Bình thường", "3: Không, tôi rất lý trí"};
                    return arr;
                }
            }),
            new SurveyQuestion("7. Bạn có phải là người có tâm hồn mơ mộng, bay bổng?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Đúng vậy, chính mình", "1: Thỉnh thoảng có mơ mộng ", "2: Bình thường", "3: Hiếm khi mơ mộng", " 4: Không"};
                    return arr;
                }
            }),
            new SurveyQuestion("8. Bạn có năng khiếu về chụp hình hoặc vẽ tranh, trang trí, điêu khắc không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"Có, tôi rất giỏi", "1: Khá giỏi", "2: Bình thường", "3: Tôi biết nhưng không giỏi", "4: Không, tôi không biết"};
                    return arr;
                }
            }),
            new SurveyQuestion("9. Khả năng thuyết trình, diễn xuất của bạn như thế nào?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Xuất sắc", "1: Giỏi ", "2: Khá", "3: Trung bình", " 4: Kém"};
                    return arr;
                }
            }),
            new SurveyQuestion("10. Bạn nghĩ như thế nào về các loại hình nghệ thuật như âm nhạc, thơ, văn học,...?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, tôi rất thích và không thể sống thiếu chúng", "1: Đó là sở thích của tôi", "2: Bình thường", "3: Tôi chỉ thỉnh thoảng nghe, không quan tâm nhiều", " 4: Tôi không thích"};
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

