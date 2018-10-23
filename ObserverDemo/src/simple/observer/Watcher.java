package simple.observer;


/**
 * 观察者接口
 *
 */
public interface Watcher {
	 /**
     * （接收到通知后，）观察者采取行动
     * @param msg
     */
    public void takeAction(Object[]  msg);
}
