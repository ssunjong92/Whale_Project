src/main/resources/application.properties 에서 디비 설정을 해주시면 됩니다.

전체 파일에서 아래 부분만 설정해주시면 됩니다.

spring.datasource.url=jdbc:mysql://localhost:<Port Number>/<Database Name>?allowPublicKeyRetrieval=true&useSSL=false&userUnicode=true&serverTimezone=Asia/Seoul
Example: spring.datasource.url=jdbc:mysql://localhost:3306/whale?allowPublicKeyRetrieval=true&useSSL=false&userUnicode=true&serverTimezone=Asia/Seoul


spring.datasource.username=<Mysql User Name>
spring.datasource.password=<Mysql Password>

spring.jpa.show-sql=true

그렇게 실행시키시고 http://localhost:8080으로 들어가보시면 Spring Security때문에 이렇게 로그인 하라는 창이 나옵니다.

Sprint Security가 기본적으로 제공해주는 유저인데 로그인하면 원래 저희가 들어가려했던 http://localhost:8080에 들어갈수 있습니다. 

<img width="944" alt="Screen Shot 2022-09-20 at 1 07 31" src="https://user-images.githubusercontent.com/95198715/191062719-3bd22788-eb0f-49d8-a84f-dcc8345c076a.png">


실행시켰던 Run 창에 아래와 같이 패스워드가 있는데 이걸를 복사합니다.

<img width="1251" alt="image" src="https://user-images.githubusercontent.com/95198715/191062866-598b83f2-fe9b-4728-a0e3-ddb7157a90b6.png">

아이디는 user이고 패스워드는 복사한 패스워드입니다.

그러고 로그인해서 아래처럼 뜨면 실행 성공!

<img width="938" alt="Screen Shot 2022-09-20 at 1 09 51" src="https://user-images.githubusercontent.com/95198715/191063173-48059227-a2da-49ad-b635-65e72a18ea1e.png">
