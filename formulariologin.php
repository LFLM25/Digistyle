<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>formulariologin</title>
    <link rel="shorcut icon" href="/imagenes/Digistyle2.jpg">
    <link rel="stylesheet" href="/css/login.css">
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
    <a href="http://localhost:3000/php/paginaprincipal.php" class="t">Tienda</a>
    <a href="#" class="c">Contactanos</a>
    <a href="#" class="carro">Carrito</a>
    <a href="http://localhost:3000/php/formulariologin.php" class="salida">Volver</a>
    <a href="http://localhost:3000/PHP/Formularioregistro.php" class="registro">Registrarse</a>
    <div><br></div>
    <form id="loginForm">
            <h1>DIGISTYLE</h1>
    </form>
        <center>
        <form action="validacionlogin.php" method="post">
            <body>
                <h3>Correo electronico</h3>
                    <label for="correo_electronico"></label>
                    <input type="email" id="correo_electrinico" name="correo_electronico" class="input" oninput= "validartamaño('email',11,50)" required>
                <h3>Contraseña</h3>    
                    <label for="contrasena"></label>   
                    <input type="password" id="contrasena" name="contrasena" class="input" oninput= "validartamaño('contraseña',4,250)" required>
                <p>
                </p>
                <input type="submit" value="Ingresar" class="input">
            </body>
        </form>
        </center>
    <div><br><br><hr>
        <a href="http://127.0.0.1:5500/interfaz%20500.html" class="p">Preguntas Frecuentes</a>
        <a href="http://127.0.0.1:5500/interfaz%20500.html" class="q">Quienes somos</a>
    </div><br><br>
</body>
</html>
