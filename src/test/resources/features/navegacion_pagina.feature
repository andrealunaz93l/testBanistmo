#language: es


Característica: Validar descarga de informe en la pagina de Bancolombia

  Escenario: Descargar y validar el informe OPEP+
    Dado que el usuario accede a la pagina de personas de Bancolombia
    Cuando accede directamente al informe de la OPEP+
    Y descarga el informe en PDF
    Entonces valida que el PDF descargado es el correcto
