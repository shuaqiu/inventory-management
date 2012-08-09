inventory-management
====================

###startup

1. should add the following option to the JVM argument
  >*-javaagent:/path/to/spring-instrument-3.1.1.RELEASE.jar*

2. if want to debug, should also add
  >*-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=4000,server=y,suspend=n*
