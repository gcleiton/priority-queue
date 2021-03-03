package queuepriority.entities;

public class QueueElement<E extends Object> implements Comparable<QueueElement<E>> {

    private E element;
    private int priority;

    public QueueElement(E element, int priority) {
        this.element = element;
        this.priority = priority;
    }

    @Override
    public int compareTo(QueueElement<E> element) {
        if (this.priority > element.getPriority()) {
            return 1;

        } else if (this.priority < element.getPriority()) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return element.toString();
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

}
