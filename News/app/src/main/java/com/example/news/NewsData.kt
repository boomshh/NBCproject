package com.example.news

class NewsData {
    fun getNewsData() : MutableList<NewsItem> {
        val newsList = mutableListOf<NewsItem>()
        newsList.add(NewsItem("\"적에게 공포 주는 세계최강 게임체인저\"…드론작전사 창설",
            "(서울=연합뉴스) 김귀근 기자 = 유사시 적 지역 감시정찰뿐 아니라 주요 시설 타격 등 임무를 수행할 드론작전사령부(이하 드론작전사)가 창설됐다.\n" +
                "\n" +
                "육·해·공군, 해병대로 구성된 국군 최초의 합동전투부대로, 합참의장이 지휘·감독하는 국방부 직할부대다.\n" +
                "\n" +
                "드론작전사는 1일 오후 3시 김승겸 합참의장 주관으로 군 주요 직위자와 부대원, 국회의원, 지방자치단체와 관련기관 대표 등 120여 명이 참석한 가운데 창설식을 거행했다고 밝혔다."))
        newsList.add(NewsItem("강백호 2군 복귀전 2루타…이강철 감독 \"엔트리 자리 비워놔\"",
            "(서울=연합뉴스) 이대호 기자 = kt wiz를 대표하는 강타자로 활약하다 올해 몸과 마음의 시련으로 힘겨운 한 해를 보내는 강백호(24)가 퓨처스(2군) 리그 출전으로 복귀를 알렸다.\n" +
                    "\n" +
                    "강백호는 1일 익산구장에서 열린 국군체육부대(상무)와 퓨처스리그 경기에 3번 지명 타자로 선발 출전해 4타수 1안타에 삼진 2개를 당했다.\n" +
                    "\n" +
                    "6회 상무 투수 박주성의 시속 141㎞ 포심 패스트볼을 공략해 우중간 2루타를 터트렸다."))
        newsList.add(NewsItem("'프로 잡는 아마' 장유빈, 2주 연속 우승 보인다(종합)",
            "(안산=연합뉴스) 권훈 기자 = 항저우 아시안게임에 출전하는 국가대표 장유빈이 지금껏 없었던 한국프로골프(KPGA) 코리안투어 2주 연속 아마추어 우승에 파란 불을 켰다.\n" +
                    "\n" +
                    "장유빈은 1일 경기도 안산시 대부도의 더헤븐 컨트리클럽(파72)에서 열린 KPGA 코리안투어 LX 챔피언십(총상금 6억원) 2라운드에서 7언더파 65타를 쳤다.\n" +
                    "\n" +
                    "중간 합계 11언더파 133타를 적어낸 장유빈은 김비오, 윤상필과 함께 공동 선두에 올랐다."))
        newsList.add(NewsItem("\"KTX 타고 광주 충장축제 가요\"…여행상품 출시",
            "(광주=연합뉴스) 형민우 기자 = 광주 동구 문화관광재단은 한국철도공사 광주전남본부, 동구 관내 3개 호텔과 함께 광주 충장축제 원패스 여행상품인 '충장축제 가보자 GO'를 출시한다고 1일 밝혔다.\n" +
                    "\n" +
                    "KTX와 연계한 이 여행상품은 체류형 관광객 유치를 위해 처음 출시한 것으로 교통, 숙박, 체험을 묶어 할인을 적용한 점이 특징이다.\n" +
                    "\n" +
                    "KTX 승차권 할인은 물론, 광주 문화 관광 중심지인 동구에 있는 ACC 디자인호텔, 라마다플라자 충장호텔, 컬쳐호텔 람 등 3개 호텔도 최대 65%까지 할인 혜택을 제공한다."))
        newsList.add(NewsItem("'부산 목욕탕 폭발' 현장 진입 난항…\"내부 온도 내리기 주력\"",
            "(부산=연합뉴스) 박성제 기자 = 1일 21명이 다친 부산의 한 목욕탕 폭발 사고와 관련해 소방당국은 추가 사고 위험을 줄이기 위해 건물 내부의 온도를 낮추는 데 우선 주력하고 있다.\n" +
                    "\n" +
                    "부산소방재난본부는 이날 오후 브리핑에서 \"폭발 사고가 난 목욕탕 내부 온도가 55도까지 내려간 상태\"라며 \"화재나 폭발 우려가 완전하게 사라질 때까지 계속 작업할 예정\"이라고 말했다.\n" +
                    "\n" +
                    "현재 건물 지하는 진화 작업으로 인해 물이 가득 찬 상태다."))
        newsList.add(NewsItem("김태흠 충남지사, '바이바이 플라스틱' 챌린지 동참",
            "(홍성=연합뉴스) 김소연 기자 = 김태흠 충남지사가 1일 '바이바이 플라스틱 챌린지'에 동참했다.\n" +
                    "\n" +
                    "챌린지는 플라스틱과 작별(Bye)한다는 의미로, 플라스틱 줄이기 범국민 실천 확산을 위해 환경부가 처음 시작했다.\n" +
                    "\n" +
                    "참여자가 누리소통망(SNS)에 불필요한 플라스틱 사용량을 줄이겠다고 약속한 뒤 다음 주자를 지목해 이어가는 방식이다."))
        newsList.add(NewsItem("경찰, 평택 환전소 외국인 강도 1명 구속영장 신청",
            "(평택=연합뉴스) 권준우 기자 = 경기 평택시의 한 환전소를 털고 나서 해외로 달아나려다 붙잡힌 외국인 강도 피의자에 대해 경찰이 구속영장을 신청했다. \n 경기 평택경찰서는 1일 특수강도 혐의로 타지키스탄 국적 A(34) 씨에 대해 구속영장을 신청했다고 밝혔다.\n" +
                    "\n" +
                    "A씨는 지난달 30일 오전 11시 50분께 평택시 신장동의 한 환전소에서 같은 국적의 B(34) 씨와 함께 모의 총기로 60대 여성 직원을 위협한 뒤 현금 8천달러(1천여만원)를 빼앗아 달아난 혐의를 받고 있다."))
        newsList.add(NewsItem("'바다 구경하며 책 읽는 재미'…울산 강동바다도서관 개관",
            "(울산=연합뉴스) 장지현 기자 = 울산 북구 강동바다도서관이 1일 정식으로 문을 열었다.\n" +
                    "\n" +
                    "강동바다도서관은 북구 산하동에 부지면적 680㎡, 지하 1층∼지상 3층, 연면적 980㎡ 규모로 지어졌다.\n" +
                    "\n" +
                    "국비 17억5천여만원 등 총사업비 42억6천200만원이 투입됐다."))
        newsList.add(NewsItem("부산 목욕탕 화재 폭발 사고…소방관 2명 중상 19명 경상(종합2보)",
            "(부산=연합뉴스) 차근호 박성제 김선호 기자 = 부산 한 목욕탕에서 화재에 이어 발생한 폭발 사고로 진화 중인 소방관을 비롯해 경찰, 공무원, 시민 등 21명이 다쳤다.\n" +
                    "\n" +
                    "1일 오후 1시 40분께 부산 동구 좌천동 매축지 마을에 있는 한 목욕탕에서 불이 났다.\n" +
                    "\n" +
                    "출동한 소방대원들은 목욕탕에 진입해 진화에 나서 큰 불길을 잡았다."))
        newsList.add(NewsItem("뉴스타파 신학림 압수수색…김만배에 돈 받고 허위 인터뷰 혐의(종합2보)",
            "(서울·고양=연합뉴스) 이보배 조다운 이도흔 기자 = 검찰이 신학림(64) 전 언론노조위원장이 화천대유자산관리 대주주 김만배 씨로부터 '윤석열 대통령의 부산저축은행 사건 수사 무마 의혹'에 대한 허위 인터뷰 대가로 억대 금품을 수수한 정황을 포착해 1일 강제수사에 나섰다.\n" +
                "\n" +
                "서울중앙지검 반부패수사3부(강백신 부장검사)는 이날 오전 신씨의 배임수재 및 청탁금지법 위반 혐의와 관련해 주거지와 그가 대표로 있는 서울 종로구 업체 사무실 등 총 2곳을 압수수색해 휴대전화, 노트북, 출판 관련 서류 등을 확보했다.\n" +
                "\n" +
                "검찰에 따르면 뉴스타파 전문위원이던 신씨는 김씨와 공모해 20대 대선 직전 윤 대통령과 대장동 사업에 관한 허위 인터뷰를 보도한 혐의를 받는다.\n" +
                "\n"))


        return newsList

    }
}