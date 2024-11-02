@Suite @CotizarEnvio

Feature: Validar funcionalidades de cotización de envío
  Background: Navegar al sitio web
    Given el usuario navega al sitio web

  @cotizarEnvio
  Scenario: 1 - Cotizar Envío
    When el usuario ingresa los datos de origen, destino, fecha y hora
    When el usuario da clic en el botón de buscar
    Then esperar abrir la pestaña de los carros
    When el usuario selecciona el vehículo
    When el usuario da clic en continuar
    When el usuario llena la información de contacto
    When el usuario llena la información adicional
    When el usuario da clic en continuar



