# --Resumen del proyecto--


El proyecto se basa en diseñar y crear un programa para la gestion de pedidos de una empresa.
Se deben gestionar productos que se dividen en varios tipos, se aplica herencia, existe un registro de clientes, gestión de pedidos.
También se calcula el importe total (Teniendo en cuenta IVA y coste de envios).
Y finalmente se mostrará por pantalla un resumen del pedido.

***

# --Instrucciones de Uso--
## Requisitos Previos
Antes de ejecutar el sistema, asegúrate de tener instalado:
- Java JDK 8 o superior
- Un IDE de Java

## Instalación
1. Clonar el repositorio
    - git clone https://github.com/Alerb25/Sistema_GestionPedidos.git
2. Abrir el proyecto en tu IDE
3. Ejecutar el Main.java

## Guía De Usuario
1. Gestión de Productos
El sistema maneja diferentes tipos de productos organizados mediante herencia:

- Agregar productos: Registra nuevos productos especificando su tipo, nombre, precio base y características específicas
- Consultar productos: Visualiza el catálogo completo con todos los detalles
- Actualizar productos: Modifica información de productos existentes
- Eliminar productos: Retira productos del catálogo

2. Gestión de Clientes
Mantén un registro actualizado de tus clientes:

- Registrar cliente: Añade nuevos clientes con su información de contacto y datos fiscales
- Actualizar datos: Modifica la información de clientes existentes

3. Gestión de Pedidos
Crea y administra pedidos de forma completa:
 --Crear un Nuevo Pedido--

1. Selecciona el cliente o registra uno nuevo
2. Añade productos al pedido desde el catálogo
3. Especifica cantidades para cada producto
4. El sistema calculará automáticamente:
    - Subtotal de productos
    - Descuentos aplicables (si corresponde)
    - IVA según la legislación vigente
    - Costes de envío
    - Total final del pedido
 --Modificar Pedidos--
- Actualiza cantidades de productos
- Añade o elimina productos del pedido
- El sistema recalculará automáticamente todos los importes

4. Resumen del Pedido
Al finalizar cada pedido, el sistema mostrará por pantalla un resumen detallado que incluye:

- Información del cliente
- Lista de productos con cantidades y precios
- Importe total a pagar


