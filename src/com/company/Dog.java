package com.company;

import com.company.Figure.Drawable;

public  class Dog extends Animal implements Drawable {

    public Dog(String name) {
        super(name);

    }

    @Override
    public String draw() {
        return "         ,--._______,-.\n" +
                "       ,','  ,    .  ,_`-.\n" +
                "      / /  ,' , _` ``. |  )       `-..\n" +
                "     (,';'\"\"`/ '\"`-._ ` \\/ ______    \\\\\n" +
                "       : ,o.-`- ,o.  )\\` -'      `---.))\n" +
                "       : , d8b ^-.   '|   `.      `    `.\n" +
                "       |/ __:_     `. |  ,  `       `    \\\n" +
                "       | ( ,-.`-.    ;'  ;   `       :    ;\n" +
                "       | |  ,   `.      /     ;      :    \\\n" +
                "       ;-'`:::._,`.__),'             :     ;\n" +
                "      / ,  `-   `--                  ;     |\n" +
                "     /  \\                   `       ,      |\n" +
                "    (    `     :              :    ,\\      |\n" +
                "     \\   `.    :     :        :  ,'  \\    :\n" +
                "      \\    `|-- `     \\ ,'    ,-'     :-.-';\n" +
                "      :     |`--.______;     |        :    :\n" +
                "       :    /           |    |         |   \\\n" +
                "       |    ;           ;    ;        /     ;\n" +
                "     _/--' |   -hrr-   :`-- /         \\_:_:_|\n" +
                "   ,',','  |           |___ \\\n" +
                "   `^._,--'           / , , .)\n" +
                "                      `-._,-'\n" +
                "\n";

    }
}
