# jazz-robots
Jazz robots task management

In common there's main task management mechanism
without status and resolving collisions, cause of some life issues)

Also i've implemented spring cloud stack, but i did not separate big-brother
monolith stuff into micro services, cause of the same issues, that decrease my
developing time. It's a pity, but there's no Zuul Api Gateway.

Also i did not write ui part and did not deploy it in some cloud platform,
such as Google Cloud, Open Shift, Amazon or IBM Cloud.

### Env Prerequisites:
``` bash
✗ java -version
java version "1.8.0_152"
Java(TM) SE Runtime Environment (build 1.8.0_152-b16)
Java HotSpot(TM) 64-Bit Server VM (build 25.152-b16, mixed mode)

✗ kotlin -version
Kotlin version 1.2.0 (JRE 1.8.0_152-b16)

✗ mvn -v
Apache Maven 3.5.0 (ff8f5e7444045639af65f6095c62210b5713f426; 2017-04-03T22:39:06+03:00)
Maven home: /Users/solairerove/.sdkman/candidates/maven/current
Java version: 1.8.0_152, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_152.jdk/Contents/Home/jre
Default locale: en_BY, platform encoding: UTF-8
OS name: "mac os x", version: "10.13.1", arch: "x86_64", family: "mac"

✗ docker -v
Docker version 17.09.0-ce, build afdb6d4

✗ docker-compose -v
docker-compose version 1.16.1, build 6d1ac21
```

### Hosts:

* `http://localhost:8761/` - Eureka
* `http://localhost:8001/big-brother/docker` - Big Brother docker profile properties
from Config Server
* `http://localhost:8003/greeting` - Simple Greeting with Hystrix, Feign, Ribbon and Cloud Bus
as future platform web. Here's as proptotype
* `http://localhost:8003/api/v1/tasks` - Big Brother task management prototype.
