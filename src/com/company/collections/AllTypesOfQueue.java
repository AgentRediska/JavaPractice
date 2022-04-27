package com.company.collections;

import java.util.*;

public class AllTypesOfQueue {

    Queue<Integer> arrayDeque= new ArrayDeque<>();

/* Очереди представляют структуру данных, работающую по принципу FIFO (first in - first out).
Под капотом, в ArrayDeque поддерживается массивом, который удваивает свой размер при заполнении.
Это не потокобезопасно
Нулевые элементы не принимаются
Работает значительно быстрее, чем синхронизированный стек
Является более быстрой очередью, чем Связанный список из-за лучшей локализации ссылки
Большинство операций имеют амортизированную постоянную временную сложность
Итератор , возвращаемый ArrayDeque , работает быстро
ArrayDeque автоматически удваивает размер массива, когда указатель головы и хвоста встречаются друг с другом при добавлении элемента
    использует красно-черное дерево
    - добавить элемент в начало
        переопределение ссылок, хорошо
    - добавить элемент в конец
        переопределение ссылок, хорошо
    - добавить эемент в середину
        переопределение ссылок, хорошо

    - перебрать элементы (нужный находится в начале)
        найдет как и в аррай листе быстро, хорошо
    - перебрать элементы (нужный находится в середине)
        чем больше элементов , тем хуже
    - перебрать элементы (нужный находится в конце)
        если идти с начала, то максимально плохо
    - удалить элемент в начале
        быстро и просто, хорошо
    - удалить элемент в середине
        долго искать, легко удалить, средне
    - удалить элемент в конце
        очень долго искать, легко удалить, плохо
        */

    Queue<Integer> priorityDeque= new PriorityQueue<>();
    /*
    PriorityQueue – это класс очереди с приоритетами.
    По умолчанию очередь с приоритетами размещает элементы согласно естественному порядку сортировки используя Comparable.
    Элементу с наименьшим значением присваивается наибольший приоритет.
    Если несколько элементов имеют одинаковый наивысший элемент – связь определяется произвольно.
    Также можно указать специальный порядок размещения, используя Comparator.
    */
}