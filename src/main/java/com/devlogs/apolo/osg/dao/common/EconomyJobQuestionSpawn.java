package com.devlogs.apolo.osg.dao.common;
/* YÊU CẦU
* CÁC CÂU TRẢ LỜI CẦN PHẢI ĐƯỢC SẮP XẾP THEO THỨ TỰ (NẾU CẦN THIẾT)
* VD NHƯ MBTI THÌ CÁC CÂU TRẢ LỜI MANG TÍNH CHẤT TĂNG HOẶC GIẢM DẦN
* */
public class EconomyJobQuestionSpawn {
    public String id = "923DASS21";
    public String name = "Sociology Job";
    public String description= "Bạn có nhiều sở thích liên quan đến nhóm KINH TẾ? " +
            "Vậy hãy trả lời những câu hỏi sau để tìm ra được ngành nghề phù hợp với bản thân nhé!";
    public String topicId = "8291";

    public SurveyQuestion[] questions = {
                // khi tạo một câu hỏi mới chỉ cần copy rồi sửa lại mấy cái nội dung là được
                new SurveyQuestion("1. Bạn có phải là người người khá thân thiện và thoải mái trong việc giúp đỡ mọi người xung quanh?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có", "1: Bình thường", "2: Tôi chỉ giúp vì trách nhiệm", "3: Không"};
                        return arr;
                    }
                }),

                new SurveyQuestion("2. Bạn có thích tham gia những sự kiện kinh tế, tài chính?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, rất thích", "1: Bình thường", "2: Không"};
                        return arr;
                    }
                }),

                new SurveyQuestion("3. Bạn có thích xem thời sự và cá tin tức về kinh tế?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, tôi rất thích", "1: Bình thường", "2: Tôi chỉ xem những nội dung quan trọng, có tầm ảnh hưởng", "3: Không"};
                        return arr;
                    }
                }),

                new SurveyQuestion("4. Bạn có từng tham gia đầu tư vào các kênh tài chính không?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, tôi vẫn đang đầu tư", "1: Trước kia từng tham gia, bây giờ không còn nữa", "2: Tôi chỉ đầu tư nếu có người quen đầu tư cùng", "3: Không, tôi không thích rủi ro"};
                        return arr;
                    }
                }),

                new SurveyQuestion("5. Bạn có khả năng thống kê số liệu và phân tích rủi ro không?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, tôi là khá thích", "1: Bình thường", "2: Tôi không giỏi nhưng tôi có thể làm được", "3: Không, tôi không thích vướn vào rắc rối"};
                        return arr;
                    }
                }),

                new SurveyQuestion("6. Bạn có phải là người thích cạnh tranh, và muốn mình giỏi hơn người khác không?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, tôi rất hiếu thắng", "1: Bình thường", "2: Không, tôi không thích cạnh tranh", "3: Không cố định, lúc thích cạnh tranh lúc không muốn"};
                        return arr;
                    }
                }),
                new SurveyQuestion("7. Bạn nghĩ như thế nào về hoạt động nhóm, team building?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Hoạt động bắt buộc tham gia trong tập thể", "1: Khuyến khích mọi người tham gia để tăng sự đoàn kết", "2: Hoạt động nhàm chán", "3: Tôi không thích những hoạt động này"};
                        return arr;
                    }
                }),
                new SurveyQuestion("8. Thông thường, khi gặp mặt người lạ, bạn sẽ đối xử với họ như thế nào?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Cư xử lịch thiệp và tử tế", "1: Lịch sự, xả giao", "2: Thân thiện, nhiệt tình", "3: Xa cách", "4: Tùy vào ấn tượng của họ với mình"};
                        return arr;
                    }
                }),
                new SurveyQuestion("9. Bạn nghĩ như thế nào về việc kết hợp văn hóa vào truyền thông thị trường?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, tôi thấy nên kết hợp", "1: Tôi thấy nên làm tốt 1 mặt là đủ", "2: Tôi nghĩ nên kết hợp một cách có chọn lọc", "3: Chúng ta nên kết hợp để giữ gìn bản sắc"};
                        return arr;
                    }
                }),
                new SurveyQuestion("10. Bạn có thích làm việc chung với những người quen biết?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, họ làm tôi có cảm giác an toàn", "1: Với tôi người quen và người lạ như nhau", "2: Tùy lúc, không phải lúc nào tôi cũng thích làm việc với họ", "3: Không, tôi không thích điều này"};
                        return arr;
                    }
                })
        };

    // KHÔNG CẦN SỬA GÌ HẾT
    interface CreateAnswer {
        String[] createAnswer();
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


