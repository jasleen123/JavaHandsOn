package com.puzzles.problems.company.coding.assignments;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeArray.lastIndexOf;

/*
* There is a group of n people. A serial killer comes and kills every kth person from the group and keeps on repeating this until
* there is only one person left and he spares the life of that person. Write an equation/algorithm which takes n and k as input
* and give the position of the guy who will be alive after the complete process. For eg: Let us assume there is a group of 13 (n)
* people and the serial killer kills every 3rd (k) person. The positions on which they are standing are marked 1 to 13. The order
* in which he kills will be: 3, 6, 9, 12, 2, 7, 11, 4, 10, 5, 1, 8. This way the guy on 13th positon will be saved.
*/

/*
*  => I tried solving it with Array, but the complexity would increase, hence using list
*
* */

/**
 * @author jasleen
 * Dated : 10-Jan-2018
 */
public class XebiaKillerGame {
    int n;            // total number of people
    List<Integer> peopleList = new LinkedList<Integer>();
    int k;

    public XebiaKillerGame(int n, int k) {
        this.n = n;
        this.k = k;
        setPeopleList();
    }

    public void setPeopleList() {
        for (int index = 0; index < n; index++) {
            peopleList.add(index, index + 1);
        }
    }

    public int getAlivePersonWithPosition() {
        int position = 0;
        while (peopleList.size() != 1) {
            position += (k - 1);
            if (position >= peopleList.size()) {
                position -= peopleList.size();
                System.out.print(peopleList.remove(position) + " , ");
            } else {
                System.out.print(peopleList.remove(position) + " , ");
            }
        }
        return position;
    }

    public static void main(String[] args) {
        XebiaKillerGame game = new XebiaKillerGame(13, 3);
        System.out.println("People killed are :");
        int savedPosition = game.getAlivePersonWithPosition() + game.peopleList.get(game.getAlivePersonWithPosition());
        System.out.println("\n\nPerson " + game.peopleList.get(game.getAlivePersonWithPosition()) + " at position " + savedPosition + " is saved");
    }
}
