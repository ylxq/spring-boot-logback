# spring-boot-logback

spring boot 配置logback日志记录

1 控制台输出
2 文件数据
3 数据库输出


   控制台输出配置
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%-4relative [%thread] %-5level %logger{35} - %msg %n</pattern>
        </encoder>
    </appender>


文件输出配置
<appender name="FILE" class="ch.qos.logback.core.FileAppender">
        <file>D:/testFile.log</file>
        <encoder>
            <pattern>%logger{35} - %msg%n</pattern>
        </encoder>
    </appender>
  数据库输出配置mysql
  <appender name="DB" class="ch.qos.logback.classic.db.DBAppender">
        <connectionSource class="ch.qos.logback.core.db.DriverManagerConnectionSource">
            <driverClass>com.mysql.jdbc.Driver</driverClass>
            <url>jdbc:mysql://localhost:3306/study?useSSL=false</url>
            <user>root</user>
            <password>tiger</password>
        </connectionSource>
        <!--<insertHeaders>true</insertHeaders>-->
    </appender>

    <root level="info">
        <appender-ref ref="STDOUT" />
        <appender-ref ref="FILE" />
        <appender-ref ref="DB" />
    </root>
