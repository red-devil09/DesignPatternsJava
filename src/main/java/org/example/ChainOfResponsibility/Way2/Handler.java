package org.example.ChainOfResponsibility.Way2;

public abstract class Handler {

    /**
     * ye same tree and LinkedList ke jaise next pointer bna dia
     */
    private Handler next;

    //setter bohot zruri hai dynamic injection ke liye
    public void setNextHandler(Handler next){
        this.next = next;

    }

    /**
     * isko hum ke interface mei daal skte hai, fir ye abstract class isko implement kr legi
     */
    public abstract boolean handle(String username, String pass);

    /**
     * Way 1 mei hum, iss chiz ko ek hi method mei kr rhe hai, yaha humne method alag kr dia
     */
    public boolean handleNext(String username, String pass){
        if(next == null)
            return true;

        return next.handle(username,pass);
    }
}
