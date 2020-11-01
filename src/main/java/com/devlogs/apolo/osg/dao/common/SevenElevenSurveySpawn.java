package com.devlogs.apolo.osg.dao.common;

public class SevenElevenSurveySpawn {
    public String id = "711912001";
    public String title = "7-11 ";
    public String description = "We want to know your experience about our partners’ services to help them improve.";
    public String topicId = "7121";
    public SurveyQuestion[] questions = {
            // khi tạo một câu hỏi mới chỉ cần copy rồi sửa lại mấy cái nội dung là được
            new SurveyQuestion("1.  Bạn có cảm thấy hài lòng/thoải mái với không gian cửa hàng hay không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không","1: Có" };
                    return arr;
                }
            }),
            new SurveyQuestion("2. Bạn có thích cách thiết kế, trang trí của cửa hàng không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không","1: Có" };
                    return arr;
                }
            }),
            new SurveyQuestion("3. Sự đa dạng về mặt sản phẩm có làm bạn hài lòng không ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không hài lòng","1: Hài lòng","2: Rất hài lòng" };
                    return arr;
                }
            }),
            new SurveyQuestion("4.Thức ăn ở cửa hàng có ngon không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không ngon ","1: Khá ngon","2:Rất ngon" };
                    return arr;
                }
            }),
            new SurveyQuestion("5. Đồ uống ở 7-11 có ngon khôgn", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không ngon ","1: Khá ngon","2: Rất ngon" };
                    return arr;
                }
            }),
            new SurveyQuestion("6. Bạn có hài lòng về giá cả của các mặt hàng không ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không hài lòng","1: Khá hài lòng","2: Rất hài lòng"};
                    return arr;
                }
            }),
            new SurveyQuestion("7. Bạn thấy thời gian chờ tính tiền có lâu không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Rất lâu","1: Lâu","2: Không lâu" };
                    return arr;
                }
            }),
            new SurveyQuestion("8. Nhân viên phục vụ bạn có tận tình không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không tận tình","1: Khá tận tình","2: Rất tận tình" };
                    return arr;
                }
            }),
            new SurveyQuestion("9. Bạn có thường xuyên mua đồ ở 7-11 không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không thường xuyên","1: Lâu lâu","2:Thường xuyên" };
                    return arr;
                }
            }),
            new SurveyQuestion("10. Bạn có mua các mặt hàng khác ngoài đồ ăn,thức uống không", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    String[] arr = {"0: Không","1: Lâu lâu","2:Thường xuyên" };
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
