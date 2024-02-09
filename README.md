# Getting Started

### Reference Documentation
[Spring Data JPA - Auditing](https://docs.spring.io/spring-data/jpa/reference/auditing.html) </br>
[Using H2’s Web Console](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#data.sql.h2-web-console) </br>
[Spring JPA Attribute Converter](https://www.baeldung.com/jpa-attribute-converters) </br>
[Spring  Converters](https://docs.spring.io/spring-framework/reference/core/validation/convert.html) </br>


> ### *Problems to be solved*
> @Converter(autoApply = true) with generic type converter isn't working <br>

---

### Curl Commands

> Using the SecurityContextHolder to set the mock user <br>
> 如果沒有使用enum converter factory 則會使用enum value去轉換 <br>
>```shell
>curl -X GET http://localhost:8081/api/events/login
>```

---

> Select and convert the enum value by using the AttributeConverter
>```shell
>curl -X GET http://localhost:8081/api/events
>```

---

> 
> ```shell
> curl -X GET http://localhost:8081/api/jpql-events
> ```

---

> 
> Using Projection, it is necessary to customize the converter factory of ProxyProjectionFactory.
> ```shell
> curl -X GET http://localhost:8081/api/native-events
> ```


