package String;
//一道面试题（关于值传递）
//基本数据类型传递的是存储的数据
//引用数据类型传递的是地址值
public class StringTest04 {

    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void change(String str,char ch[]){
        str = "test,ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
       StringTest04 ex = new StringTest04();
       ex.change(ex.str,ex.ch);

        System.out.println(ex.str);//good
        System.out.println(ex.ch);//best
    }


}
