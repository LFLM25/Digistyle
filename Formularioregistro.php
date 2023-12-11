<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>formularioregistro</title>
    <link rel="shorcut icon" href="/imagenes/Digistyle2.jpg">
    <link rel="stylesheet" href="/css/registro.css">
    <script>
        function validartamaño(inputId, minTam, maxTam) {
            var input = document.getElementById(inputId);
            var valor = input.value;

            if (valor.length < minTam) {
                input.setCustomValidity("Debe tener como mínimo " + minTam + " caracteres");
            } else if (valor.length > maxTam) {
                input.setCustomValidity("Debe tener como máximo " + maxTam + " caracteres");
            } else {
                input.setCustomValidity(""); 
            }
        }
    </script>
</head>
<body>
    <img src="/imagenes/D2.png" width="150" height="150" class="logo"><hr>
    <img src="/imagenes/generatedtext1-removebg-preview.png" class="titulo">
    <a href="#" class="contacto">Contactanos</a>
    <a href="http://localhost:3000/php/paginaprincipal.php" class="salida">Volver</a>
    <div><br></div>
    <form id="loginForm">
        <p>
            <h1>DIGISTYLE</h1>
        </p><br><br>
    </form>
    <center>
</body>
<body>
<?php 
    include 'conexion.php'; ?>
       <form action="registrodatos.php" method="post">
        <table>
            <tr>
                <td><label for="nombre">Nombre:</label></td>
                <td><input type="text" id="nombre" name="nombre" class="input" oninput="validartamaño('nombre', 1, 50)" required></td>
            </tr>
            <tr>
                <td><label for="apellido">Apellido:</label></td>
                <td><input type="text" id="apellido" name="apellido" class="input" oninput="validartamaño('apellido', 1, 50)" required></td>
            </tr>
            <tr>
                <td><label for="documento">Documento:</label></td>
                <td><input type="int" id="documento" name="documento" class="input" oninput="validartamaño('documento', 4, 15)" required></td>
            </tr>
            <tr>
                <td><label for="telefono">Teléfono:</label></td>
                <td><input type="tel" id="telefono" name="telefono" class="input" oninput="validartamaño('telefono', 4, 15)" required></td>
            </tr>
            <tr>
                <td><label for="email">Correo Electrónico:</label></td>
                <td><input type="email" id="correo" name="correo" class="input" oninput="validartamaño('email', 11, 50)" required></td>
            </tr>
            <tr>
                <td><label for="contrasena">Contraseña:</label></td>
                <td><input type="password" id="contrasena" name="contrasena" class="input" oninput="validartamaño('contrasena', 4, 8)" required></td>
            </tr>
            <tr>
                <td><label for="idRol">Usuario:</label></td>
                <td>
                <select id="idRol" name="idRol" class="input">
                <?php
                 $sql = "SELECT id_Rol, descripcion FROM digistyle.rol";
                 $query = $connect->prepare($sql);
                 $query->execute();
                 $results = $query->fetchAll(PDO::FETCH_OBJ);

                 if ($query->rowCount() > 0) {
                    foreach ($results as $rol) {
                         echo '<option value="' . $rol->id_Rol . '">' . $rol->descripcion . '</option>';
                     }
                }
                 ?>
                </select>

                </td>
            </tr>
            <tr>
                <td colspan="2"><button type="submit" class="registrarse">Registrarse</button></td>
            </tr>
        </table>
    </form>

    <div><br><br><hr>
        <a href="http://127.0.0.1:5500/interfaz%20500.html" class="preguntas">Preguntas Frecuentes</a>
        <a href="http://127.0.0.1:5500/interfaz%20500.html" class="quienes">Quienes somos</a>
    </div>
</body>
</html>