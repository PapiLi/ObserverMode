package simple.observer;

/**
 * 门卫（保安）类
 *
 */
public class Guard implements Watcher {
    
    private String name;    //门卫姓名

    public Guard(){}
    
    public Guard(String name){
        this.name = name;
    }
    
    @Override
    public void takeAction(Object[] msg) {
        if(msg[0].equals("in")){
            System.out.println(this.name + "向管理处汇报：“" + msg[1] + "”已进入本店！");
        }
        else if(msg[0].equals("out")){
            System.out.println(this.name + "向管理处汇报：“" + msg[1] + "”已走出本店！");
        }
    }
    

}