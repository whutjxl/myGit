public class hello{
    public static void main(String[] args){
        sayHello("Hello Java World!",60);
    }
    public static void sayHello(String s,int n){
        for(int i=0;i<n;++i){
            System.out.println(s+"--- "+i);
        }
    }
}
