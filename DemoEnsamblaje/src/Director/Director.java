/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Director;

import Builder.Builder;
import Vehiculos.TiposVehiculo;

public class Director {
    public void construirVehiculoAutomotrizA(Builder builder) {
        builder.setTiposVehiculo(TiposVehiculo.AUTOMOTRIZA);
    }
    
    public void construirVehiculoAutomotrizB(Builder builder) {
        builder.setTiposVehiculo(TiposVehiculo.AUTOMOTRIZB);
    }
}
