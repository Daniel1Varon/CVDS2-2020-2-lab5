# Laboratorio 5 CVDS
# Introducción a proyectos Web

## Sebastian Camilo Villamarin Rodriguez
## Daniel Alejandro Varón Rojas


### Parte I. - Jugando a ser un cliente HTTP

Al ingresar el comando nos genera un error el cual se ve en la imagen que se muestra y significa que el servidor no procesará la solicitud, porque no puede, o no debe, debido a algo que es percibido como un error del cliente.
![Imagen](https://github.com/Daniel1Varon/CVDS2-2020-2-lab5/blob/master/Imagenes%20Error/Error%20GET.PNG?raw=true)

Existen 5 categorias de codigos los cuales se definen por la centesima del numero, cada uno con su respectivo significado como se muestra acontinuación:

1. **1xx: Respuestas informativas:**  Esta respuesta significa que el servidor ha recibido los encabezados de la petición, y que el cliente debería proceder a enviar el cuerpo de la misma.

2. **2xx: Peticiones correctas** Esta clase de código de estado indica que la petición fue recibida correctamente, entendida y aceptada.

3. **3xx: Redirecciones** Esta clase de código de estado indica que una acción subsecuente necesita efectuarse por el agente de usuario para completar la petición.

4. **4xx: Errores del cliente** La intención de la clase de códigos de respuesta 4xx es para casos en los cuales el cliente parece haber errado la petición. Excepto cuando se responde a una petición HEAD, el servidor debe incluir una entidad que contenga una explicación a la situación de error, y si es una condición temporal o permanente.

5. **5xx: Errores de servidor** Los códigos de respuesta que comienzan con el dígito "5" indican casos en los cuales el servidor tiene registrado aún antes de servir la solicitud, que está errado o es incapaz de ejecutar la petición. Excepto cuando está respondiendo a un método HEAD, el servidor debe incluir una entidad que contenga una explicación de la situación de error, y si es una condición temporal o permanente.

