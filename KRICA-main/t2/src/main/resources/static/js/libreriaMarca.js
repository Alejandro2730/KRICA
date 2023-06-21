function limpiarForm(){
    window.location.href = "http://localhost:8080/marcas/";
}

function limpiarFormTipo(){
   window.location.href = "http://localhost:8080/tipos/";
}
function limpiarFormProducto(){
   window.location.href = "http://localhost:8080/productos/";
}

function limpiarFormCategoria(){
   window.location.href = "http://localhost:8080/categorias/";
}


function showConfirmation(event, id){
    event.preventDefault(); // Evita que el enlace se abra de inmediato
      Swal.fire({
         title: '¿Estás seguro?',
         text: 'Esta acción eliminará la marca. ¿Deseas continuar?',
         icon: 'warning',
         showCancelButton: true,
         confirmButtonText: 'Eliminar',
         cancelButtonText: 'Cancelar'
      }).then((result) => {
         if (result.isConfirmed) {
            window.location.href = "http://localhost:8080/marcas/eliminar/"+id;
         }
      });
}

function showConfirmationCategoria(event, id){
   event.preventDefault(); // Evita que el enlace se abra de inmediato
     Swal.fire({
        title: '¿Estás seguro?',
        text: 'Esta acción eliminará la categoría. ¿Deseas continuar?',
        icon: 'warning',
        showCancelButton: true,
        confirmButtonText: 'Eliminar',
        cancelButtonText: 'Cancelar'
     }).then((result) => {
        if (result.isConfirmed) {
           window.location.href = "http://localhost:8080/categorias/eliminar/"+id;
        }
     });
}

function showConfirmationTipo(event, id){
   event.preventDefault(); // Evita que el enlace se abra de inmediato
     Swal.fire({
        title: '¿Estás seguro?',
        text: 'Esta acción eliminará el tipo. ¿Deseas continuar?',
        icon: 'warning',
        showCancelButton: true,
        confirmButtonText: 'Eliminar',
        cancelButtonText: 'Cancelar'
     }).then((result) => {
        if (result.isConfirmed) {
           window.location.href = "http://localhost:8080/tipos/eliminar/"+id;
        }
     });
}

function showConfirmationServicio(event, id){
   event.preventDefault(); // Evita que el enlace se abra de inmediato
     Swal.fire({
        title: '¿Estás seguro?',
        text: 'Esta acción eliminará el servicio. ¿Deseas continuar?',
        icon: 'warning',
        showCancelButton: true,
        confirmButtonText: 'Eliminar',
        cancelButtonText: 'Cancelar'
     }).then((result) => {
        if (result.isConfirmed) {
           window.location.href = "http://localhost:8080/servicios/eliminar/"+id;
        }
     });

     
}

function showConfirmationProducto(event, id){
   event.preventDefault(); // Evita que el enlace se abra de inmediato
     Swal.fire({
        title: '¿Estás seguro?',
        text: 'Esta acción eliminará el producto. ¿Deseas continuar?',
        icon: 'warning',
        showCancelButton: true,
        confirmButtonText: 'Eliminar',
        cancelButtonText: 'Cancelar'
     }).then((result) => {
        if (result.isConfirmed) {
           window.location.href = "http://localhost:8080/productos/eliminar/"+id;
        }
     });
   }
