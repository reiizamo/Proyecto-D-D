# 🎮 Proyecto: Personajes de Videojuego

<img src="https://nwamotherlode.com/wp-content/uploads/2014/07/frog-in-rocking-chair.gif" width=100/> Readme creado completamente con ia (me daba pereza :) )

## 📌 Descripción
Este proyecto consiste en el desarrollo de un sistema de personajes para un videojuego utilizando **Programación Orientada a Objetos (POO)**.  
Se implementan clases base y clases derivadas que representan distintos tipos de personajes, aplicando **herencia**, **encapsulación** y **métodos personalizados**.

## 🧱 Estructura del Proyecto

```
src/
├── modelo/
│ ├── Personaje.java
│ ├── Guerrero.java
│ └── Mago.java
│
└── app/
└── Main.java
```

## 👤 Clases del Proyecto

### 🔹 Personaje
Clase base del sistema.

**Atributos:**
- `nombre`
- `nivel`
- `energia` (inicial = 100)
- `static totalPersonajes`

**Métodos:**
- `entrenar(int x)`
- `descansar(int x)`
- `gastarEnergia(int x)`
- `mostrarInfo()`
- `static mostrarTotalPersonajes()`

### ⚔️ Guerrero (Hereda de Personaje)
**Atributos:**
- `arma`

**Métodos:**
- `ataquePesado()` → Reduce energía en 15  
- `mostrarInfo()` (sobrescrito)

### 🧙 Mago (Hereda de Personaje)
**Atributos:**
- `elemento`

**Métodos:**
- `ataqueElemental()` → Reduce energía en 25  
- `mostrarInfo()` (sobrescrito)
