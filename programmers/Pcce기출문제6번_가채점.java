package programmers;

public class Pcce기출문제6번_가채점 {
    public String[] Pcce기출문제6번_가채점(int[] numbers, int[] our_score, int[] score_list) {

        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i =0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) {
                answer[i] = "Same";
            } else {
                answer[i] = "Different";
            }
        }

        return answer;
    }

    // 메인 메서드에서 결과 출력
    public static void main(String[] args) {
        // 객체를 생성하여 메서드 호출
        Pcce기출문제6번_가채점 solution = new Pcce기출문제6번_가채점();

        // 테스트 입력 배열
        int[] numbers = {3,4};
        int[] our_score = {85, 93};
        int[] score_list = {85, 92, 38, 93, 48, 85, 92, 56};

        // 결과 값 받기
        String[] result = solution.Pcce기출문제6번_가채점(numbers, our_score, score_list);

        // 결과 출력
        for (String res : result) {
            System.out.println(res);
        }
    }
}

