
# 🎟️ Proyecto Final - Sistema de Gestión de Eventos

Este proyecto es una plataforma completa para la gestión de eventos, venta de entradas, recomendaciones personalizadas y control de recursos. Implementado en Java utilizando múltiples patrones de diseño de software.

---

## 🚀 Funcionalidades Principales

- Registro de usuarios (asistentes y organizadores)
- Creación y gestión de eventos
- Compra de entradas con descuentos y validaciones
- Sistema de reembolsos y cancelaciones
- Recomendaciones personalizadas según historial o popularidad
- Sistema de notificaciones
- Control de acceso a recursos multimedia
- Composición de lugares, secciones y asientos

---

## 🧠 Patrones de Diseño Implementados

| Patrón | Uso |
|--------|-----|
| Singleton | Sistema de notificaciones |
| Observer | Usuarios observan cambios en eventos |
| Strategy | Recomendaciones configurables |
| Command | Acciones como compras y reembolsos reversibles |
| Decorator | Entradas con descuentos o merchandising |
| State | Estados de un evento (publicado, cancelado, etc.) |
| Proxy | Acceso a recursos multimedia |
| Builder | Construcción flexible de eventos |
| Template Method | Proceso de compra paso a paso |
| Chain of Responsibility | Validaciones encadenadas |
| Mediator | Coordinación entre subsistemas |
| Composite | Lugares con secciones y asientos |
| Factory | Creación de tipos de entrada |

---

## 📁 Estructura del Proyecto

```
src/
├── modelo/
│   ├── usuario/
│   ├── evento/
│   ├── entrada/
│   ├── compra/
│   ├── comando/
│   ├── reembolso/
│   ├── recomendacion/
│   ├── multimedia/
│   ├── validacion/
│   ├── mediador/
│   ├── factory/
│   ├── template/
│   └── lugar/
```

---

## ⚙️ Requisitos

- Java 11+
- IDE como NetBeans o Eclipse
- JDK configurado para compilar

---

## 🧪 Cómo Ejecutar

1. Clona este repositorio o descomprime el ZIP
2. Importa el proyecto en tu IDE
3. Asegúrate de que Java esté configurado (Java 11+)
4. Crea una clase de prueba para ejecutar lógica específica (por ejemplo: simulador de compra)

---

## 💡 Créditos

Desarrollado como entrega final de proyecto universitario.  
Incluye patrones, buenas prácticas y organización modular.

---

¡Gracias por revisar este proyecto!
