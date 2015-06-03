package com.example.android.makeful;

import org.w3c.dom.Node;

/**
 * Created by ashley on 5/30/15.
 */
public class Tree {
    public Node ex1(){

        Instruction instr1 = new Instruction(1800);
        Instruction instr2 = new Instruction(300);
        Instruction instr3 = new Instruction(120);
        Instruction instr4 = new Instruction(60);
        Instruction instr5 = new Instruction(120);
        Instruction instr6 = new Instruction(90);
        Instruction instr7 = new Instruction(180);
        Instruction instr8 = new Instruction(40);
        Instruction instr9 = new Instruction(40);
        Instruction instr10 = new Instruction(240);
        Instruction instr11 = new Instruction(1080);
        Instruction instr12 = new Instruction(300);

        //where do I include "softened"

        instr1.text = "Preheat the oven 350F";

        instr2.text = "Line muffin cups with papers";
        instr2.left = new Ingredient("cupcake liners", 12, "whole");

        instr3.text = "Add salt and baking powder to flour";
        instr3.left = new Ingredient("baking powder", 2, "teaspoons");
        instr3.right = new Ingredient("salt", 0.5, "teaspoons");

        instr4.text = "Mix into flour well and set aside";
        instr4.left = instr3;
        instr4.right = new Ingredient("flour", 2, "cups");

        instr5.text = "Cream butter and sugar in bowl until light and fluffy";
        instr5.left  = new Ingredient("butter", .5, "cups", "softened");
        instr5.right = new Ingredient("sugar", .75, "cups");

        instr6.text = "beat in eggs one at a time";
        instr6.left = instr5;
        instr6.right = new Ingredient("eggs", 2, "whole");

        instr7.text = "Alternate adding flour and milk to bowl until both are consumed";
        instr7.right = instr6;
        instr7.left = new Ingredient("milk", 1, "cup");

        instr8.text = "Mix until ingredients are well incorporated";
        instr8.right = instr7;
        instr9.left = instr4;

        instr9.text = "stir in vanilla";
        instr9.left = instr8;
        instr9.right = new Ingredient("vanilla extract", 1, "teaspoon");

        instr10.text = "divide evenly among pans";
        instr10.left = instr9;
        instr10.right = instr2;

        instr11.text = "Bake";
        instr11.left = instr10;
        instr11.right = instr1;
        instr12.text = "Let cool";
        instr12.left = instr11;

        return instr12;
    }
}
