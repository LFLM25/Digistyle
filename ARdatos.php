<?php
include 'conexion.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $id = $_POST["id"];
    $documento = $_POST["documento"];
    $nombre = $_POST["nombre"];
    $apellido = $_POST["apellido"];
    $correo = $_POST["correo"];
    $telefono = $_POST["telefono"];
    $contrasena =($_POST["contrasena"]);
    $idRol = $_POST["idRol"];

    // Verificar si se está realizando una actualización o una inserción
    if (isset($id)) {
        // Actualización de usuario
        $sql = "UPDATE usuario SET 
            documento = :documento, 
            nombre = :nombre, 
            apellido = :apellido, 
            correo_electronico = :correo_electronico, 
            telefono = :telefono, 
            contrasena = :contrasena, 
            id_rol = :idRol 
            WHERE id_usuario = :id";
    } else {
        // Inserción de nuevo usuario
        $sql = "INSERT INTO usuario (documento, nombre, apellido, correo_electronico, telefono, contrasena, id_rol)
            VALUES (:documento, :nombre, :apellido, :correo_electronico, :telefono, :contrasena, :idRol)";
    }

    $query = $connect->prepare($sql);

    // Ajustar parámetros y bindings según la sentencia SQL seleccionada
    if (isset($id)) {
        $query->bindParam(':id', $id, PDO::PARAM_INT);
    }

    $query->bindParam(':nombre', $nombre);
    $query->bindParam(':apellido', $apellido);
    $query->bindParam(':documento', $documento);
    $query->bindParam(':telefono', $telefono);
    $query->bindParam(':correo_electronico', $correo);
    $query->bindParam(':contrasena', $contrasena);
    $query->bindParam(':idRol', $idRol);

    try {
        $connect->beginTransaction();

        if ($query->execute()) {
            $connect->commit();
            // Mensaje y redirección según el contexto
            if (isset($id)) {
                echo "<script>alert('El registro se actualizó correctamente'); window.location='listausuario.php';</script>";
            } else {
                echo "<script>alert('El registro se insertó correctamente'); window.location='listausuario.php';</script>";
            }
        } else {
            $connect->rollBack();
            echo "<script>alert('Error al procesar la consulta'); window.location='listausuario.php';</script>";
        }
    } catch (PDOException $e) {
        $connect->rollBack();
        echo "Error: " . $e->getMessage();
    } finally {
        $connect = null;
    }
}
?>
