기본구조
public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Hello");
    }}

    Public:

    메소드의 접근제어자, public은
    누구나 이
    메소드에 접근할
    수 있다는 의미

    class:
    클래스 블록을
    만드는 키워드

    static:메소드에
    static 이 지정되어
    있는 경우
    이 메소드는
    인스턴스 생성없이
    실행 할
    수 있음을 의미
    static 키워드를 사용한
    변수는 클래스가
    메모리에 올라갈
    때 자동으로
    생성이 된다.
    인스턴스 생성
    없이 바로
    사용 가능하기
    때문에 프로그램
    내에서 공통으로
    사용되는 데이터들을
    관리할 때
    이용한다.값을 변경해
    줄 경우
    클래스 이름을
    앞에 씀.

    void:
    메소드의 리턴값이

    없음(void: 사전적으로 “텅 빈” 이라는 뜻)을 의미 

return : 실행중인 메서드를 종료하고 호출한 곳으로 되돌아간다. 
    반환타입이 void가 아닌 경우, 반드시 return문 필요 

String[] : 문자열을 나타내는

    자바의 자료형 ([]가 있으므로 한 개가 아닌 여러개의 값으로 이루어진 배열임을 의미) 

args : String[] 자료형에

    대한 변수명 (arguments의 약어) 
args 대신 다른 이름을 사용해도 상관없다. 

System.out.println : 표준출력으로 데이터를 보내는 자바의 내장 메소드로 println 메소드의 입력 문자열을 화면에 출력한다. (명령문; Statement) 

main : 클래스를 실행할 수 있는 메소드 

; : 세미콜론, 문장이 종료되었음을 의미. 

문장의 마지막에 반드시 세미콜론이 있어야 한다. 

// : 라인 주석 처리 

/* */ : 블록 주석 처리 


클래스명은 소스파일의 이름(클래스명.java)과 동일하게 사용해야 한다. 
클래스 블록은 중괄호 {} 로 둘러싸여 있다. 
메소드명은 원하는 이름으로 지울 수 있다. 
메소드 명 이후의 괄호()안의 값들은 메소드의 입력 인자를 뜻한다. 
입력 인자는 “입력자료형” + “입력변수명” 형태로 이루어 진다. 
메소드 블록은 중괄호 {}로 둘러싸여 있다. 

String 

String a, b; 

a = "하하"; 

b = "호호"; 

System.out.println(a+b); // 하하호호 
 

문자와 문자열 
System.out.println('생'); // 문자 '' 
System.out.println("생활"); // 문자열 "" 
System.out.println("생"); // 한글자더라도 ""로 감싸면 문자열로 취급 
System.out.println("생활" + "코딩"); // 생활코딩 
System.out.println("1" + "1"); // 11 
System.out.println("안녕하세요 저는 \n\"귤껌\" 입니다."); // \n줄바꿈 \특수문자 

정수 
int a; // 정수 a 
a = 1; 
System.out.println(a+1); // 2 

실수 
double a; // 실수 a 
a = 1.1; 
System.out.println(a); // 1.1 


정수형 
* byte : 메모리크기 1byte / -128~127까지 표현 
* short : 2byte / -32,768 ~ 32,767 
* int : 4byte / -2,147,483,648 ~ 2,147,483,647 
* long : 8byte / 겁내 김 
* 보통 int를 쓰면 되지만 메모리 절약을 위해서는 더 작은걸 쓸수도 있음 
    
실수형 
* float : 메모리크기 4byte / +-1.40129846432481707e-45  
* double : 8byte / +-4.9406564~~~~ 


문자 
* char : 2byte / 모든 유니코드 문자 

상수 
* 상수란 변하지않는 값 (final) 
* 변수와 상수는 모두 데이터타입이 있다. 
// float a = 2.2; 둘다 실수인데 타입 미스매치 에러가 뜸
double a = 2.2; // 그런데 double은 에러가 뜨지 않음 
// 즉 2.2의 데이터타입은 double이라는것 
float b = 2.2F; // 이렇게하면 에러가 사라짐. F로 플롯타입이라는걸 명시해주는것 
// 변수와 상수 모두 데이터타입이 있음 
// 기본적으로 실수는 double타입이고, 굳이 플롯타입을 사용하고싶으면 F를 붙이기 
// int c = 2147483648; int가 표현할 수 있는 수보다 1 높아서 에러가 뜸 
// long c = 2147483648; // 에러가 사라질줄알았는데 아직도 에러. 
// 상수형의 기본 데이터타입이 int이기 때문에 에러가 나는것임. L을 붙임으로써 사용가능 
long c = 2147483648L; 


형변환 
데이터의 타입을 바꾼다는 것. 
예를 들어 int등을 double이나 float등으로 바꾸고싶을 때 
double a = 3.0F; // 자동으로 형변환해주어 에러가 나지 않음. 
float b = 3.0; // 자동형변환이 안됨. 표현범위가 좁은 -> 넓은 타입 변환만 허용 
// 즉 형변환 가능순서 byte -> short/char -> int -> long -> float -> double 
// 정수 -> 실수 형변환만 가능 

[String -> int]
String s = "12345";
int i = Integer.parseInt(s);
int i = Integer.valueOf(s);

[int -> String]
int i = 12345;
String s = Integer.toString(i);
String s = String.valueOf(i);

[Char -> int]
Char ch = '5';
int i = (int)(ch - '0'); // 단순 형변환만하면 해당 아스키코드값으로 출력됨. 원하는 값은 0을 더하거나 빼야됨.

[int -> Char]
int i = 5;
char ch = (char)(i + '0');

[String -> Char]
char ch1 = '5';
char[] ch2 = {'a','b','c'};
String s1 = String.valueOf(ch1); // '5'
String s2 = String.valueOf(ch2); // 'abc'

[Char -> String]
String s1 = "1";
String s2 = "1234";
char ch1 = s1.charAt(0); // '1'
char[] ch2 = s2.toCharArray(); // 1234

[Double/Float -> int]
double d = 1010.10101010; // double타입은 64비트로 실수를 표현
float f = 1010.101010f; // float타입은 32비트로 실수를 표현, 리터럴에 f를 붙혀 실수임을 표기해야함.
int i;
i = (int)d;
i = (int)f; // 소수점 뒷자리들은 버려짐

[int -> Double/Float]
int i= 1234;
double d = (double)i; 
float f = (float)i; // 소수점 첫째자리까지 출력됨 (1234.0)

[float -> String]
float floatValue = 3.14f;
String stringValue = Float.toString(floatValue); // 3.14

// List 선언
List<String> fruits = new ArrayList<>();
// 데이터 추가
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

 // Map 선언
 Map<String, Integer> fruitCounts = new HashMap<>();
 // 데이터 추가
 fruitCounts.put("Apple", 3);
 fruitCounts.put("Banana", 2);
 fruitCounts.put("Orange", 5);


// 리스트맵
List<Map<String, Object>> fruitList = new ArrayList<>();

Map<String, Object> fruit1 = new HashMap<>();
fruit1.put("name", "Apple");
fruit1.put("count", 3);

Map<String, Object> fruit2 = new HashMap<>();
fruit2.put("name", "Banana");
fruit2.put("count", 2);

fruitList.add(fruit1);
fruitList.add(fruit2);

// 대괄호[] - 배열 선언 및 배열 요소 접근에 사용
int[] numbers = new int[5];
String[] names = {"Alice", "Bob", "Charlie"};

// 중괄호{} - 코드블록정의, 리스트 데이터 정의
int[] numbers = {1, 2, 3, 4, 5}; 

// 오버로딩
한 클래스 내에 동일한 이름의 메소드를 여러개 정의
int add(int x, int y, int z) {
    int result = x + y + z;
    return result;
}
long add(int a, int b, long c) {
    long result = a + b + c;
    return result;
}

// 오버라이딩
부모 클래스로부터 상속받은 메소드의 내용을 변경
class Animal {
    String name;
    String color;

    public void cry() {
        System.out.println(name + " is crying.");
    }
}
class Dog extends Animal { ... }

