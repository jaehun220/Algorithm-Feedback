import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String3 {
    public int solution(String msg) {
        int answer = 0; //점수|보너스|[옵션]
        String regax = "(\\d{1,2}[SDT][*#]{0,1}){3}";
        if (!msg.matches(regax)){
            System.out.println(msg+": 유효한 문자열 유형이 아닙니다.");
            return -1;
        }
        regax = "(\\d{1,2})([SDT])([*#]{0,1})";
        Pattern p = Pattern.compile(regax);
        Matcher m = p.matcher(msg);
        int[] scores = new int[3];
        int idx = 0;
        while(m.find()){
            int score = Integer.parseInt(m.group(1));
            switch (m.group(2)){
                case "D": score = score*score; break;
                case "T": score = score*score*score; break;
            }
            if ("#".equals(m.group(3))){
                score*=-1;
            }
            else if ("*".equals(m.group(3))){
                score*=2;
                if (idx>0)
                    scores[idx-1]*=2;
            }
            scores[idx]=score;
            idx+=1;
        }
        return scores[0]+scores[1]+scores[2];
    }
}
//    public static void main(String[] args) {
//        String regax ="(\\d{3})(\\d{3})(\\d{4})";
//        Pattern pat=Pattern.compile(regax);
//        String source = "1234567890,12345, and 9876543210";
//        Matcher mat=pat.matcher(source);
//
//        while(mat.find()) {
//            System.out.println("Phone: "+mat.group() + ",Formatted Phone: ("+ mat.group(1)+")"+ mat.group(2)+"-"+mat.group(3));
//        }
//
//    }