@Suite @Login

  Feature: CP01 - Validar inicio de sesion
    Background: validar el inicio de sesion con credenciales validas e invalidas

      Given el usuario navega al sitio web

      @validCredentials
      Scenario: 1 - validar con credenciales correctas
        When ingresar credenciales validas
        Then la aplicacion deberia mostrar el modilo principal de productos


