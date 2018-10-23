package simple.observer;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Shop shop = new Shop();
        
        //添加摄像头1号
        Camera camera = new Camera(1);
        shop.addWatcher(camera);
        
        //添加门卫一号
        Guard guard1 = new Guard("门卫一号");
        shop.addWatcher(guard1);
        
        //来访登记、出门登记
        shop.comeIn("BlogJava");
        shop.comeIn("JavaEye");
        shop.getOut("BlogJava");
        
        //移除门卫一号，派他去做别的事
        shop.removeWatcher(guard1);    
        
        //进入无人观察状态，随进随出
        shop.comeIn("CSDN");
        shop.getOut("JavaEye");
        shop.comeIn("心梦帆影");
        
        //添加门卫二号
        Guard guard2 = new Guard("门卫二号");
        shop.addWatcher(guard2);
        
        //来访登记，出门登记
        shop.comeIn("容新华");
        shop.getOut("CSDN");
        
    }

}