<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="shipbean" class="com.javatpoint.Ship">
        <property name="name" value="YourShipName"/>
        <property name="originalName" value="YourOriginalShipName"/>
        <property name="port" value="YourPort"/>
        <property name="depth" value="YourDepth"/>
        <property name="speed" value="YourSpeed"/>
        <property name="power" value="YourPower"/>
    </bean>

</beans>
