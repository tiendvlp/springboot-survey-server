package com.devlogs.apolo.osg.dao.common;

public class SurveyMbtiSpawn {
    public final String name = "MBTI";
    public final String id  = "9121dev92log";
    public String desciption = "heloo cac ban";
    public String topicId = "8291";

    public SurveyQuestion[] questions = new SurveyQuestion[]{
            new SurveyQuestion("Khi ?i ??n m?t n?i n�o ?� , b?n s? :", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{" L�n danh s�ch c�ng vi?c v� th?i gian th?c hi?n c�c c�ng vi?c ?� ",
                            "Ngh? ??n c�ng vi?c s? l�m r?i ?i th�i"};
                }

            }),

            new SurveyQuestion(" N?u l� m?t gi�o vi�n , b?n mu?n d?y ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"C�c kh�a h?c th?c nghi?m (th?c t?) ", "c�c kh�a h?c li�n quan ??n l� thuy?t "};
                }

            }),

            new SurveyQuestion("Th??ng th� b?n c� ph?i l� m?t ng??i  ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Ch? ??ng giao ti?p ", "Tr?m t�nh v� d� d?t"};
                }
            }),

            new SurveyQuestion("B?n th??ng xuy�n h�nh ??ng  theo  ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"C?m t�nh, tr�i tim s? ??a ra quy?t ??nh",
                            "l� tr� , suy ngh? logic r?i ??a ra quy?t ??nh, kh�ng ?? t�nh c?m xen l?n v�o quy?t ??nh"};
                }

            }),

            new SurveyQuestion("Khi l�m nh?ng vi?c m� nhi?u ng??i kh�c v?n th??ng xuy�n hay l�m, " +
                    "th� � n�o d??i ?�y h?p d?n b?n h?n  ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Ph�t tri?n theo c�ch ri�ng c?a b?n ", "l�m theo c�ch truy?n th?ng"};
                }

            }),

            new SurveyQuestion("Trong nh�m b?n b� , b?n l� ng??i  ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"N?m b?t tin t?c v? m?i ng??i ",
                            " l� m?t trong nh?ng ng??i cu?i c�ng bi?t v? nh?ng g� ?ang x?y ra "};
                }

            }),

            new SurveyQuestion("� t??ng vi?c l?p danh s�ch nh?ng vi?c b?n c�n ho�n th�nh v�o cu?i tu?n ",
                    new CreateAnswer() {
                        @Override
                        public String[] createAnswer() {
                            return new String[]{"H?p d?n v?i b?n", "B?n c?m th?y l?nh nh?t v? n� ", "B?n r?t ch�n n?n v?i n�"};
                        }

                    }),

            new SurveyQuestion(" Khi c� m?t c�ng vi?c ??c bi?t ?? l�m, b? mu?n ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"L�n k? ho?ch m?t c�ch c?n th?n tr??c khi b?t ??u",
                            "T�m ra nh?ng ?i?u c?n thi?t trong su?t qu� tr�nh th?c hi?n"};
                }

            }),
            new SurveyQuestion("B?n c� xu h??ng ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"M? r?ng t�nh b?n v?i nhi?u ng??ikh�c nhau",
                            "K?t b?n v?i �t ng??i, nh?ng t�nh b?n s�u s?c"};
                }

            }),
            new SurveyQuestion("B?n h�m m? nh?ng ng??i ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Kh� b�nh th??ng ?? kh�ng bao gi? khi?n h? b? ch� �",
                            "Ng??i l?p d?, ch?ng th�m b?n t�m h? c� kh�c ng??i hay kh�ng"};
                }

            }),
            new SurveyQuestion("B?n c� th�ch ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"S?p x?p nh?ng bu?i d� ngo?i, b?a ti?c.. thu?n l?i nh?t",
                            "T? do l�m b?t c? ?i?u g� b?n ngh? l� vui, t�y v�o th?i ?i?m"};
                }

            }),

            new SurveyQuestion("B?n th??ng quan h? t?t v?i   ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Ng??i suy ngh? th?c t? ", "Ng??i m? m?ng(t??ng t??ng )"};
                }

            }),

            new SurveyQuestion("Khi l� th�nh vi�n c?a m?t nh�m, b?n c� th??ng  ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Tham gia v�o cu?c n�i chuy?n c?a  nh�m ", " Ng?i t??ng t??ng m?t m�nh"};
                }

            }),

            new SurveyQuestion("B?n th??ng ???c g?i l� ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"M?t ng??i ?a c?m ", "M?t ng??i l� tr�"};
                }

            }),

            new SurveyQuestion("Khi ??c ?? gi?i tr�, b?n c�  ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Th�ch c�ch vi?t ph� c�ch, c�ch vi?t truy?n th?ng",
                            "Th�ch t�c gi? vi?t nh?ng g� h? ngh?"};
                }

            }),

            new SurveyQuestion("Li?u b?n c� th? ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"D? d�ng n�i chuy?n th?t l�u v?i h?u h?t t?t c? m?i ng??i",
                            "Ch? c� th? n�i chuy?n v?i m?t v�i ng??i nh?t ??nh ho?c v?i c�c ?i?u ki?n nh?t ?inh "};
                }

            }),

            new SurveyQuestion("Vi?c tu�n th? th?i kh�a bi?u c�  ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Thu h�t , h?p d?n b?n ", "Khi?n b?n c?m th?y b? g� b�"};
                }

            }),

            new SurveyQuestion("Khi b?n ???c ?y nhi?m ?? l�m m?t ?iu� g� ?� v�o m?t th?i ?i?m nh?t ??nh " +
                    "b?n th?y  ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Th?t t?t ?? c� th? l?p k? ho?ch cho ph� h?p ", "M?t ch�t kh� ch?u v� b? r�ng bu?c "};
                }

            }),

            new SurveyQuestion("B?n c� th�nh c�ng h?n khi ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"C?n th?n l�m theo m?t k? ho?ch c�ng vi?c ",
                            "??i ph� v?i nh?ng b?t ng? v� nhanh ch�ng nh�n th?y nh?ng g� n�n d??c th?c hi?n"};
                }

            }),

            new SurveyQuestion("B?n c� mu?n ???c coi l�  ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Ng??i th?c t?, th?c d?ng ", "Ng??i kh�o l�o, m?u tr�"};
                }

            }),

            new SurveyQuestion("Trong m?t nh�m ?�ng ng??i, b?n th??ng ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Giowis thi?u ng?ng ng??i trong nh�m v?i m?i ng??i", "???c ng??i kh�c gi?i thi?u"};
                }

            }),

            new SurveyQuestion("Khi ?�nh gi� m?t v?n ??( con ng??i, s? v?t...), b?n th??ng ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"??t t�nh c?m l�n tr�n l� lu?n logic ", "??t l� lu?n logic l�n tr�n t�nh c?m "};
                }

            }),

            new SurveyQuestion("B?n mu?n c� nh?ng ng??i b?n ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Lu�n ??a ra nh?ng � t??ng m?i ", "Lu�n lu�n th?c t?"};
                }

            }),

            new SurveyQuestion("Li?u m?t ng??i b?n m?i g?p c� th?  ch? ra ngay ???c nh?ng ?i?u b?n quan t�m ??n "
                    , new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Ngay l?p t?c", "Ch? sau khi h? ?� th?c s? hi?u b?n "};
                }

            }),

            new SurveyQuestion("Trong c�ng vi?c h?ng ng�y, b?n c� ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"L?p klees ho?ch cho c�c c�ng vi?c, l�m vi?c d??i �p l?c" +
                            "ch?y ?ua v?i th?i gian ", "Gh�t ph?i l�m vi?c d??i �p l?c"};
                }

            }),

            new SurveyQuestion("B?n th??ng  ", new CreateAnswer() {
                @Override
                public String[] createAnswer() {
                    return new String[]{"Th? hi?n c?m x�c m?t c�ch ", "K�m n�n c?m x�c b�n trong m�nh"};
                }

            }),
    };

    interface CreateAnswer {
        String[] createAnswer();
    }

    public class SurveyQuestion{
        public String question;
        public String[] answers;

        public SurveyQuestion ( String question, CreateAnswer createAnswer) {
            this.question = question;
            this.answers = createAnswer.createAnswer();
        }
    }

}



