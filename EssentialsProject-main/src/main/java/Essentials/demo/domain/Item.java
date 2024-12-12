
package Essentials.demo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Item extends Product {
    private int cantidad; // Almacenar la cantidad de items de un producto

    public Item() {
    }

    public Item(Product producto) {
        super.setId(producto.getId());
        super.setNombre(producto.getNombre());
        super.setDescription(producto.getDescription());
        super.setTipo(producto.getTipo());
        this.cantidad = 0;
    }
}