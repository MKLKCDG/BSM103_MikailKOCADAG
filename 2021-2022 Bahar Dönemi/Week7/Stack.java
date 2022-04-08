import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String data[]={"java","php","python","C","c++"};

        Stack<String> s=new Stack<String>();
        //push,pop,peek,size,isEmpty,
        //push,  pop=son elamanı yazdırıyor ama elemanı siliyor,
        // peek=son elemanı bize verir, size=boyutu verir
        for (String word: data){
            s.push(word);
        }
        System.out.println("Stack= " +s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println("Stack= "+ s);
        System.out.println("------------------------------------------------------------------");


        while (!s.isEmpty()){

        }
    }
}
