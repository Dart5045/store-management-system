# Implementación de Microservicios con Spring Boot

## Spring Cloud Eureka Server
El objetivo de Eureka Server es localizar y registrar servicios con los que se desea interactuar, además nos ayuda con el balanceo de carga y la tolerancia a fallos. Para configurar Eureka Server deben existir al menos dos tipos de aplicaciones, una aplicación que funcione como servidor y otra como cliente.
Contenido Ocultar

Cada servicio debe comunicarse con el Servidor Eureka para decirle que está disponible para ser usado. Eureka Server guardará su información y su estado. A esta comunicación entre el microservicio y Eureka se le llama heartbeats y ocurre cada 30 segundos. Si  3 heartbeats fallan Eureka Server lo elimina de la lista.

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