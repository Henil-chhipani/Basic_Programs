// Count Words in a Sentence
/**
 * p32
 */
public class p32 {

    static int wordc(String s){
        int count =0;
        char a[]=new char[s.length()];
        
        for(int i=0;i<s.length();i++){
            a[i]= s.charAt(i);
            if( ((i>0)&&(a[i]!=' ')&&(a[i-1]==' ')) || ((a[0]!=' ')&&(i==0)) )  
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "hello how are you hello";
        System.out.println(wordc(s)+" words");
    }
}