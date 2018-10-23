package simple.observer;
import java.util.HashSet;
import java.util.Set;

/**
 * "被观察对象" 的父类
 *
 */
public class Watchable {
    
    private Set<Watcher> watcherSet = new HashSet<Watcher>();
    
    /**
     * 通知观察者
     * @param params 通知的信息数组
     */
    protected void notifyWatchers(Object[] params){
        for(Watcher watcher : watcherSet) {
            watcher.takeAction(params);        //观察者采取行动
        }
    }
    
    /**
     * 增加观察者
     * @param watcher
     */
    protected void addWatcher(Watcher watcher){
        watcherSet.add(watcher);
    }
    
    /**
     * 移除观察者
     * @param watcher
     */
    protected void removeWatcher(Watcher watcher) {
        watcherSet.remove(watcher);
    }
    
}