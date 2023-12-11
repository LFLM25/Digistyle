<?php
include './conexion.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $documento = $_POST["documento"];
    $nombre = $_POST["nombre"];
    $apellido = $_POST["apellido"];
    $correo = $_POST["correo"];
    $telefono = $_POST["telefono"];
    $contrasena =($_POST["contrasena"]);
    $idRol = $_POST["idRol"];

    $sql = "INSERT INTO usuario (documento, nombre, apellido, correo_electronico, telefono, contrasena, id_rol)"
        . "VALUES (:documento, :nombre, :apellido, :correo_electronico, :telefono, :contrasena, :idRol)";

    $query = $connect->prepare($sql);

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
            echo "<script>alert('El registro se insertó correctamente'); window.location='listausuario.php';</script>";
        } else {
            $connect->rollBack();
            echo "<script>alert('Error insertando registro'); window.location='listausuario.php';</script>";
        }
    } catch (PDOException $e) {
        $connect->rollBack();
        echo "Error: " . $e->getMessage();
    } finally {
        $connect = null;
    }
}
?>
