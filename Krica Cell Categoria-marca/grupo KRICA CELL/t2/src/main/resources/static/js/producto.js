
(function(){

    var listaBotonesEditar = document.querySelectorAll(".editarProducto");

    listaBotonesEditar.forEach(item =>{

        item.addEventListener("click", e =>{

            document.getElementById('id').value = item.dataset.id;

            document.getElementById('txtNombre').value = item.dataset.nombre;

            document.getElementById('txtDescripcion').value = item.dataset.descripcion;

            document.getElementById('cboMarca').value = item.dataset.marca;

            document.getElementById('txtPrecio').value = item.dataset.precio;

            new bootstrap.Modal(document.getElementById('modalEditarProducto')).show();

        });

    });
})();