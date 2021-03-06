package com.company.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class AllTypesOfSet {

    /*
    множество, неупорядочено, нет дубликатов
    */

    Set<Integer> hashSet= new HashSet<>();

/* Объекты хранятся в отсортированном и возрастающем порядке
    В основе лежит Treemap
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

    Set<Integer> treeSet= new TreeSet<>();

/* Объекты хранятся в отсортированном и возрастающем порядке
    Допускается не более одного элемента null, и значение null допускается только
    в том случае, если имеется подходящий Comparator.
    TreeSet<E> управляет внутренним объектом TreeMap<E,Object> - internalMap.
    Все операции на TreeSet выполняются на internalMap.
    Кроме того, как мы знаем, TreeMap хранит свои данные в древовидной структуре,
    что является причиной названия TreeSet.
    В основе лежит Treemap
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
}
