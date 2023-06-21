(function(){

    var listaBotonesEditar = document.querySelectorAll(".editarServicio");

    listaBotonesEditar.forEach(item =>{

        item.addEventListener("click", e =>{

            document.getElementById('id').value = item.dataset.id;

            document.getElementById('txtNombre').value = item.dataset.nombre;

            document.getElementById('txtDescripcion').value = item.dataset.descripcion;

            document.getElementById('cboTipo').value = item.dataset.tipo;

            document.getElementById('txtPrecio').value = item.dataset.precio;

            new bootstrap.Modal(document.getElementById('modalEditarServicio')).show();

        });

    });
})();