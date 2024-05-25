
# Conversor de moneda

![Badge en Desarollo](https://img.shields.io/badge/STATUS-EN%20DESAROLLO-green)

Es una aplicación de consola en Java que consume una API de tasas de cambio para realizar conversiones entre divisas.

## Características

- Conversión de divisas en tiempo real
- Soporte para múltiples divisas
- Interfaz de usuario simple basada en consola

## Requisitos
- [Java JDK 19 o superior](https://www.oracle.com/java/technologies/javase-downloads.html)

## Instalación

1. Clona este repositorio en tu máquina local:

    ```sh
    git clone https://github.com/BFeeer/ConversorMoneda.git
    cd ConversorMoneda
    ```

2. Asegúrate de que las dependencias estén instaladas. Puedes hacerlo de forma manual o con algun gestor de paquetes como maven.


3. Obtén una clave de API para el servicio de conversión de divisas. Utiliza el servicio [ExchangeRate-API](https://www.exchangerate-api.com/).

4. Reemplaza la constante KEY de la clase Petición por la clave de API obtenida del servicio de conversión de divisas.

## Uso

1. Ejecuta la aplicación.
2. Sigue las instrucciones que se muestran en consola.

## Ejemplo

```sh
Monto: 100
De (Código de la divisa de entrada, por ejemplo USD): USD
A (Código de la divisa de salida, por ejemplo EUR): EUR
100 USD = 85 EUR