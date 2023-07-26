package org.example;

import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class WebApplicationServer {
    private static final Logger log = LoggerFactory.getLogger(WebApplicationServer.class);

    public static void main(String[] args) throws Exception{
        //루트 디렉토리 설정
        String webappDirLocation = "webapps/";
        Tomcat tomcat = new Tomcat();
        //포트 설정
        tomcat.setPort(8080);

        /*
         첫 번째 인자는 애플리케이션의 컨텍스트 경로를 지정하며, 두 번째 인자는 웹 애플리케이션의 디렉토리 위치를 절대 경로로 지정한다.
         즉 톰캣이 webapps/ 파일 밑으로 찾아서 실행시킨다.
         */
        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        log.info("configuring app with basedir: {}", new File("./" + webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }
}