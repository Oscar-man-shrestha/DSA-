

public class strBuilderDemo {


    public static StringBuilder firstLetterUppercase (String str){
       StringBuilder sb =new StringBuilder("");
       char ch = Character.toUpperCase(str.charAt(0));
       sb.append(ch);

       for(int i=1;i<str.length();i++){
        if(str.charAt(i) == ' ' && str.length()>i){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
            
        }   else{
            sb.append(str.charAt(i));
        }     
       }
       return sb;

        }

        public static String compress (String str){
            String newStr ="";
            for(int i=0;i<str.length();i++){
                Integer count =1;
                while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                    count++;
                    i++;
                }
                newStr +=str.charAt(i);
                if(count>1){
                    newStr+=count.toString();
                }
            }
            return newStr;
        }
    
    
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder ("");
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.print(sb);

        // String str ="hi, i am oscar man shrestha  ";
        
        // System.out.println(firstLetterUppercase(str));

        String str = "aaabbcccdd";
        System.out.println(str);
        
    }
}
