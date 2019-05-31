/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class stock {

    public static void main(String[] args) {
        int limit = 10;
        int item = 0;
        int remove, add, menu, finishadd, finishremove;

        System.out.printf("1.Add\n2.Remove\n3.Show");
        Scanner sc = new Scanner(System.in);
        menu = sc.nextInt();

        if (menu == 1) {
            if (item < limit) {
                add = sc.nextInt();
                if (item + add > limit) {
                    System.out.printf("overload\n");
                } else {
                    item = item + add;
                    System.out.printf("%d", item);

                }

            } else {
                System.out.printf("Full");
            }
        } 
        else if (menu == 2) {
            remove = sc.nextInt();
            if (remove > item) {
                System.out.printf("out of limit\n");
            } else {
                item = item - remove;
                System.out.printf("%d", item);
            }

        } 
        else if (menu == 3) {
            System.out.printf("%d,%d", item, limit);

        } 
        else {
            System.out.printf("menu error\n");
        }

    }

}
