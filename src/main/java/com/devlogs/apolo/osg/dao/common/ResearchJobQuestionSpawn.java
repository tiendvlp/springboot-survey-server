package com.devlogs.apolo.osg.dao.common;

public class ResearchJobQuestionSpawn {
    public String id = "faci9120";
    public String title = "Research Job";
    public String description = "Bạn có nhiều sở thích liên quan đến nhóm NGHIÊN CỨU? " +
            "Vậy hãy trả lời những câu hỏi sau để tìm ra được ngành nghề phù hợp với bản thân nhé!";
    public String topicId = "7672";

    public SurveyQuestion[] questions = {
            // khi tạo một câu hỏi mới chỉ cần copy rồi sửa lại mấy cái nội dung là được
            new SurveyQuestion("1. Bạn thích đọc sách thể loại nào?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Khoa học thường thức","1: Trinh thám","2: Tình cảm lãng mạng","3: Lịch sử - văn hoá"," 4: Khác" };
                    return arr;
                }
            }),
            new SurveyQuestion("2. Phương pháp học tập nào bạn cảm thấy hiệu quả và phù hợp cho chính bản thân mình?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Đọc sách, nghiên cứu tài liệu","1: Thực hành - thực tiễn","2: Kết hợp cả hai","3: Thông qua bạn bè, người khác"," 4: Phương pháp khác" };
                    return arr;
                }
            }),
            new SurveyQuestion("3. Nếu được chọn công việc để làm, bạn sẽ chọn một công việc như thế nào?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Phức tạp","1: Có độ khó cao","2: Bình thường","3: Khó nhưng thú vị"," 4: Dễ hoàn thành" };
                    return arr;
                }
            }),
            new SurveyQuestion("4. Bạn có đầu óc sắp xếp, tổ chức không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, rất tốt","1: Bình thường","2: Tôi thích sự linh hoạt","3: Tôi thuận theo tự nhiên"," 4: Không, tôi không giỏi" };
                    return arr;
                }
            }),
            new SurveyQuestion("5. Bạn có thể diễn đạt cho người khác hiểu không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất giỏi, tôi luôn làm người khác dễ hiểu","1: Khá","2: Bình thường","3: Trung bình"," 4: Kém" };
                    return arr;
                }
            }),
            new SurveyQuestion("6. Bạn có sưu tập một thứ gì đó không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, tôi có sưu tập","1: Có thích nhưng thỉnh thoảng","2: Không"};
                    return arr;
                }
            }),
            new SurveyQuestion("7. Bạn khả năng tổng hợp, khái quát, suy đoán những vấn đề không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, rất giỏi","1: Cảm thấy mình làm khá tốt","2:Bình thường","3: Sạch"," 4: Rất sạch" };
                    return arr;
                }
            }),
            new SurveyQuestion("8. Bạn có mong muốn mình có thể đóng góp để xã hội tốt đẹp hơn?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Có, tất nhiên","1: Bình thường","2: Tôi chỉ làm vì trách nhiệm","3: Không"};
                    return arr;
                }
            }),
            new SurveyQuestion("9. Bạn có tìm hiểu khám phá nhiều vấn đề mới?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không", "1: Bình thường", "2: Có, tôi rất thích"};
                    return arr;
                    }
                }),
            new SurveyQuestion("10. Bạn có thích các hoạt động liên quan đến điều tra, truy tìm manh mối không?", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không", "1: Bình thường", "2: Có, tôi rất thích"};
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

