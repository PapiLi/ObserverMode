package simple.observer;

/**
 * 摄像头类
 *
 */
public class Camera implements Watcher {
    
    private int id;        //摄像头编号
    
    public Camera(int id){
        this.id = id;
    }

    @Override
    public void takeAction(Object[] msg) {
        System.out.println("摄像头" + id + "号监测到现在店内总人数为" + msg[2] + "人");
    }

}