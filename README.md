# Clon de perfil de Instagram con Kotlin y Jetpack Compose

<img src="https://github.com/jamirou/InstagramApp/assets/48457084/ece82091-f3c0-424d-a729-35537c8fa0d4" width="300" height="600" alt="Screenshot_1694637404">



## Funcionalidades Principales

- **Lazy Grid:** Implementacion de lazygrid para mostrar elementos de manera eficiente y scroleable.

- **Uso de Weight en Compose:** uso la propiedad `weight` para controlar el espacio y el diseño en la interfaz de usuario.

- **Encabezado Fijo al Desplazarse:** vemos cómo mantener el encabezado fijo mientras se desplaza por la página.

- **Obtencion de imagenes de internet utilizando coil:** En este proyecto de clonación de Instagram con Kotlin y Jetpack Compose,
  una de las funcionalidades clave es la obtención de imágenes de Internet para mostrarlas en la interfaz de usuario. Esto es fundamental
  para mostrar imágenes de perfil de usuario, publicaciones y otras imágenes relacionadas con la aplicación.
```
// Ejemplo de uso de Coil para cargar una imagen de Internet en un componente de Jetpack Compose
AsyncImage(
    model = "https://ejemplo.com/imagen.jpg",  // URL de la imagen en Internet
    contentDescription = null,
    modifier = Modifier.size(100.dp).clip(CircleShape)  // Modificador para establecer el tamaño y forma de la imagen
)
```
En este ejemplo, AsyncImage es un componente de Jetpack Compose que se utiliza para cargar imágenes de manera asíncrona. 
Se le proporciona la URL de la imagen que deseas cargar (model) y se puede configurar su tamaño y forma utilizando el modificador Modifier. 
La imagen se muestra en la forma de círculo debido a CircleShape.
- **Beneficios:**
Eficiencia: Coil se encarga de la gestión eficiente de la memoria y la caché, lo que garantiza un rendimiento óptimo al cargar imágenes de Internet.

Facilidad de Uso: El código para cargar imágenes con Coil es simple y se integra perfectamente con Jetpack Compose.

Compatibilidad: Coil es compatible con varios tipos de recursos, incluidas las URL de imágenes en Internet, por lo que es adecuado para cargar imágenes de diversas fuentes.
