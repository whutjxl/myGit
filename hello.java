public class hello{
    public static void main(String[] args){
        sayHello("Hello Java World!",10);
        System.out.println("-------------------------------------");
        sayChineseHello("你好！",6);
    }
    public static void sayHello(String s,int n){
        for(int i=0;i<n;++i){
            System.out.println(s+"--- "+i);
        }
    }

    public static void sayChineseHello(String s,int n){
        for(int i=0;i<10;++i){
            System.out.println(s+"---->"+i);
        }
    }
}
