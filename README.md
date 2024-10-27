
# Jetpack Compose Safe Navigation Guide

Welcome to the **Jetpack Compose Safe Navigation Guide** project. This project replicates the implementation of safe navigation types in Jetpack Compose, following best practices for Android development.

## Overview

This project is a demonstration of using **Safe Navigation Types** with **Jetpack Compose**, aimed at simplifying and securing navigation between screens. The project includes various features such as handling navigation between basic and complex screens, passing parameters securely, and cleaning up the navigation stack.

### Key Features
- **Safe Navigation with Types**: Leverage types to create clean and secure navigation routes.
- **Jetpack Compose Implementation**: Build screens and navigation using Jetpack Compose components.
- **Passing Parameters**: Securely pass simple and complex data between screens.
- **Back Navigation Management**: Properly handle the navigation stack to avoid clutter.

## Project Structure

```
📂 app/
 ┣ 📂 src/
 ┃ ┣ 📂 main/
 ┃ ┃ ┣ 📂 kotlin+java/com/dendroide/navigationguide/
 ┃ ┃ ┃ ┣ 📂 core/
 ┃ ┃ ┃ ┃ ┣ 📂 navigation/
 ┃ ┃ ┃ ┃ ┃ ┣ 📜 NavigationWrapper.kt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜 Screens.kt
 ┃ ┃ ┃ ┣ 📜 MainActivity.kt
 ┃ ┃ ┃ ┣ 📂 ui/
 ┃ ┃ ┃ ┃ ┣ 📜 LoginScreen.kt
 ┃ ┃ ┃ ┃ ┣ 📜 HomeScreen.kt
 ┃ ┃ ┃ ┃ ┣ 📜 DetailScreen.kt
 ┣ 📜 build.gradle
 ┣ 📜 settings.gradle
```

## Getting Started

### Prerequisites
- Android Studio (latest version recommended)
- Kotlin 1.9.0 or higher
- Jetpack Compose 1.4.0 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/jetpack-compose-navigation-guide.git
   ```
2. Open the project in Android Studio.
3. Sync the project with Gradle files to download the required dependencies.
4. Build and run the project on an emulator or physical device.

### Dependencies

Add the following dependencies in your `build.gradle` file:

```groovy
implementation "androidx.navigation:navigation-compose:2.8.2"
implementation "org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3"
```

### Project Details

#### Navigation Setup
The project uses a `NavigationWrapper` to encapsulate the navigation logic. It handles all the routes and interactions between screens while keeping the `MainActivity` clean.

#### Screen Organization
- **Login Screen**: Starting point for the navigation.
- **Home Screen**: Intermediate screen with options to navigate further.
- **Detail Screen**: Accepts parameters to showcase passing data between screens.

#### Safe Parameter Passing
We use Kotlin's `@Serializable` annotation to define screens as serializable objects and secure the passing of complex parameters between routes.

## Contributing

Feel free to contribute by forking the repository and creating pull requests. Suggestions and improvements are always welcome!

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for details.

## Acknowledgements

This project is inspired by the [video tutorial](https://www.youtube.com/watch?v=1OxiEaEWEe4) by Aris. Check out the original tutorial for more details and explanations.

---

# Guía de Navegación Segura en Jetpack Compose

Bienvenido al proyecto **Guía de Navegación Segura en Jetpack Compose**. Este proyecto replica la implementación de la navegación segura con tipos en Jetpack Compose, siguiendo las mejores prácticas para el desarrollo en Android.

## Descripción

Este proyecto es una demostración del uso de **tipos seguros de navegación** con **Jetpack Compose**, con el objetivo de simplificar y asegurar la navegación entre pantallas. El proyecto incluye varias características como el manejo de navegación entre pantallas básicas y complejas, el paso seguro de parámetros, y la gestión de la pila de navegación.

### Características Principales
- **Navegación segura con tipos**: Uso de tipos para crear rutas de navegación seguras y limpias.
- **Implementación con Jetpack Compose**: Construcción de pantallas y navegación utilizando componentes de Jetpack Compose.
- **Paso de parámetros**: Transferencia segura de datos simples y complejos entre pantallas.
- **Gestión de navegación hacia atrás**: Manejo adecuado de la pila de navegación para evitar acumulación.

## Estructura del Proyecto

```
📂 app/
 ┣ 📂 src/
 ┃ ┣ 📂 main/
 ┃ ┃ ┣ 📂 kotlin+java/com/dendroide/navigationguide/
 ┃ ┃ ┃ ┣ 📂 core/
 ┃ ┃ ┃ ┃ ┣ 📂 navigation/
 ┃ ┃ ┃ ┃ ┃ ┣ 📜 NavigationWrapper.kt
 ┃ ┃ ┃ ┃ ┃ ┣ 📜 Screens.kt
 ┃ ┃ ┃ ┣ 📜 MainActivity.kt
 ┃ ┃ ┃ ┣ 📂 ui/
 ┃ ┃ ┃ ┃ ┣ 📜 LoginScreen.kt
 ┃ ┃ ┃ ┃ ┣ 📜 HomeScreen.kt
 ┃ ┃ ┃ ┃ ┣ 📜 DetailScreen.kt
 ┣ 📜 build.gradle
 ┣ 📜 settings.gradle
```

## Primeros Pasos

### Requisitos Previos
- Android Studio (se recomienda la última versión)
- Kotlin 1.9.0 o superior
- Jetpack Compose 1.4.0 o superior

### Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/jetpack-compose-navigation-guide.git
   ```
2. Abre el proyecto en Android Studio.
3. Sincroniza el proyecto con los archivos de Gradle para descargar las dependencias necesarias.
4. Construye y ejecuta el proyecto en un emulador o dispositivo físico.

### Dependencias

Agrega las siguientes dependencias en tu archivo `build.gradle`:

```groovy
implementation "androidx.navigation:navigation-compose:2.8.2"
implementation "org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3"
```

### Detalles del Proyecto

#### Configuración de la Navegación
El proyecto utiliza un `NavigationWrapper` para encapsular la lógica de navegación. Se encarga de todas las rutas y las interacciones entre las pantallas, manteniendo limpia la `MainActivity`.

#### Organización de Pantallas
- **Pantalla de Inicio de Sesión**: Punto de inicio para la navegación.
- **Pantalla Principal (Home)**: Pantalla intermedia con opciones para navegar a otras vistas.
- **Pantalla de Detalles**: Acepta parámetros para mostrar el paso de datos entre pantallas.

#### Paso Seguro de Parámetros
Utilizamos la anotación `@Serializable` de Kotlin para definir pantallas como objetos serializables y pasar de forma segura parámetros complejos entre rutas.

## Contribuir

Siéntete libre de contribuir haciendo un fork del repositorio y creando pull requests. ¡Cualquier sugerencia y mejora será bienvenida!

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](./LICENSE) para más detalles.

## Agradecimientos

Este proyecto está inspirado en el [video tutorial](https://www.youtube.com/watch?v=1OxiEaEWEe4) de Aris. Consulta el tutorial original para obtener más detalles y explicaciones.
