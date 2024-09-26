package programmers;

public class Pcce기출문제5번_산책 {
    public int[] Pcce기출문제5번_산책(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
    // 메인 메서드에서 결과 출력
    public static void main(String[] args) {
        // 객체를 생성하여 메서드 호출
        Pcce기출문제5번_산책 solution = new Pcce기출문제5번_산책();

        // 테스트 경로 입력
        String route = "NESW";

        // 결과 값 받기
        int[] result = solution.Pcce기출문제5번_산책(route);

        // 결과 출력
        System.out.println("East-West: " + result[0] + ", North-South: " + result[1]);
    }
}
