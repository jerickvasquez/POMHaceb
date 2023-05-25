#language: es

  Característica: Agregar un producto de forma exitosa al carrito de compras

    Antecedentes:
      Dado que el usuario abra el navegador en la url

    Escenario: Agregar un producto de forma exitosa al carrito de compras
      Cuando el usuario de click en el menú categorias
      Y seleccione una categoría y de click en una subcategoria
      Y seleccione un producto
      Y de click en comprar
      Entonces el usuario podra visualizar el producto agregado en el carrito de compras
