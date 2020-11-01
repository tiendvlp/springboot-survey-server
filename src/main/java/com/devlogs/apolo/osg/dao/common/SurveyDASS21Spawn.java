package com.devlogs.apolo.osg.dao.common;
/* YÊU CẦU
* CÁC CÂU TRẢ LỜI CẦN PHẢI ĐƯỢC SẮP XẾP THEO THỨ TỰ (NẾU CẦN THIẾT)
* VD NHƯ MBTI THÌ CÁC CÂU TRẢ LỜI MANG TÍNH CHẤT TĂNG HOẶC GIẢM DẦN
* */
public class SurveyDASS21Spawn{
    public String id = "923DASS21";
    public String name = "DASS21";
    public String description= "olalala";
    public String topicId = "8291";

    public SurveyQuestion[] questions = {
                // khi tạo một câu hỏi mới chỉ cần copy rồi sửa lại mấy cái nội dung là được
                new SurveyQuestion("I found it hard to wind down.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),

                new SurveyQuestion("Was aware of dryness of my mouth.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),

                new SurveyQuestion("I couldn't seem to experience any positive feeling at all.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),

                new SurveyQuestion("I experienced breathing difficulty.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),

                new SurveyQuestion("I found it difficult to work up the initiative to do things.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),

                new SurveyQuestion("I tended to over-react to situations.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I experienced trembling (eg, in the hands).", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I felt that I was using a lot of nervous energy.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I was worried about situations in which I might panic and make a fool of myself.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I felt that I had nothing to look forward to.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I found myself getting agitated.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I found it difficult to relax.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I felt down-hearted and blue.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I was intolerant of anything that kept me from getting on with what I was doing.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I felt I was close to panic.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I was unable to become enthusiastic about anything.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I felt I wasn't worth much as a person.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I felt I wasn’t worth much as a person.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I was aware of the action of my heart in the absence of physical exertion.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I felt scared without any good reason.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
                new SurveyQuestion("I felt that life was meaningless.", new CreateAnswer() {
                    @Override
                    public String[] createAnswer() {
                        String[] arr = {"0: Never", "1: Sometimes", "2: Often", "3: Almost Always"};
                        return arr;
                    }
                }),
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


