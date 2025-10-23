# 📐 Arquitectura de Software Orientada a Objetos (ISWZ2202)

**Autor del Proyecto:** Anthonny Mosquera

## 💡 Propósito Central
El principal objetivo de este ejercicio fue consolidar los fundamentos de la **metodología de Diseño Orientado a Objetos (DOO)**. Esto se logró a través de la aplicación práctica de sus principios esenciales en la construcción de un sistema para modelar y gestionar diferentes formas geométricas.

## 📋 Resumen del Desarrollo
Este proyecto se centró en la creación de un modelo para diversas formas geométricas bidimensionales (Círculo, Rectángulo y Triángulo). El enfoque principal fue asegurar una implementación robusta que demostrara el dominio de la POO.

El proceso de diseño requirió:
* Definición de interfaces claras y métodos compartidos entre las figuras.
* Establecimiento de una jerarquía de clases bien estructurada.
* Aplicación rigurosa de los pilares de la POO: **herencia, polimorfismo y abstracción**.
* Documentación exhaustiva mediante un diagrama de clases y la especificación de las historias de la aplicación.

---

## 🛠️ Entorno y Enfoque Tecnológico
El desarrollo se llevó a cabo en **Java**, constituyendo la etapa inicial de una práctica más amplia sobre la Reflexión y máquinas de interpretación.

La funcionalidad clave del sistema es su capacidad de **crear instancias de objetos dinámicamente** durante la ejecución. La aplicación recibe el nombre de una clase de figura y sus parámetros correspondientes, y utiliza la **Reflexión** para generar el objeto de forma programática.

### Componentes de Interacción
* **Cliente REST/Usuario:** Inicia la interacción enviando peticiones HTTP (solicitudes) para solicitar el cálculo del área o el perímetro de una figura.
* **API del Sistema (Spring Boot):** Es el módulo central que recibe la data, gestiona la creación dinámica de la instancia de la figura solicitada y retorna los resultados al cliente.

---

## 🗣️ Perspectiva del Usuario (Historia de Aplicación)

**Narrativa Clave:**
"Como estudiante de Ingeniería de Software, quiero un **servicio web** funcional que permita calcular el área y perímetro de formas básicas. para dominar la implementación de la **Reflexión en Java**."

---

## 📊 Diseño de la Arquitectura (UML)

La estructura del sistema, siguiendo el paradigma Orientado a Objetos, se visualiza en el siguiente diagrama de clases:

![Diagrama de Clases UML](diagrama%20arquitectura.png)

**Elementos Notables del Modelo:**
* **IShape** ($\langle\langle I \rangle\rangle$): Define el contrato esencial para cualquier forma geométrica, incluyendo operaciones de movimiento, cálculo de área y perímetro.
* **Shape** ($\langle\langle A \rangle\rangle$): Clase base abstracta que centraliza atributos comunes (como `id` y `position`) y métodos genéricos de manipulación para las figuras concretas.
* **Clases de Figuras:** Implementaciones específicas para `Circle`, `Rectangle` y `Triangle`, heredando de `Shape`.
* **GroupShape:** Implementa el patrón compuesto para gestionar colecciones de objetos `IShape` como si fueran una sola entidad.

---

## ✔️ Balance del Aprendizaje
El proyecto ha sido un vehículo eficaz para poner en práctica los pilares de la programación orientada a objetos (herencia, polimorfismo y abstracción). Se logró demostrar con éxito la capacidad de crear e instanciar objetos de manera dinámica dentro de un entorno de servicio REST, lo cual sirvió para consolidar el conocimiento sobre el uso de la **Reflexión en Java** en un entorno aplicado.

---
