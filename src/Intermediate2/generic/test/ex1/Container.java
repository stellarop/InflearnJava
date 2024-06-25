package Intermediate2.generic.test.ex1;

public class Container<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isEmpty(){
        if(data == null){
            return false;
        }
        return true;
    }
}
