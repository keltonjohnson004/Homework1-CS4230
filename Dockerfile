FROM tomcat:9

ADD target/ROOT.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

WORKDIR /user/local/tomcat/bin

CMD ["catalina.sh", "run"]
