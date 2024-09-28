package programmers;

public class Pcee기출문제7번_가습기 {
        public int func1(int humidity, int val_set){
            if(humidity < val_set)
                return 3;
            return 1;
        }

        public int func2(int humidity){
            if(humidity >= 50)
                return 0;
            else if (humidity >= 40)
                return 1;
            else if (humidity >= 30)
                return 2;
            else if (humidity >= 20)
                return 3;
            else if (humidity >= 10)
                return 4;

            else
                return 5;
        }

        public int func3(int humidity, int val_set){
            if(humidity < val_set)
                return 1;
            return 0;
        }

        public int solution(String mode_type, int humidity, int val_set) {
            int answer = 0;

            if(mode_type.equals("auto")){ // "auto" 모드일 경우 func2 호출
                answer = func2(humidity); // func2는 humidity 값을 사용
            }
            else if(mode_type.equals("target")){// "target" 모드일 경우 func1 호출
                answer = func1( humidity, val_set);// func1은 humidity와 val_set을 사용
            }
            else if(mode_type.equals("minimum")){ // "minimum" 모드일 경우 func3 호출
                answer = func3(humidity, val_set);// func3도 humidity와 val_set을 사용
            }

            return answer;
        }
    }
