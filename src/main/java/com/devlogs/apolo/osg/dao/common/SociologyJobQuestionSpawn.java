package com.devlogs.apolo.osg.dao.common;
/* YÊU CẦU
* CÁC CÂU TRẢ LỜI CẦN PHẢI ĐƯỢC SẮP XẾP THEO THỨ TỰ (NẾU CẦN THIẾT)
* VD NHƯ MBTI THÌ CÁC CÂU TRẢ LỜI MANG TÍNH CHẤT TĂNG HOẶC GIẢM DẦN
* */
public class SociologyJobQuestionSpawn {
    public String id = "923DASS21";
    public String name = "Sociology Job";
    public String description= "Bạn có nhiều sở thích liên quan đến nhóm XÃ HỘI? " +
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

                new SurveyQuestion("2. Bạn có thích giao lưu, làm quen nhiều bạn mới không?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, rất thích", "1: Bình thường", "2: Không"};
                        return arr;
                    }
                }),

                new SurveyQuestion("3. Bạn có thích tham gia các hoạt động thiện nguyện vì cộng đồng không?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, tôi rất thích", "1: Bình thường", "2: Tôi chỉ tham gia vì trách nhiệm", "3: Không"};
                        return arr;
                    }
                }),

                new SurveyQuestion("4. Thông thường khi làm việc nhóm, bạn sẽ đóng vai trò như thế nào?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Trưởng nhóm", "1: Người đưa ra ý kiến", "2: Người nhận xét, đánh giá", "3: Người lắng nghe và thực hiện"};
                        return arr;
                    }
                }),

                new SurveyQuestion("5. Bạn có khả năng hòa giải, giải quyết những sự viêc mâu thuẫn không?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, tôi là người hòa giải mọi thứ", "1: Bình thường", "2: Tôi không phải là người hòa giải", "3: Không, tôi không thích vướn vào rắc rối"};
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
                new SurveyQuestion("9. Bạn có nhiều bạn bè không?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, tôi có rất nhiều bạn bè", "1: Tôi chỉ có một vài người bạn thân", "2: Tôi có bạn nhưng chỉ dừng lại ở mức xã giao", "3: Tôi không có bạn"};
                        return arr;
                    }
                }),
                new SurveyQuestion("10. Bạn có phải là nơi để lắng nghe bạn bè chia sẻ về những vấn đề cá nhân của họ?", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Có, bạn bè thường tìm đến tôi tâm sự", "1: Tôi sẽ lắng nghe nếu họ thân thiết với tôi", "2: Tùy lúc, không phải lúc nào tôi cũng muốn nghe", "3: Không, tôi không thích điều này"};
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


