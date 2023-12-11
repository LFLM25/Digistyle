
<!DOCTYPE html>
<html lang="en">
<head>
    <title>usuarios</title>
    <link rel="shorcut icon" href="/imagenes/Digistyle2.jpg">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/buttons/2.2.3/css/buttons.dataTables.min.css">
    <a href="Formulariologin.php">login</a>
</head>
<body>
<?php
include 'conexion.php';
$sql = "SELECT
    U.id_usuario,
    U.documento,
    U.nombre,
    U.apellido,
    U.correo_electronico,
    U.telefono,
    U.contrasena,
    R.descripcion
FROM usuario U
INNER JOIN rol R ON U.id_rol = R.id_rol";

$query = $connect->prepare($sql);
$query->execute();
$results = $query->fetchAll(PDO::FETCH_OBJ);
//var_dump($results);
if ($query->rowCount() > 0) {
    echo '<table id="t-all" class="display nowrap" style="width:100%" border="1"> <thead>';
    echo '<th>ID Usuario</th>';
    echo '<th>N°_documento</th>';
    echo '<th>nombre</th>';
    echo '<th>apellido</th>';
    echo '<th>Correo Electrónico</th>';
    echo '<th>Telefono</th>';
    echo '<th>Contraseña</th>';
    echo '<th>Usuario</th>';
    echo '<th>Acciones</th>';
    echo '</thead><tbody>';
    foreach ($results as $result) {
        echo '<tr>';
        echo '<td>'.$result->id_usuario.'</td>';
        echo '<td>'.$result->documento.'</td>';
        echo '<td>'.$result->nombre.'</td>';
        echo '<td>'.$result->apellido.'</td>';
        echo '<td>'.$result->correo_electronico.'</td>';
        echo '<td>'.$result->telefono.'</td>';
        echo '<td>'.$result->contrasena.'</td>';
        echo '<td>'.$result->descripcion.'</td>'
                   . '<td><form action="updateusuario.php" method="POST">  
        <input type="hidden" name="id" id="id" value="' . $result->id_usuario. '">
        <button type="submit"> Actualizar </button>
    </form></td> </tr>';
        }
    }    
    echo '</tbody></table>';

?>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/2.2.3/js/dataTables.buttons.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/2.2.3/js/buttons.html5.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/2.2.3/js/buttons.print.min.js"></script> 
<script>
$(document).ready(function () {
    $('#t-all').DataTable({
        dom: 'Bfrtip',
        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ]
    });
});
</script>
</body>
</html>
