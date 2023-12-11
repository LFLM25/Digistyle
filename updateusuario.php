<html>
    <head>
        <meta charset="UTF-8">
        <title>updateusuario</title>
        <script src="resources/js/validaciones.js" type="text/javascript"></script>
        <link rel="shorcut icon" href="/imagenes/Digistyle2.jpg">
    </head>
    <body>
        <?php 
        include 'conexion.php'; 
        $id = $_POST['id'];
        $sql= "SELECT * FROM usuario WHERE id_usuario = :id"; 
        $stmt = $connect->prepare($sql);
        $stmt->bindParam(':id', $id, PDO::PARAM_INT); 
        $stmt->execute();
        $obj = $stmt->fetchObject();
        ?>
        <h2>Actualizar usuario</h2>
        <form method="post" action="ARdatos.php" >
            <table>
            <tr>
                <td><label for="documento">N°_documento:</label></td>
                <td><input type="int" id="documento" name="documento" class="input"  required value="<?php echo $obj->documento;?>" ></td>
            </tr>
            <tr>
                <td><label for="nombre">Nombre:</label></td>
                <td><input type="text" id="nombre" name="nombre" class="input" required value="<?php echo $obj->nombre;?>" ></td>
            </tr>
            <tr>
                <td><label for="apellido">Apellido:</label></td>
                <td><input type="text" id="apellido" name="apellido" class="input"  required value="<?php echo $obj->apellido;?>" ></td>
            </tr>
            <tr>
                <td><label for="correo_electronico">Correo Electrónico:</label></td>
                <td><input type="email" id="correo" name="correo" class="input" oninput="validartamaño('email')" required value="<?php echo $obj->correo_electronico;?>" ></td>
            </tr>
            <tr>
                <td><label for="telefono">Teléfono:</label></td>
                <td><input type="tel" id="telefono" name="telefono" class="input" required value="<?php echo $obj->telefono;?>" ></td>
            </tr>
            <tr>
                <td><label for="contrasena">Contraseña:</label></td>
                <td><input type="password" id="contrasena" name="contrasena" class="input" required value="<?php echo $obj->contrasena;?>" ></td>
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
                    ?>
                    <option value="<?php echo $rol->id_Rol; ?>" <?php echo ($rol->id_Rol == $obj->id_rol) ? 'selected' : ''; ?>>
                        <?php echo $rol->descripcion; ?>
                    </option>
                    <?php
                }
            }
            ?>
            </select>
            </td>
            </tr>
        </table>
        <input type="hidden" name="id" id="id" class="input" value="<?php echo $id; ?>"/></br>
        <br/>
        <button type="submit" class="input">Actualizar usuario</button>
    </form>
        <form action="listausuarios.php"></form>
            <button>volver</button>
        </form>
        </main></div>
    </form>
</body>
</html>