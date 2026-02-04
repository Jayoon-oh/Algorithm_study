class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        // 1. i는 직원 번호입니다. 한 명씩 검사합니다.
        for (int i = 0; i < schedules.length; i++) {
            
            // 이 직원의 출근 인정 시각(limit)을 구합니다.
            int h = schedules[i] / 100;
            int m = schedules[i] % 100 + 10;
            if (m >= 60) {
                h += 1;
                m -= 60;
            }
            int limit = h * 100 + m;

            // 이 직원이 우수 사원인지 기록할 깃발(flag)입니다. 일단 true로 시작!
            boolean isPerfect = true;

            // 2. j는 날짜(0~6일차)입니다. 일주일치를 검사합니다.
            for (int j = 0; j < 7; j++) {
                // 현재 요일을 계산합니다 (1:월 ~ 7:일)
                int currentDay = (startday + j - 1) % 7 + 1;

                // 주말(토=6, 일=7)이면 지각 검사를 하지 않고 다음 날로 넘어갑니다.
                if (currentDay >= 6) {
                    continue;
                }

                // 평일인데 실제 출근 시간(timelogs[i][j])이 limit보다 늦으면?
                if (timelogs[i][j] > limit) {
                    isPerfect = false; // 탈락!
                    break; // 더 볼 필요도 없이 이 직원은 검사 종료
                }
            }

            // 3. 일주일이 끝났는데 아직 탈락하지 않았다면 상품 받을 인원(+1) 추가!
            if (isPerfect) {
                answer++;
            }
        }

        return answer;
    }
}