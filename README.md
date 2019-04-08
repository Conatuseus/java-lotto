# 로또 게임


## 기능 목록 
- 사용자로부터 구매 금액을 입력받는다.
- 사용자가 입력한 금액이 숫자, 0이상, 1000단위 인지 검증해야 한다.

- 한 장씩 발급하는데 1~45 사이의 임의의 수를 6개 생성한다.
- 6개의 수가 중복이 없는지 검증한다.
- 지난 주 당첨 번호를 입력 받는다.
- 입력 받은 당첨 번호가 숫자가 6개이고, 각각은 1~45사이의 값, 
중복되지 않는 수인지 검증한다.

- 보너스볼 숫자를 입력 받는다.
- 보너스볼이 당첨 번호와 중복되지 않고 1~45사이의 수인지 검증한다.

- 구입한 로또를 순회하며 당첨 로또 번호와 일치한 수를 count한다.
- count한 것으로 rank를 가져온다.
- 가져온 것으로 결과를 계산해서 출력한다.


## 기능 요구사항
* 로또게임기능을구현해야한다
* 규칙을모르면검색해로또규칙을찾아본다. 
* 로또구입금액을입력하면구입금액에해당하는로또를발급해야한다. 
* 로또1장의가격은1000원이다. 
* 로또당첨금액은고정되어있는것으로가정한다. 
* 수익률을계산해출력해야한다. 

## 프로그래밍 요구사항
+ Lotto 객체
    * 다음Lotto객체를활용해구현해야한다.
    * Lotto기본생성자를추가할수없다.
    * numbers변수의접근제어자인private을변경할수없다. 
    * Lotto에필드(인스턴스변수)를추가할수없다.

+ WinningLotto 객체
    * 다음WinningLotto객체를활용해구현해야한다. 
    * match()메소드의반환값인Rank는저장소에서제공한다. 
    * WinningLotto기본생성자를추가할수없다. 
    * lotto,bonusNo변수의접근제어자인private을변경할수없다. 
    * WinningLotto에필드(인스턴스변수)를추가할수없다.
    
+ 함수(또는메소드)의길이가10라인을넘어가지않도록구현한다. 
    * 함수(또는메소드)가한가지일만잘하도록구현한다. 
+ indent(인덴트,들여쓰기)depth를2가넘지않도록구현한다.1까지만허용한다. 
    * 최대한1을유지하기위해노력하고,정말힘든경우2까지허용한다. 
    * 예를들어while문안에if문이있으면들여쓰기는2이다.
+ 함수(또는메소드)의인자수를3개까지만허용한다. 4개이상은허용하지않는다.