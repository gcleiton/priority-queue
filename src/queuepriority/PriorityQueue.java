package queuepriority;

import queuepriority.entities.QueueElement;
import java.util.ArrayList;
import queuepriority.contracts.PriorityQueueInterface;

public class PriorityQueue<E extends Object> implements PriorityQueueInterface<E> {
    private ArrayList<QueueElement<E>> queue;

    public static final int MAX_SIZE = 99;

    public PriorityQueue() {
        queue = new ArrayList<>();
    }

    public void add(E element) {
        QueueElement<E> queueElement = makeQueueElement(element, MAX_SIZE);
        queue.add(queueElement);
    }

    @Override
    public void add(E element, int priority) {
        if (priority > MAX_SIZE) {
            System.out.println("A prioridade não pode ser maior que " + MAX_SIZE + ".");
            return;
        }

        QueueElement<E> queueElement = makeQueueElement(element, priority);

        int i = 0;
        for (i = 0; i < queue.size(); i++) {
            if (queueElement.compareTo(this.queue.get(i)) == -1) {
                break;
            }
        }
        queue.add(i, queueElement);

    }

    @Override
    public QueueElement<E> remove() {
        if (isEmpty()) {
            System.out.println("Fila vazia! Elemento não removido.");
            return null;
        }

        QueueElement<E> removedElement = queue.remove(0);

        return removedElement;
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Fila vazia. Não há elementos para impressão.");
            return;
        }

        System.out.print("Fila: ");
        queue.forEach((element) -> {
            System.out.print("\t" + element.toString());
        });
        System.out.println();
    }

    private QueueElement<E> makeQueueElement(E element, int priority) {
        return new QueueElement<E>(element, priority);
    }
}