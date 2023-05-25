#language: es

  Característica: Registrar un usuario de forma exitosa

    Antecedentes:
      Dado que el usuario abra el navegador en la url

    Escenario: Registro exitoso de usuario
      Cuando el usuario de click en el icono de usuario
      Y de click en registrarte
      Y de click en Ingresar a Haceb
      Y ingrese los datos correspondientes
      Y de click en He leido y acepto los terminos y condiciones
      Y de click en Si autorizo
      Y de click en Registrarme
      Y ingrese los datos obligatorios
      Y de click en Enviar
      Entonces puede visualizar el correo con el que se registro
