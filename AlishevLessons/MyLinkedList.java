package AlishevLessons;

import java.util.Arrays;

public class MyLinkedList {  // реализация упращенного класса LinkedList с односвязным списком

    private Node head; // приваатное поле Node, после создания обьекта в этой переменной будет null
private int size; // тут будет храниться размер листа


    public void add(int value){
// если это первое добавление  в список

        if(head==null){
           this.head = new Node(value);
        } else {
            Node temp = head;
            while(temp.getNext()!= null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(value)); // теперь есть указатель на след узел
        }
        size++;
    }

    public int get(int index){ // аргумент метода  получает индекс того числа которое хочем получить
      int currentIndex = 0;
        Node temp = head;
        while(temp!=null){ // пока temp!=null
            if(currentIndex == index){
              return temp.getValue();
            } else { // если это не так идем к след узлу
                temp = temp.getNext();// идем по цепочке присваивать temp след значение в цепочке
                currentIndex++;
            }
}  // иначе выбрасываем исключение поскольку поданный индекс больще чем у нас список
           throw new IllegalArgumentException();
    }

    public void remove(int index){ // remove - сильная сторона LinkedList в отличии от Array, на вход будет принимать
        if(index == 0){
            head = head.getNext();
            size--;
            return ; // выход с метода
        }


        int currentIndex = 0;   // индекс элемента которого хотим удалить
        Node temp = head;
        while(temp!=null){ // пока temp!=null
            if(currentIndex  == index-1){ // попадаем в ветвь в случае превыдущего индекса
                temp.setNext(temp.getNext().getNext());// назначаем другой узел следующий узел следующего узла
            size--; // декрементируем размер листа посколькуо он уменьшаеться на 1
            return; // выход с метода, ключевое слово для выхода с метода
            } else { // если это не так идем к след узлу
                temp = temp.getNext();// идем по цепочке присваивать temp след значение в цепочке
                currentIndex++;
            }
        }


    }


public String toString(){ // переопределяем метод toString()
  int []result = new int[size];// массив будет равен размеру нашего списка
      int idx = 0;
      Node temp = head; // переменная будет указывать на голову односвязного списка

    while(temp != null){ // пока есть узлы в списке

        result [idx++] = temp.getValue(); // каждый раз добавляем значение текущего узла
        temp = temp.getNext();    //продвигаемся по списку
    }
    // [1] -> [2] -> [3]

return Arrays.toString(result); // переводим масив в сточное представление
}


    private static class Node{
        private int value; // значение которое будет храниться в узле
        private Node next; // ссылка на след узел


        public Node(int value){ // конструктор
            this.value=value;

        }

        public int getValue() { // поскольку поля приватные создаем гетеры и сетеры
    return value;
}

      public void setValue(int value){
            this.value = value;
}
        public Node getNext(){ // геттер для ссылки на обьект
            return next;
        }

        public void setNext(Node next){ // сеттер для ссылки на обьект
            this.next = next;
        }

    }


}
