
==============================
PROYECTO FINAL - SISTEMA DE GESTIÓN DE EVENTOS
==============================

📌 DESCRIPCIÓN GENERAL
Este proyecto es un sistema completo para la gestión de eventos y compra de entradas. Utiliza múltiples patrones de diseño para garantizar escalabilidad, organización modular y flexibilidad. Desarrollado en Java, organizado en paquetes temáticos, y listo para ser usado en entornos como NetBeans o Eclipse.

🚀 FUNCIONALIDADES PRINCIPALES
- Registro de usuarios asistentes y organizadores
- Creación y gestión de eventos
- Compra de entradas con validaciones, descuentos y reembolsos
- Recomendación de eventos personalizados
- Sistema de notificaciones
- Composición de lugares y secciones
- Control de acceso a recursos multimedia

🧠 PATRONES DE DISEÑO UTILIZADOS
- Singleton: SistemaNotificaciones
- Observer: Usuarios como observadores de eventos
- Strategy: Recomendaciones configurables
- Command: Compras, reembolsos, cancelaciones reversibles
- Decorator: Tipos de entradas enriquecidas (descuento, merchandising)
- State: Estados de los eventos
- Proxy: Control de acceso a multimedia
- Builder: Creación flexible de eventos
- Template Method: Proceso de compra estandarizado
- Chain of Responsibility: Validaciones encadenadas
- Mediator: Coordinación entre usuarios, notificaciones y compras
- Composite: Lugar compuesto por secciones y asientos
- Factory: Creación de tipos de entrada

📁 ESTRUCTURA DE PAQUETES

- modelo.usuario → Usuarios, observadores, asistentes y organizadores
- modelo.evento → Eventos, estados, builders y directores
- modelo.entrada → Entradas, tipos y decoradores
- modelo.compra → Compra, estado, métodos de pago
- modelo.comando → Comandos de acción y reversión
- modelo.reembolso → Procesador de reembolsos
- modelo.recomendacion → Estrategias de recomendación
- modelo.multimedia → Recursos multimedia y control de acceso
- modelo.validacion → Validaciones en cadena
- modelo.mediador → Mediador de compras y coordinación
- modelo.factory → Fábricas de tipos de entrada
- modelo.template → ProcesoCompraTemplate y su implementación
- modelo.lugar → Lugar, secciones y asientos

🛠 REQUISITOS
- Java 11 o superior
- NetBeans, Eclipse o IDE compatible
- Compilador javac

🎯 CÓMO COMPILAR
1. Importa la carpeta `src/` en tu IDE
2. Asegúrate de tener configurado Java 11+
3. Compila y ejecuta desde tus controladores principales (a definir)
4. Extiende el sistema agregando interfaces gráficas o REST

👨‍💻 NOTA
Este sistema está diseñado con fines educativos y puede ser fácilmente ampliado para aplicaciones reales, conectándolo con bases de datos, interfaces gráficas (Swing, JavaFX) o servicios web (Spring Boot).

¡Gracias por revisar este proyecto!
