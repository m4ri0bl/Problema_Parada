# 🛑 Simulación del Problema de Parar de Turing en Java 🚀

## 🧠 ¿Qué es este proyecto? 

¡Bienvenido al fascinante mundo de los límites computacionales! Este proyecto juega con la famosa paradoja de Alan Turing, explorando de forma práctica y divertida qué programas pueden (o no pueden) decidir si otros programas terminarán algún día.

**Creado con ❤️ por Iker, Ali y Mario**

## ✨ Características principales

- 🔄 Simulación de programas que terminan vs programas infinitos
- 🔍 Implementación conceptual del HaltChecker
- 🔀 Demostración de la paradoja con el Reverser
- 🎮 Interfaz sencilla para experimentar con el concepto

## 🗂️ Organización del código

```
src/
├── main/java/com/haltingproblem/
│   ├── model/          # 📦 Los programas base
│   ├── haltchecker/    # 🔎 El detector de parada
│   ├── reverser/       # 🔄 El creador de paradojas
│   └── Main.java       # 🚀 Punto de inicio
```

## 🧩 Componentes clave

### 🟢 HaltingProgram
```java
// Este sí que termina - cuenta atrás hasta cero
public void run() {
    int contador = valorInicial;
    while (contador > 0) {
        System.out.println(contador);
        contador--;
    }
}
```

### 🔄 NonHaltingProgram
```java
// Este va al infinito y más allá
public void run() {
    int contador = valorInicial;
    while (true) {
        System.out.println(contador);
        contador++;
    }
}
```

### 🧙‍♂️ Reverser - ¡La magia está aquí!
```java
// Aquí está la paradoja
public void run() {
    if (HaltChecker.willHalt(program)) {
        while (true) System.out.println("¡Bucle infinito!");
    } else {
        System.out.println("¡Me detengo!");
    }
}
```

## 🚀 Cómo ejecutarlo

### 📋 Requisitos
- Java 22+
- Maven

### 🏃‍♂️ Pasos
1. Clona este repositorio:
   ```
   https://github.com/m4ri0bl/Problema_Parada
   ```

2. Ejecuta:
   ```
   mvn clean install
   mvn exec:java -Dexec.mainClass="com.haltingproblem.Main"
   ```

## 🎯 ¿Por qué usamos el patrón Builder?

Elegimos el patrón Builder por estas razones:

- 🧱 Construye objetos paso a paso
- 🔧 Facilita la configuración con opciones
- 📝 Código más limpio y legible
- ✅ Validación centralizada
- 🔄 Fácil de adaptar a cambios futuros

## 👨‍💻 Desarrolladores
- Iker
- Ali
- Mario

---
⭐ ¡Experimenta con los límites de la computación y diviértete con las paradojas!
