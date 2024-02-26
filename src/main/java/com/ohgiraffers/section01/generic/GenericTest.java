package com.ohgiraffers.section01.generic;

public class GenericTest<T> {


        /* 필기.
        *   제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자(<>) 를 이용하여 작성한다.
        *
        * */

    /* 필기.
    *   다이아몬드 연산자 내부에 작성한 T 는 타입 변수라고 부른다.
    *   타입변수를 자료형 대신 사용할 것인데, 가상으로 존제하는 타입이며
    *   T가 아닌 다른 영문자를 사용해도 된다. (웬만해서는 타입 T 를 많이 쓴다.)
    *   사용하는 쪽에서는 작성한 제네릭 클래스 사용 시
    *   실제 사용할 타입을 타입변수 자리에 맞춰서 넣어주세 되면 컴파일 시점에 타입이
    *   결정되게 된다.
    * */

    private T value;            // 아직 지정을 안해서 나중에 지정할 것이다

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
