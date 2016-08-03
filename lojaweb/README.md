# Exemplo de projeto web com JAVA
Alterar a versão do javax.servlet-api de 2.3 para 3.1.0
Altere a versão do JUnit para 4.12
    
Edite o arquivo src/main/webapp/WEB-INF/web.xml e altere o versão para web-app_3_1

Para usar o jetty add no mavem o jetty-maven-plugin
    LINK - http://www.eclipse.org/jetty/documentation/current/jetty-maven-plugin.html
    mvn jetty:run