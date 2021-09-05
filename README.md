# Hibernate
- ORM is the principle where real world objects are mapped to table in db
- JPA is the specification that provides certain functionality and standard to ORM 
- Hibernate is a Java framework that simplifies the development of Java application to interact with the database
- Hibernate architecture includes java application,Hibernate framework layer(Persistence Object,Session,session factory),Backhand api layer(JNDI,JDBC,JTA) & Database layer
- Native way include creating model class,hibernate configuration xml,hibernate mapping xml
- Annotation way include creating hibernate configuration file,model class with table & column mapping 
- Hibernate Caching first level cache is turned on default and second level cache has to be turned on explicitly via xml or annotation
- Hibernate lifecycle - Transient->Persistent->Detached  Detached->Persistent->Transient
