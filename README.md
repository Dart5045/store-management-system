# Implementación de Microservicios con Spring Boot

## Spring Cloud Eureka Server
El concepto de Spring Cloud Eureka Server y sus capacidades de Discovery es una de las características principales de Spring Cloud a la hora de gestionar el registro y búsqueda de MicroServicios. Cuando tenemos varios MicroServicios es muy común querer invocar de unos a otros.

## Spring Cloud Gateway
Spring Cloud Gateway también conocido como puerta de enlace o Edge. Es un servidor de enrutamiento dinámico. En otras palabras, nos permite tener un punto de acceso centralizado a nuestros Microservicios. Además, podemos extender su funcionalidad agregando filtros o predicados, entre otras cosas.

## Spring Cloud Config Server
Es un componente de Spring Cloud que facilita la centralización de configuración de un Sistema distribuido. En palabras más simples nos permite tener la configuración de nuestros servicios en un solo lugar.

**Que soluciona**

En una arquitectura basada en Microservicios tenemos varias piezas de software que muy probablemente requieran la misma configuración en cada uno de ellos. Para no escribir la misma configuración en cada uno de ellos podemos usar Spring Cloud Config Server y centralizar nuestra configuración en un solo lugar.

## Vault
Es una plataforma de HashiCorp, que nos va a permitir guardar secretos, configuraciones, passwords etc, de manera segura, es decir, todo dato sensible será guardado en vault. 

## RabbitMQ
Es un software de código abierto, distribuido y escalable agente de mensajería que sirve de intermediario para una comunicación eficiente entre productores y consumidores.