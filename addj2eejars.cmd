REM Windows script for adding JTA jar

mvn install:install-file -DgroupId=javax.transaction -DartifactId=jta -Dversion=1.0.1B -Dpackaging=jar -Dfile=H:\cer\code\j2eeBook\workspace\3rdparty\spring-framework-1.2.3\lib\j2ee\jta.jar


