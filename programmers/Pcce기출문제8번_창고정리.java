package programmers;

public class Pcce기출문제8번_창고정리 {
        public String Pcce기출문제8번_창고정리(String[] storage, int[] num) {
            int num_item = 0;
            String[] clean_storage = new String[storage.length];
            int[] clean_num = new int[num.length];

            for(int i=0; i<storage.length; i++){
                int clean_idx = -1;
                // 아래는 현재 찾는 물건이 clean_stroage에 저장되어있는지 for문으로 찾는 부분
                for(int j=0; j<num_item; j++){
                    if(storage[i].equals(clean_storage[j])){
                        clean_idx = j; //만약 찾았다면 index를 저장하고 break한다.
                        break;
                    }
                }
                if(clean_idx == -1){ // 만약 clean_storage에 없다면 -1이므로 새로 num_item에 해당하는 index부분에 저장한다.
                    clean_storage[num_item] = storage[i];
                    clean_num[num_item] = num[i];
                    num_item += 1;
                }
                else{ // 만약 이전에 저장했다면 그 부분에 개수만 추가한다.
                    clean_num[clean_idx] += num[i];
                }
            }

            // 아래 코드에는 틀린 부분이 없습니다.

            int num_max = -1;
            String answer = "";
            for(int i=0; i<num_item; i++){
                if(clean_num[i] > num_max){
                    num_max = clean_num[i];
                    answer = clean_storage[i];
                }
            }
            return answer;
        }
    }

