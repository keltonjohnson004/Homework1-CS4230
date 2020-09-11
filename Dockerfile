FROM tomcat:9

COPY target/ROOT.war /user/local/tomcat/webapps/ROOT.war

expose 8080

WORKDIR /user/local/tomcat/bin

CMD ["catalina.sh", "run"]
