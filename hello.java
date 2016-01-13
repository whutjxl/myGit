public class hello{
    public static void main(String[] args){
        sayHello("Hello Java World!",10);
        System.out.println("-------------------------------------");
        sayChineseHello("你好！",6);
        System.out.println("-------------------------------------");
        say();
        System.out.println("-------------------------------------");
        sayDev();
        System.out.println("-------------------------------------");
        DEV();
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
    public static void say(){
        for(int i=0;i<10;++i){
            System.out.println("say!");
        }
    }
    public static void sayDev(){
        for(int i=0;i<5;++i){
            System.out.println("sayDev!");
        }
    }
    
    public static void DEV(){
        for(int i=0;i<3;++i){
            System.out.println("I AM DEV AND MASTER!!!!!!");
        }
    } 
}
