package Decorator;
public abstract class BaseDecorator implements Accesorios{
    private Accesorios wrapee;
    
    public BaseDecorator(Accesorios wrappe){
        this.wrapee = wrapee;
    }
    
    @Override
    public abstract void instalar();
}
