
package Builder;

import sinpatron.Carroceria;
import sinpatron.IMotor;

public class CarBuilder implements Builder{
    private String color;
    private boolean direccionAsistida;
    private String marca;
    private String modelo;
    private IMotor motor;
    private Carroceria carroceria;

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void setDireccionAsistida(boolean direccionAsistida) {
        this.direccionAsistida = direccionAsistida;
    }

    @Override
    public void setMarca(String marca) {
        this.marca=marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo=modelo;
    }

    @Override
    public void setMotor(IMotor motor) {
        this.motor=motor;
    }

    @Override
    public void setTipoCarroceria(Carroceria carroceria) {
        this.carroceria=carroceria;
    }

}
