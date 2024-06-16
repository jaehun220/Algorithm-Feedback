//import java.util.*;
//
//public class Greedy1 {
//    public String solution(String number, int k) {
//        String answer = "";
//        ArrayDeque<Character> s = new ArrayDeque<>();
//        s.push(number.charAt(0);
//        //뒤의 수가 크면, 앞의 수를 버리자
//        //뒤의 수가 모두 적다면 마지막 수를 버린다
//        //들어오는 순서로 수를 저장->stack에 저장하자
//        for (int i = 0; i<number.length(); i++){
//            while(k>0&&!s.isEmpty()&&s.peek()<number.charAt(i)){
//                s.pop();
//                k--;
//            }
//            s.push(number.charAt(i));
//        }
//        while (k>0){
//            s.pop();
//            k--;
//        }
//        StringBuilder sb = new StringBuilder();
//        for (char temp : s){
//            sb.append(temp);
//        }
//        return sb.toString();
////        while (!s.isEmpty()) {
////            sb.append(s.pop());
////        }
////        return sb.reverse().toString();
//    }
//}
