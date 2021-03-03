package queuepriority.contracts;

import queuepriority.entities.QueueElement;

public interface PriorityQueueInterface<E> {

    public void add(E element, int priority);

    public QueueElement<E> remove();

    public boolean isEmpty();

    public void show();

}
