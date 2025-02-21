from openjdk:17

copy target/SpringRestApp.jar /usr/app/

WORKDIR /usr/app/

ENTRYPOINT [ "java","-jar","SpringRestApp.jar" ]
