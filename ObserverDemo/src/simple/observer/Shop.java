package simple.observer;
import java.util.HashSet;
import java.util.Set;

/**
 * 店类,可被观察的
 *
 */
public class Shop extends Watchable {

    static String IN = "in";    //进入
    static String OUT = "out";    //出去
    
    Set<String> personSet = new HashSet<String>();
    int pcount = 0;        //店内总人数
    
    /**
     * 来访登记
     * @param name
     */
    public void comeIn(String name){
        personSet.add(name);
        pcount = personSet.size();
        Object[] parameters=new Object[]{IN, name, pcount};
        notifyWatchers(parameters);    //通知观察者
    }
    
    /**
     * 出店登记
     * @param name 
     */
    public void getOut(String name){
        personSet.remove(name);
        pcount = personSet.size();
        Object[] parameters=new Object[]{OUT, name, pcount};
        notifyWatchers(parameters);    //通知观察者
    }
    
}