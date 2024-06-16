import java.io.*;

public class String2 {
    static String IP;
    static StringBuilder sb = new StringBuilder();
    public static void makeIP(StringBuilder ipAddress, int start, int dot){
        if(dot==4&&start==IP.length()){
            sb.append(ipAddress.substring(0,ipAddress.length()-1)).append("\n");
        }
        if (dot>=4||start>=IP.length())return;;
        for (int i = 0; i <= 3; i++){
            if (start+1>IP.length())return;
            String segment = IP.substring(start, start+1);
            int num = Integer.parseInt(segment);
            if (num>=0 && num<=255&&!(segment.startsWith("0")&&segment.length()>1)){
                ipAddress.append(segment).append(".");
                makeIP(ipAddress,start+i, dot+1);
                ipAddress.setLength(ipAddress.length()-(segment.length()+1));
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        IP = br.readLine();
        makeIP(new StringBuilder(),0,0);
        System.out.print(sb);
    }
}
