package advanced1.thread.collection.simple.list;

// 프록시 역활을 하는 클래스
// SyncProxyList 는 SimpleList 인터페이스를 구현한다
// 이 클래스 생성자를 통해 SimpleList target 을 주입 받고 여기에 실제 호출하는 대상이 들어간다
// 이 클래스의 역활은 synchronized  만 걸고 그 다음 실제 호출해야 하는 원본 대상을 호출한다
public class SyncProxyList implements SimpleList{

    // 구현체가 들어갈 필드
    private SimpleList target;

    public SyncProxyList(SimpleList target) {
        this.target = target;
    }

    @Override
    public synchronized int size() {
        return target.size();
    }

    @Override
    public synchronized void add(Object o) {
        target.add(o);
    }

    @Override
    public synchronized Object get(int index) {
        return target.get(index);
    }

    @Override
    public String toString() {
        return target.toString() + " + by " + this.getClass().getSimpleName();
    }
}
