# 📐 Arquitectura de Software Orientada a Objetos (ISWZ2202)

**Autor del Proyecto:** Anthonny Mosquera

## 💡 Propósito Central
El principal objetivo de este ejercicio fue consolidar los fundamentos de la **metodología de Diseño Orientado a Objetos (DOO)**. [cite_start]Esto se logró a través de la aplicación práctica de sus principios esenciales en la construcción de un sistema para modelar y gestionar diferentes formas geométricas. [cite: 12]

## 📋 Resumen del Desarrollo
[cite_start]Este proyecto se centró en la creación de un modelo para diversas formas geométricas bidimensionales (Círculo, Rectángulo y Triángulo). [cite: 6] [cite_start]El enfoque principal fue asegurar una implementación robusta que demostrara el dominio de la POO. [cite: 12]

El proceso de diseño requirió:
* [cite_start]Definición de interfaces claras y métodos compartidos entre las figuras. [cite: 7]
* [cite_start]Establecimiento de una jerarquía de clases bien estructurada. [cite: 8]
* [cite_start]Aplicación rigurosa de los pilares de la POO: **herencia, polimorfismo y abstracción**. [cite: 9]
* [cite_start]Documentación exhaustiva mediante un diagrama de clases y la especificación de las historias de la aplicación. [cite: 10]

---

## 🛠️ Entorno y Enfoque Tecnológico
[cite_start]El desarrollo se llevó a cabo en **Java**, constituyendo la etapa inicial de una práctica más amplia sobre la Reflexión y máquinas de interpretación. [cite: 14]

[cite_start]La funcionalidad clave del sistema es su capacidad de **crear instancias de objetos dinámicamente** durante la ejecución. [cite: 15] [cite_start]La aplicación recibe el nombre de una clase de figura y sus parámetros correspondientes, y utiliza la **Reflexión** para generar el objeto de forma programática. [cite: 15]

### Componentes de Interacción
* [cite_start]**Cliente REST/Usuario:** Inicia la interacción enviando peticiones HTTP (solicitudes) para solicitar el cálculo del área o el perímetro de una figura. [cite: 17]
* [cite_start]**API del Sistema (Spring Boot):** Es el módulo central que recibe la data, gestiona la creación dinámica de la instancia de la figura solicitada y retorna los resultados al cliente. [cite: 18]

---

## 🗣️ Perspectiva del Usuario (Historia de Aplicación)

**Narrativa Clave:**
[cite_start]"Como estudiante de Ingeniería de Software, quiero un **servicio web** funcional que permita calcular el área y perímetro de formas básicas. para dominar la implementación de la **Reflexión en Java**." [cite: 20]

---

## 📊 Diseño de la Arquitectura (UML)

La estructura del sistema, siguiendo el paradigma Orientado a Objetos, se visualiza en el siguiente diagrama de clases:

![Diagrama de Clases UML](diagrama%20arquitectura.png)

**Elementos Notables del Modelo:**
* [cite_start]**IShape** ($\langle\langle I \rangle\rangle$): Define el contrato esencial para cualquier forma geométrica, incluyendo operaciones de movimiento, cálculo de área y perímetro. [cite: 23, 24, 25, 26, 27]
* [cite_start]**Shape** ($\langle\langle A \rangle\rangle$): Clase base abstracta que centraliza atributos comunes (como `id` y `position`) y métodos genéricos de manipulación para las figuras concretas. [cite: 28, 29, 30, 31, 32, 33, 34, 35, 36, 37]
* [cite_start]**Clases de Figuras:** Implementaciones específicas para `Circle`, `Rectangle` y `Triangle`, heredando de `Shape`. [cite: 46, 48, 53]
* [cite_start]**GroupShape:** Implementa el patrón compuesto para gestionar colecciones de objetos `IShape` como si fueran una sola entidad. [cite: 38]

---

## ✔️ Balance del Aprendizaje
[cite_start]El proyecto ha sido un vehículo eficaz para poner en práctica los pilares de la programación orientada a objetos (herencia, polimorfismo y abstracción). [cite: 22] [cite_start]Se logró demostrar con éxito la capacidad de crear e instanciar objetos de manera dinámica dentro de un entorno de servicio REST, lo cual sirvió para consolidar el conocimiento sobre el uso de la **Reflexión en Java** en un entorno aplicado. [cite: 22]

---
