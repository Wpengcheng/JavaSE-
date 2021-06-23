package Work;

import org.junit.Test;

//习题一：   将字符串的指定部分反转   "abcdefg"反转为"abfedcg"
//方式一：转化为char[]
public class WorkTest1 {
    public static String reverse(String str, int startIndex, int endIndex) {
        if (str != null) {//字符串不为空的条件下
            char[] arr = str.toCharArray();//将字符串转化为char[]类型
            //对数组进行两个索引    一个从startIndex开始从左往右 一个从endIndex开始从右往左开始索引
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                //把索引出来的两个数组进行替换
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);//转化为String类型
        }
        return null;
    }


    @Test
    public void testReverse() {
        String str = "abcdefg";
        String str1 = reverse("abcdefg", 2, 5);
        System.out.println(str1);
    }

    //方式二 使用字符串的拼接 把abcdefg分成三部分，ab  ,  cdef  ,  g
    public static String reverse1(String str, int startIndex, int endIndex) {
       if (str!=null){
           String reverseStr = str.substring(0, startIndex);//先索引出ab
           for (int i = endIndex; i >= startIndex; i--) {//从后往前循环遍历出fedc
               reverseStr = reverseStr + str.charAt(i);//再把ab和fedc拼接起来得abfedc
           }

           reverseStr = reverseStr + str.substring(endIndex + 1);//索引出g，再次拼接就得abfedcg
           return reverseStr;
       }
      return null;
    }
    @Test
    public void test1(){
        String str ="abcdefg";
        String str2 = reverse1(str, 2, 5);
        System.out.println(str2);

    }

    //方式二的优化版，使用StringBuffer（涉及到多线程使用）或StringBuilder（没有涉及到多线程使用）替换String
    public static String reverse2(String str, int startIndex, int endIndex) {
        if (str !=null) {
            StringBuilder builder = new StringBuilder(str.length());//定义了build的长度
            //第一部分
            builder.append(str.substring(0, startIndex));//把ab索引出阿里放到builder里面

            //第二部分
            for (int i = endIndex; i >= startIndex; i--) {//从后往前循环遍历出fedc
                builder.append(str.charAt(i));//再把ab和fedc拼接起来得abfedc

            }
            builder.append(str.substring(endIndex + 1));//索引出g，再次拼接就得abfedcg
            return builder .toString();//将StringBuilder类型转换为所需的String类型
        }
        return null;
        }

        /*补充：StringBuilder和String的转换
        String str="a";   定义一个String类型字符串
        StringBuilder stringBuilder = new StringBuilder(str);    String转为StringBuilder
        String str1=stringBuilder.toString();    StringBuilder转为String
        注：StringBuffer和String的转化与上面类似
         */


        @Test
        public void test2(){
        String str="abcdefg";
        String s3 = reverse2(str, 2, 5);
        System.out.println(s3);
        }



    //方式三;直接用replace替换方法
    @Test
    public void test3() {
        String str = "abcdefg";
        String str2 = str.replace("abcdefg", "abfedcg");
        System.out.println(str2);

    }


}
