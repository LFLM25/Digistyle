<?php
include "session.php";
include "conexion.php";

    $username = $_POST['correo_electronico'];
    $password = $_POST['contrasena'];

    $sql = "SELECT * FROM usuario WHERE correo_electronico = :correo_electronico AND contrasena = :contrasena";
    $query = $connect->prepare($sql);
    $query->bindParam(':correo_electronico', $username, PDO::PARAM_STR);
    $query->bindParam(':contrasena', $password, PDO::PARAM_STR);
    $query->execute();

    if ($query->rowCount() > 0) {
        session_start();
        $_SESSION['usuario'] = $username;
        echo "<script>window.location.replace('http://localhost:3000/php/paginaprincipal.php');</script>";
    } else {
        echo "<script>alert('Correo electrónico y/o contraseña incorrectos');</script>";
        echo "<script>window.location.replace('http://localhost:3000/php/formulariologin.php');</script>";
}