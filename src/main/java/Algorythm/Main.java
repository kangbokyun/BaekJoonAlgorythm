package Algorythm;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // 10809번
        // 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

        // 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

        // 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
        // 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
        String aa = new Scanner(System.in).next();
        int a = 0; int b = 0; int c = 0; int d = 0; int e = 0; int f = 0; int g = 0; int h = 0; int ii = 0; int j = 0; int k = 0; int l = 0; int m = 0; int n = 0; int o = 0; int p = 0; int q = 0; int r = 0; int s = 0; int t = 0; int u = 0; int v = 0; int w = 0; int x = 0; int y = 0; int z = 0;
        for(int i = 0; i < aa.length(); i++) {
            if(aa.contains("a") && a == 0) { a = i; break; } else if(!aa.contains("a")) { a = -1; }
            if(aa.contains("b") && a == 0) { b = i; break; } else if(!aa.contains("b")) { b = -1; }
            if(aa.contains("c") && a == 0) { c = i; break; } else if(!aa.contains("c")) { c = -1; }
            if(aa.contains("d") && a == 0) { d = i; break; } else if(!aa.contains("d")) { d = -1; }
            if(aa.contains("e") && a == 0) { e = i; break; } else if(!aa.contains("e")) { e = -1; }
            if(aa.contains("f") && a == 0) { f = i; break; } else if(!aa.contains("f")) { f = -1; }
            if(aa.contains("g") && a == 0) { g = i; break; } else if(!aa.contains("g")) { g = -1; }
            if(aa.contains("h") && a == 0) { h = i; break; } else if(!aa.contains("h")) { h = -1; }
            if(aa.contains("i") && a == 0) { ii = i; break; } else if(!aa.contains("i")) { ii = -1; }
            if(aa.contains("j") && a == 0) { j = i; break; } else if(!aa.contains("j")) { j = -1; }
            if(aa.contains("k") && a == 0) { k = i; break; } else if(!aa.contains("k")) { k = -1; }
            if(aa.contains("l") && a == 0) { l = i; break; } else if(!aa.contains("l")) { l = -1; }
            if(aa.contains("m") && a == 0) { m = i; break; } else if(!aa.contains("m")) { m = -1; }
            if(aa.contains("n") && a == 0) { n = i; break; } else if(!aa.contains("n")) { n = -1; }
            if(aa.contains("o") && a == 0) { o = i; break; } else if(!aa.contains("o")) { o = -1; }
            if(aa.contains("p") && a == 0) { p = i; break; } else if(!aa.contains("p")) { p = -1; }
            if(aa.contains("q") && a == 0) { q = i; break; } else if(!aa.contains("q")) { q = -1; }
            if(aa.contains("r") && a == 0) { r = i; break; } else if(!aa.contains("r")) { r = -1; }
            if(aa.contains("s") && a == 0) { s = i; break; } else if(!aa.contains("s")) { s = -1; }
            if(aa.contains("t") && a == 0) { t = i; break; } else if(!aa.contains("t")) { t = -1; }
            if(aa.contains("u") && a == 0) { u = i; break; } else if(!aa.contains("u")) { u = -1; }
            if(aa.contains("v") && a == 0) { v = i; break; } else if(!aa.contains("v")) { v = -1; }
            if(aa.contains("w") && a == 0) { w = i; break; } else if(!aa.contains("w")) { w = -1; }
            if(aa.contains("x") && a == 0) { x = i; break; } else if(!aa.contains("x")) { x = -1; }
            if(aa.contains("y") && a == 0) { y = i; break; } else if(!aa.contains("y")) { y = -1; }
            if(aa.contains("z") && a == 0) { z = i; break; } else if(!aa.contains("z")) { z = -1; }
        }
        System.out.println(a
                + " " + b
                + " " + c
                + " " + d
                + " " + e
                + " " + f
                + " " + g
                + " " + h
                + " " + ii
                + " " + j
                + " " + k
                + " " + l
                + " " + m
                + " " + n
                + " " + o
                + " " + p
                + " " + q
                + " " + r
                + " " + s
                + " " + t
                + " " + u
                + " " + v
                + " " + w
                + " " + x
                + " " + y
                + " " + z
        );
    }
}
