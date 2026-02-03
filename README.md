# Mi Primera App - Android Kotlin (RA1)

[cite_start]Este proyecto es una aplicación Android desarrollada en **Kotlin** como parte del taller de primeros pasos en Android Studio para el módulo **PMD**[cite: 4]. [cite_start]El objetivo principal es demostrar el manejo de múltiples actividades, navegación con intents y el cumplimiento de los requisitos técnicos exigidos en la Actividad Específica Evaluable (AEE)[cite: 51, 70].

## 🚀 Características y Requisitos
[cite_start]La aplicación consta de **5 Activities**[cite: 70]:

1.  **Activity 1: Login**: 
    * [cite_start]Posee campos para "Usuario" y "Contraseña"[cite: 76, 77].
    * [cite_start]Valida el acceso y navega a la Activity 2 pasando el nombre de usuario[cite: 78].
    * [cite_start]Utiliza el método `inflate` para cargar el layout[cite: 79].

2.  **Activity 2: Inicio**: 
    * [cite_start]Muestra un mensaje de bienvenida personalizado con el nombre recibido[cite: 81].
    * [cite_start]Contiene tres botones para navegar a Contacto, Sobre Nosotros y Localización[cite: 82, 83, 84, 85].
    * [cite_start]Implementa `inflate` en lugar de `setContentView(R.layout...)`[cite: 86, 87].

3.  **Activity 3: Contacto**: 
    * [cite_start]Formulario con campos de Nombre, Email y Mensaje[cite: 91, 92, 93].
    * [cite_start]Al enviar, los datos retornan a la Activity 2 para mostrarse en un TextView adicional[cite: 94, 95].
    * [cite_start]Carga el diseño mediante `inflate`[cite: 96].

4.  **Activity 4: Sobre Nosotros**: 
    * [cite_start]Pantalla con información estática sobre el equipo de desarrollo[cite: 98].
    * [cite_start]Carga el layout usando `inflate`[cite: 99].

5.  **Activity 5: Localización**: 
    * [cite_start]Simulación de un mapa o mensaje de ubicación estática[cite: 101].
    * [cite_start]Implementa el método `inflate` para el diseño[cite: 102].

## 🛠️ Detalles Técnicos y Desarrollo (70%)
* [cite_start]**Sintaxis**: Uso de Kotlin para la lógica de control[cite: 4, 70].
* [cite_start]**View Binding**: Se ha evitado el uso de `R.layout` directo en favor de `inflate`, cumpliendo con el objetivo pedagógico del anexo[cite: 70].
* [cite_start]**Comunicación**: Paso de valores entre pantallas mediante el uso de `Intent`[cite: 70].



## 📋 Documentación (20%)
* [cite_start]Todo el código fuente ha sido documentado con comentarios explicativos para facilitar la comprensión de la estructura y las clases utilizadas[cite: 17, 57].

## 📦 Entrega
* [cite_start]El proyecto se entrega comprimido en formato `.zip` con la nomenclatura: `Perez_Alvaro_.zip`[cite: 59].

---
[cite_start]**Profesor:** Carlos Basulto Pardo [cite: 3]  
[cite_start]**Centro:** Campus Cámara Comercio Sevilla [cite: 1]
