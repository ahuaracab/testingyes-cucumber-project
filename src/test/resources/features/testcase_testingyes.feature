#language: es

Característica: Registro de usuario en TestingYes
  Esta feature se trata de registrar uno o muchos usuarios en testingyes

  Esquema del escenario: Registro de usuario con solo los campos obligatorios
    Dado que angelo ingresa a TestingYes
    Cuando angelo ingresa a la pagina de log in
    Y angelo se registra con los datos obligatorios: nombre: <nombre> , apellido: <apellido> , pais: <pais> , direccion: <direccion> , ciudad: <ciudad> , provincia: <provincia> , codigo postal: <zipcode> , telefono: <phone> , email: <email> , contrasena: <contrasena> y confirmacion de contrasena: <confirmaciondecontrasena>
    Entonces angelo deberia ver la confirmacion de registro: Your Account Has Been Created!

    Ejemplos:
      | nombre | apellido | pais   | direccion | ciudad      | provincia | zipcode | phone     | email            | contrasena | confirmaciondecontrasena |
      | Jorge  | Vazques  | Peru   | Comas     | La Libertad | Chepen    | 16548   | 987456321 | test0027@xyz.com | 4567894    | 4567894                  |
      | Luis   | Velarde  | Brazil | Calle 20  | Brasilia    | Brasilia  | 16569   | 965241584 | test0028@xyz.com | 1245788    | 1245788                  |
      | Jorge  | Vazques  | Peru   | Comas     | La Libertad | Chepen    | 16548   | 987456321 | test0029@xyz.com | 4567894    | 4567894                  |
      | Jorge  | Vazques  | Peru   | Comas     | La Libertad | Chepen    | 16548   | 987456321 | test0030@xyz.com | 4567894    | 4567894                  |
