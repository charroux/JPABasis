JPABasis
========

Maven + Eclipse + JPA with Eclipse Link and HSQLDB

HSQLDB Data base setup :
- download and uncompress hsqldb from hsqldb.org
- version hsqldb_1_8_1_3 is used
- start the data base server with this command line (into the lib directory of HSQLDB) : java -cp hsqldb.jar org.hsqldb.Server
- ask Maven to solve dependencies
- mvn eclipse:eclipse -Dwtpversion=2.0
- run the main class : App
