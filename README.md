
# Pizza-Track 🍕
> **Sistema de simulación y gestión de pedidos para pizzería.**
> Proyecto individual desarrollado en Java implementando estructuras de datos lineales (pilas) de forma manual.

---

## 🎯 Objetivo del Proyecto
Desarrollar una aplicación de consola que gestione el flujo de pedidos de una pizzería mediante el patrón **Undo/Redo (Deshacer/Rehacer)**. Toda la lógica operativa está fundamentada en el uso de **dos pilas dinámicas manuales** basadas en nodos y listas ligadas simples, prohibiendo el uso de la librería estándar `java.util.Stack`.

---

## 🛠️ Instrucciones de Uso y Ejecución

### Requisitos Previos
* Tener instalado el **JDK (Java Development Kit)** versión 8 o superior.
* Una terminal de comandos (CMD, PowerShell, Git Bash o la terminal integrada de VS Code).

### Pasos para Ejecutar:
1. **Navegar a la carpeta del proyecto:**
   ```bash
   cd Pizza-Track/src
   ```
2. **Compilar todas las clases de forma simultánea:**
   ```bash
   javac *.java
   ```
3. **Iniciar la aplicación de control principal:**
   ```bash
   java GestionPedidos
   ```

---

## 📸 Evidencias de Ejecución (Capturas de Pantalla)

### 🖥️ Menú Principal del Sistema
Al iniciar la aplicación, se despliega un menú interactivo en consola con control de excepciones numéricas.

<p align="left">
<img width="498" height="289" alt="image" src="https://github.com/user-attachments/assets/37d0dabe-fd9c-46b7-89cf-7a84e379607b" />
<img width="572" height="159" alt="image" src="https://github.com/user-attachments/assets/bd7c9fb7-b348-4dc5-b22b-a0d85a69587b" />
<img width="436" height="163" alt="image" src="https://github.com/user-attachments/assets/51a4461e-f9f4-4759-8a06-bd41ba136711" />
<img width="593" height="244" alt="image" src="https://github.com/user-attachments/assets/bc88fcff-4502-4c77-9999-0c7d137a331b" />
<img width="747" height="171" alt="image" src="https://github.com/user-attachments/assets/06291f9e-a56b-4448-902a-53be584d7d16" />
</p>




**Menú Principal Pizza-Track.**


* **Opciones disponibles:** Permite interactuar secuencialmente a través de números enteros (`1`, `2`, `3`, `4`, `0`).

---

### 📝 Ciclo Completo: Registro de Pedidos
El sistema solicita un nombre único para la pizza y obliga al usuario a ingresar un arreglo de tamaño fijo con exactamente **3 ingredientes**.


**Registro de pedidos en terminal.**


* **Flujo Operacional del Sistema:** 
  * `Opción 1`: Registra la pizza e invoca el método `push()` en la Pila Principal (vaciando automáticamente la Pila Secundaria).
  * `Opción 2 (Undo)`: Realiza un `pop()` de la Pila Principal y lo mueve con un `push()` a la Pila Secundaria.
  * `Opción 3 (Redo)`: Extrae con `pop()` el último elemento deshecho de la Pila Secundaria y lo reinserta en la Pila Principal.

---

## 🎥 Sustentación Individual (Video Explicativo)

Acá puedes encontrar el enlace al video con la sustentación técnica del proyecto (Duración máxima: 3 minutos):

▶️ **[Haz clic aquí para ver el Video de Sustentación](PON_AQUÍ_EL_ENLACE_DE_TU_VIDEO)**

*En el video se incluye la presentación formal, la explicación detallada de la lógica de punteros para los métodos `push()` / `pop()`, y la demostración en vivo del ciclo completo de datos.*






