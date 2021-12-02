/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builder;

import Vehiculos.TiposVehiculo;
import sinpatron.Carroceria;
import sinpatron.IMotor;
/**
 *
 * @author kevin
 */
public interface Builder {
   void setColor(String color);
   void setDireccionAsistida (boolean direccionAsistida);
   void setMarca (String marca);
   void setModelo(String modelo);
   void setMotor (IMotor motor);
   void setTipoCarroceria (Carroceria carroceria);
   void setTiposVehiculo(TiposVehiculo tiposVehiculo);
}
