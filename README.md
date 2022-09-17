# Java_TestingCode

## Java_testing_code
### Type, Instance, Static & None-Static, ...
<details>
<summary style="cursor:pointer;">더보기</summary>
<div markdown="1">
  <ul>
    <li>191203 : |n(new line), .length() method</li>
    <li>191205 : variable, datatype, Math method</li>
    <li>191209 : change datatype</li>
    <li>191213 : accountApp
      <ul>
        <li>_3 : change datatype, variable</li>
        <li>_4 : if/else statements</li>
        <li>_5 : array</li>
        <li>_6 : array, while statements, length method</li>
      </ul>
    </li>
    <li>191218 : Instance ; dt(=class) v = new dt()</li>
    <li>191218 : make local variables to fields, make methods</li>
    <li>191221 : static & non-static variable, method</li>
    <li>200110 : make instance of Scanner class</li>
    <li>200213 : method 'next...()' of class 'Scanner', 'Random'
      <ul>
        <li>_1 : Scanner class + nextInt(), nextDouble(), next(), nextLine(), Conditional Operator</li>
        <li>_2 : Random class + nextInt(n), nextDouble()</li>
        <li>_3 : not commit</li>
      </ul>
    </li>
    <li>200214 : Selector, Inheritance, parameter(array)
      <ul>
        <li>_1 : Selector, Inheritance cf.super, super()</li>
        <li>_2 : paramiter(array)</li>
      </ul>
    </li>
  </ul>
</div>
</details>

### Clone
Cf. package(directory) : Java_testing_code

Primitive Type(copy value) vs Reference Type(copy address of value)
- 200225, 200225 : Shallow Cloning
- 200411 : Deep Cloning

### BufferedReader & BufferedWriter
Cf. package(directory) : Java_testing_code
- 200424_Bufferd : how to use
- 200424_BufferedEx : example

***
## Comparable vs Comparator
Cf. package(directory) : compare (Files : 200424_UsingComparable, 200424_UsingComparator)

객체의 정렬 기준을 명시하는 두 가지 방법 : Comparable, Comparator
### Comparable(Interface)
정렬 수행시 기본적으로 적용되는 정렬 기준이 되는 메소드를 정의하는 Interface
- package : java.lang.Comparable
- java에서 제공되는 정렬이 가능한 클래스들은 모두 Comparable를 구현하고 있으며, 정렬시 이에 맞게 정렬된다.
  - ex. Integer, Double :  오름차순 정렬 / String :  사전순 정렬

#### [구현 방법]
> 정렬할 객체에 Interface Comparable을 구현(compareTo()를 overriding)
> 1. 정렬하고자 하는 객체의 청사진이 되는 클래스에 Interface Comparable을 구현한 뒤, 이 클래스를 인스턴스화.
> 2. 인스턴스화 된 객체들이 모인 배열 혹은 리스트를 sort를 통해 정렬


#### 주요 메서드 `compareTo()`

- a. 현재 객체 < 매개변수로 받은 객체 : 음수 리턴(해당 속성 혹은 값에 있어서 내림 차순),
- b.현재 객체 > 매개변수로 받은 객체 : 양수 리턴(오름차순), 둘이 같을 경우 0리턴
- 음수 또는 0이 리턴될 경우 객체의 자리가 그대로 유지되며, 양수인 경우 두 객체의 자리가 변경된다.

[사용 방법] : `Arrays.sort(array)`, `Collections.sort(list)`
(Cf. 역순으로 정렬하고자 할 경우에는 두 번째 인자로 `Collections.reverseOrder()`를 전달한다.)


### Comparator(Interface)
정렬 가능한 클래스. 즉, Comparable을 구현한 클래스들의 기본 정렬 기준과 다르게 정렬하고 싶을 때 사용하는 Interface
- package : java.util.Comparator
- 주로 익명 클래스로 사용되며, 기본적인 정렬 방법인 오름차순 정렬을 내림차순으로 바꾸고 싶을 때 많이 사용

[구현 방법]
> Interface Comparator를 구현(`compare()`를 overriding한) 클래스(이를 임의로 myComparator라고 한다. - ln28)를 작성.

#### 주요 메서드 `compare()`
- 첫번째 인자 > 두번째 인자 : 양수 리턴
- 첫번째 인자(객체) < 두번째 인자(객체) : 음수 리턴
- 두 인자가 같을 경우 0리턴
- 음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우 두 객체의 자리가 변경된다.
- Integer.compare(x, y)은 다음과 같다.
```java
return (x < y) ? -1 : (x == y) ? 0 : 1;
```
- Cf. 내림차순 정렬의 경우 두 매개변수의 위치를 바꿔준다.(Integer.compare(y, x);

[사용 방법] : Arrays.sort(array, myComparator), Collections.sort(list, myComparator)
***

## DB Connect with JDBC
- 200504: create connection with DataBase
- 200507: CRUD with DAO, DTO
  - DAO(Data Access Object)
  - DTO(Data Transfer Object)
***
## Lambda
Lambda expression : 메서드를 하나의 식(expression)으로 표현한 것
<details>
<summary>표현식 기본 문법</summary>
<div markdown="1">
<ol>
  <li>반환타입과 메서드명 생략
    <pre><code>int max(int a, int b) {
  return a > b ? a : b;
}

// 람다식으로 변환한 경우
(int a, int b) -> { return a > b ? a : b; }</code></pre></li>

<li>반환값이 있는 경우 return 생략 가능(식으로 나타낼 수 있으며, ';' 생략)
    <pre><code>(int a, int b) -> a > b ? a : b</code></pre>
  </li>
  <li>대부분의 경우에는 매개변수 타입 생략 가능(유추 가능한 경우)
    <p>Cf. 매개변수가 여러 개일 경우 모두 생략/모두 명시만 가능하다.</p>
    <p>Cf. 매개변수가 하나라면 괄호 생략 가능(Cf. 타입이 명시되는 경우 괄호 생략 불가)</p>
<code>(a, b) -> a > b ? a : b</code>
  </li>
  <li>괄호 안의 문장이 하나라면 괄호 `{}` 생략 가능
    <p>Cf. 괄호 안에 return문이 들어갈 경우 생략 불가</p>
    <pre><code>(String name, int i) -> {
  System.out.println(name + "=" + i);
}
// 람다식으로 변환한 경우
(String name, int i) -> System.out.println(name + "=" + i);</code></pre>
  </li>
</ol>
</div>
</details>

### Functional Interface
 람다식을 다루기 위한 인터페이스

[조건]
> 추상 메서드는 하나만 정의되어야 한다. (static, default 메서드에는 제약이 없다.)
> 1. 해당 함수형 인터페이스 타입을 매개변수로 받는 메서드는 이 추상 메서드을 호출한다.
> 2. 해당 함수형 인터페이스 타입이 반환될 때는 이 추상 메서드와 같은 람다식을 가리키는 인스턴스를 반환한다.
  


***
# Collections Framework_diagram
<img alt = "java-util-collection" src = "https://user-images.githubusercontent.com/60289743/75834575-b270c500-5dff-11ea-91e5-3bd82de8fb20.gif">


# Exception : Checked Exception & Unchecked Exception
<img alt = "java-exception" src = "https://user-images.githubusercontent.com/60289743/79839375-67cafc80-83ef-11ea-9c8f-721536865c39.png">
