package com.ohgiraffers.section01.generic;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 제네릭(generic) 에 대해 이해할 수 있다. */
        /* 필기.
        *   제네릭(generic)
        *   제네릭의 사전적인 의미는 일반적인 이라는 의미이다.
        *   자바에서 제네릭이란, 데이터의 타입을 일반화 한다는 의미를 가진다.
        *
        *
        * 필기.
        *  제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법을 말한다.
        *   컴파일 시에 타입 검사를 시행하게 되면 클래스나 메소드 내부에서 사용되는 객체의 타입
        *   안정성을 높일 수 있으며, (잘못 된 타입인 걍우 컴파일 에러를 발생시킴.)
        *   반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다.
        *   (instanceof 비교 및 다운캐스팅 작성 불필요) -> 타입을 이미 검사 했으니 더이상 검사할 필요 없다 라는 의미
        *
        * 필기.
        *  제네릭 프로그래밍
        *   데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입들을 가질 수 있는 기술에
        *   중점을 두어 재사용성을 높일 수 있는 프로그래밍 방식이다.
        * */


        GenericTest<Integer> gt1 = new GenericTest<Integer>();
        // Generic class  에서 아직 값(타입)을 정하지 않았는데 Application class 에서 integer 이라는 값을 넣어서 Generic class
        // 에서 저절로 값이 바뀐다. (하나만 만들어 놓고 타입은 정하지 않고 다른 클래스에서 제사용이 가능하다.)

        gt1.setValue(new Integer(10));
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        GenericTest<String> gt2 = new GenericTest<String>();    // <> 안에 만약 값이 정해져 있으면 다시 안써도 된다.
        gt2.setValue("이도아");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof  String);

    }


}
