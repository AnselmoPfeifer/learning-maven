# Licoes de mavem
## Criando um projeto com Maven
```
mvn archetype:generate -DartifactId=cursomaven -DgroupId=com.anselmo.cursomaven  -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
```
mvn archetype:generate -DartifactId=produtos -DgroupId=br.com.alura.maven -DinteractiveMode=false -DachetypeArtifactId=maven-archetype-quickstart
```      
## Observação: No Windows é necessário utilizar aspas duplas (" ") nos parâmetros -D:
```
mvn archetype:generate -D"artifactId=produtos" -D"groupId=br.com.alura.maven" -D"interactiveMode=false" -D"achetypeArtifactId=maven-archetype-quickstart"
```
    
- Ciclo de vida do maven: 
(OBS- na sequencia, ou seja para rodar um comando abaixo ele vai rodar antes seu comando antecessor.
exemplo, para rodar "mvn package" o maven vai rodar "mvn validate compile test package". 
```
1-validate, 
2-compile, 
3-test, 
4-package, 
5-integration-test, 
6-verify, 
7-install, 
8-deploy.
```
- Rodando um comando mvn sem test: 
```mvn -DskipTests=true package```
- Comilando o projeto: 
```mvn compile```
- Teste com maven: 
```mvn test```
- Generate Report: 
```
mvn surefire-report:report
mvn pmd:pmd
mvn pmd:check
mvn jacoco:report 
```
- Gerando um package:
```mvn package```
- Limpando o target: 
```mvn clean```
- Concatenar Goal: 
```mvn clean package install```
- Executando maven off line: 
```mvn -o <command>```

- Executando um package jar: java -cp target/cursomaven-1.0-SNAPSHOT.jar com.anselmo.cursomaven.App
	
- Endereco do Rempositorio central do maven: repo.maven.apache.org/maven2 / mvnrepository.com                
    
- Referencia para o pom.xml: https://maven.apache.org/pom.html    
     
- Comando para atualizar todas as dependencias do pom.xml para a versao, mais recente do repositorio maven: 
```
mvn versions:use-latest-versions
```


Plugins: 
Coverage plugin - http://eclemma.org/jacoco/trunk/doc/maven.html
PMD Plugin - https://maven.apache.org/plugins/maven-pmd-plugin
MVN -Last Version - http://www.mojohaus.org/versions-maven-plugin

http://www.mojohaus.org/versions-maven-plugin
