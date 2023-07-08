function limpiarForm(){
    window.location.href = "http://localhost:8080/categorias/";
 }
 
 function showConfirmation(event, id){
    event.preventDefault(); // Evita que el enlace se abra de inmediato
      Swal.fire({
         title: '¿Estás seguro?',
         text: 'Esta acción eliminará la categoria. ¿Deseas continuar?',
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