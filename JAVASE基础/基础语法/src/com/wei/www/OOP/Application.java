package com.wei.www.OOP;
//一个项目应该只存在一个main方法
import com.wei.www.OOP.Pet.Pet;
import com.wei.www.OOP.demon05.Person;
import com.wei.www.OOP.demon01.Student01;
import com.wei.www.OOP.demon03.B;
import com.wei.www.OOP.demon05.Student;
import com.wei.www.OOP.demon05.Teacher;
import com.wei.www.OOP.demon07.A;
import com.wei.www.OOP.demon09.Outer;


public class Application {


}

























    /*
   demon09包
   //实例化外部类
        Outer outer = new Outer();
        outer.out();

        //通过外部类来实例化内部类
        Outer.Inner inner =  outer.new Inner();
        inner.in();
        inner.getID();
 */









/*
 demon05包
        //Object>String
        //Object>Person>Teacher
        //Object>Person>Student
        Object object = new Student();
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false
        System.out.println("==============================================");
       Person person = new Student();
        System.out.println(person  instanceof Student);//true
        System.out.println(person  instanceof Person);//true
        System.out.println(person  instanceof Object);//true
        System.out.println(person  instanceof Teacher);//false
        //System.out.println(person instanceof String); 编译报错
        System.out.println("==============================================");
        Student student = new Student();
        System.out.println(student  instanceof Student);//true
        System.out.println(student  instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(student  instanceof Teacher);编译报错
        //System.out.println(person instanceof String); 编译报错

        //高《---------- ---- ---- 低
        Person p1 = new Student();//低转高不需要强制转换
        //p1默认为 Person类型
        //将p1转换成Student类型需要强制转换，转换成功后就可以使用Student类型的方法
        //Student student = (Student) p1;    student.go();
        //上面两个可以整合成一句代码，即转换又调用了方法
        ((Student) p1).go();

         //类型之间的转换
       Student student = new Student();
       student.go();
        //高《----------  低
        Person person = student;//低转高不需要强制转换
        // person.go();person类型本质还是student，但不能使用原来的方法
       // 因此子类转换成父类有可能会丢失自己本来的一些方法


*/
//=====================================================================================================
/*
 demon04包
         //一个对象的实际类型是确定的，但可以指向的引用类型是不确定的
        //子类能调用的方法都是自己的或者继承父类的
        Student s1=  new Student();
        //父类可以指向子类，但不能调用子类独有的方法
        Person s2 =  new Student();//父类的引用指向子类
       Object s3 =  new Student();
       s2.run();// son  如果子类重写了父类的方法，则父类执行子类的方法
       s1.run();// son
       s1.eat();//eat
       ((Student) s2).eat();//eat   把Person强制转换成Student类型
    }
}
*/
//=====================================================================================================
/*
        // demon01包
        //   Student类与对象的创建
        //类是抽象的，需要通过new实例化，实例化后会返回一个自己的对象
        //对象student就是类Student的具体实例
        //同一个类可以产生不同的对象
        Student student = new Student();
        Student 狂铁 = new Student();
        Student 虞姬 = new Student();
        student.name = "白起";
        狂铁.name = "狂";
        虞姬.name = "虞";
        student.age = 3;
        狂铁.age = 3;
        虞姬.age = 3;
        System.out.println(student.name);
        System.out.println(狂铁.name);
        System.out.println(虞姬.name);
        System.out.println(student.age);
        System.out.println(狂铁.age);
        System.out.println(虞姬.age);


        // Person类
        Person person = new Person("狂");
        System.out.println(person.name);


        // Student01类
        Student01 s1 = new Student01();
        //set给数据设置值
        s1.setName("狂");
        //get获得这个数据
        System.out.println("我的名字:" + s1.getName());
        System.out.println("=============================");
        s1.setAge(10);
        System.out.println("我的年龄为：" + s1.getAge());
        System.out.println("=============================");
        s1.setId(891121332);
        System.out.println("学号为：" + s1.getId());
        System.out.println("=============================");
        s1.setSex("你");
    }

}
//=====================================================================================================
/*
        demon02包
        Student类
        Student student = new Student();
        student.say();
        student.setMoney(10000000);
        System.out.println(student.getMoney())

 */
//=====================================================================================================
/*
     demon03包
      Student类
      Student student = new Student();

    //调用test方法
    student.test("狂铁");
    //调用test1方法
    student.test1();

A,B类
import com.wei.www.OOP.demon03.A;
import com.wei.www.OOP.demon03.B;

   A a = new A();
       //调用test方法
        a.test();
       //父类的引用指向子类
        B b = new A();//子类重写了父类的方法
        b.test();
 */
