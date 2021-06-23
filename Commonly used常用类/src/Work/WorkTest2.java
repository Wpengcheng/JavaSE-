package Work;


//习题二：获取一个字符串在另一个字符串出现的次数，如"ab"在"abkkcadkabkebfkabkskab"中出现的次数

import org.junit.Test;

/**思路：indexOf(str)：返回指定子字符串在此字符串中第一次出现处的索引，如果没有索引到指定字符串，就会返回-1
 * 1.先对abkkcadkabkebfkabkskab进行第一次的索引，
 * 2.再对abkkcadkabkebfkabkskab去掉第一次索引的新字符串（kkcadkabkebfkabkskab）进行第二次索引ab，
 * 3.再对kkcadkabkebfkabkskab去掉第二次索引的新字符串（kebfkabkskab）进行第三次索引
 * 4.再对kebfkabkskab去掉三次索引的新字符串（kskab）进行第四次索引
 * 5.每次索引成功后count加一，索引不到（index=-1）时，则退出循环
 * 弊端:每次索引都要重新造一个字符串
 */

public class WorkTest2 {//mainStr:  abkkcadkabkebfkabkskab   subStr:   ab
    public int getCount(String mainStr,String subStr){
        int mainlength = mainStr.length();
        int sublength = subStr.length();
        int count=0;//定义出现的次数
        int index=0;//定义subStr在mainStr里的索引

        if (mainlength>=sublength){


            //方式一：indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引，如果没有索引到指定字符串，就会返回-1
            // while ((index= mainStr.indexOf(subStr)) !=-1){ //返回subStr在mainStr里出现的索引，并返回到index中，并当index !=-1时
            // count++;//当index !=-1时，说明subStr在mainStr里存在索引，就让count+1
            // mainStr = mainStr.substring(index + sublength);//返回一个从上一次索引结束后开始的新字符串 如第一次索引后，就返回kkcadkabkebfkabkskab，然后新字符串再经历while循环
            // }

            //方式二：对方式一的优化  indexOf(String str,int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引,从指定的位置开始索引
            //方式二可以接着上次索引的位置继续进行索引，过程中只有唯一一个mainstr
            while ((index= mainStr.indexOf(subStr,index)) !=-1){
                count++;
                index=index+sublength;
            }

            return count;
        }else{
            return 0;
        }
    }

    @Test
    public void test(){
        String mainStr="abkkcadkabkebfkabkskab";
        String subStr="ab";
        int count = getCount(mainStr, subStr);
        System.out.println(count);

    }
}
