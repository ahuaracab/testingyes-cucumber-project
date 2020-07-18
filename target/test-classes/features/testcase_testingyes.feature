@Cucumber
Feature: Registro de usuario en TestingYes
  Esta feature se trata de registrar uno o muchos usuarios en testingyes

  Scenario Outline: Registro de usuario con solo los campos obligatorios
    Given que angelo ingresa a TestingYes
    When angelo ingresa a la pagina de log in
    And angelo se registra con los datos obligatorios: nombre: <nombre> , apellido: <apellido> , pais: <pais> , direccion: <direccion> , ciudad: <ciudad> , provincia: <provincia> , codigo postal: <zipcode> , telefono: <phone> , email: <email> , contrasena: <contrasena> y confirmacion de contrasena: <confirmaciondecontrasena>
    Then angelo deberia ver la confirmacion de registro: texto

    Examples:
      | nombre | apellido  | pais      | direccion  | ciudad   | provincia | zipcode | phone     | email                   | contrasena | confirmaciondecontrasena |
      | Angelo | Huaraca   | Peru      | Los Olivos | Lima     | Lima      | 15037   | 946532941 | test0003@mailinator.com | 1234567    | 1234567                  |
      | Carlos | Fernandez | Argentina | La Perla   | La Plata | La Plata  | 11234   | 985632147 | test0004@mailinator.com | 3234567    | 3234567                  |
