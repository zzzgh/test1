package com.test;
/*
 * @package com.test
 * @className Test1 
 * @author zhangganghui
 * @date 2020/10/9 14:25
 * @version 1.0.0
 */                        
public class Test1 {

    /**
     * TODO
     * @method eat
     * @author zhangganghui
     * @param
     * @return void
     * @throws 
     * @date 2020/10  /9 13:08
     */
    public void eat(){
        Person p1 = new Person("李四",30);
//        p1.setAge(20);
//        p1.setName("张三");

        System.out.println(p1);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.eat();
    }
}
