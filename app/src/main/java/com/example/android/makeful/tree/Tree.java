package com.example.android.makeful.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by ashley on 5/30/15.
 */
public class Tree {
    private List<String> projectNames;
    private Map<String, Node> projectTrees;

    protected Tree() {
        projectNames = new LinkedList<String>();
        projectTrees = new HashMap<String, Node>();

        projectNames.add("[Baking] Cupcakes");
        projectTrees.put("[Baking] Cupcakes", ex1());

        projectNames.add("[DIY] Multicolored Light Decoration");
        projectTrees.put("[DIY] Multicolored Light Decoration", ex2());

        projectNames.add("[DIY] Tissue Paper Flowers");
        projectTrees.put("[DIY] Tissue Paper Flowers", ex3());

        projectNames.add("[Cooking] Chicken Piquant");
        projectTrees.put("[Cooking] Chicken Piquant", ex4());
    }

    private static Tree instance = null;

    public static Tree getInstance() {
        if(instance == null) {
            instance = new Tree();
        }
        return instance;
    }

    public List<String> getProjectNames() {
        return projectNames;
    }

    public Node newProject(String name) {
        Instruction tree = new Instruction();
        tree.text = "Enter instructions here";
        projectNames.add(name);
        projectTrees.put(name, tree);
        return tree;
    }

    public Node getProject(String projectName) {
        return projectTrees.get(projectName);
    }

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
        Instruction instr13 = new Instruction(300);

        //where do I include "softened"
        instr13.text = " Ingredients: \n" +
                    " cupcake liners: 12 whole \n" +
                    " baking powder: 2 teaspoons \n" +
                    " salt: 0.5 teaspoons \n" +
                    " flour: 2 cups \n" +
                    " eggs: 2 whole \n" +
                    " milk: 1 cup \n " +
                    " vanilla extract: 1 teaspoon" +
                    " butter: 0.5 cups, softened \n" +
                    " sugar:  0.75 cups \n";

        instr1.text = "Preheat the oven 350F";
        instr1.left = instr13;

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

    public Node ex2(){
        Instruction instr1 = new Instruction(1200);
        Instruction instr2 = new Instruction(300);
        Instruction instr3 = new Instruction(120);
        Instruction instr4 = new Instruction(60);
        Instruction instr5 = new Instruction(120);
        Instruction instr6 = new Instruction(90);


        instr1.text = " Ingredients: \n 1 pack of LED Multicolored Lights \n Ping Pong Balls (1 for each LED light) \n 1 Exacto or other precise knife";

        instr2.text = "Using an exacto or other precise knife, cut a small hole that snuggly fits an LED light";
        instr2.left = new Ingredient("ping pong balls", 24, "whole");
        instr2.right = instr1;

        instr3.text = "Unwind the LED lights.";
        instr3.left = new Ingredient("Multicolored LED Light", 1, "whole");
        instr3.right = instr2;

        instr4.text = " Place individual lights in ping pong balls";
        instr4.left = instr3;

        instr5.text = "Hang where desired!";
        instr5.left  = instr4;

        return instr5;
    }
    public Node ex3(){
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
        Instruction instr13 = new Instruction(300);
        Instruction instr14 = new Instruction(300);
        Instruction instr15 = new Instruction(300);
        Instruction instr16 = new Instruction(300);
        Instruction instr17 = new Instruction(300);
        Instruction instr18 = new Instruction(300);

        instr18.text = " Ingredients: \n" +
                " yellow sheets of Tissue paper: 2 whole\n" +
                " darker outer color tissue paper: 3 whole\n" +
                " 1 pipecleaner\n" +
                " lighter inner color tissue paper: 3 whole\n";

        instr1.text = "Lay the sheets of tissue in a pile as neatly as possible.";
        instr1.left = new Ingredient("darker tissue paper", 2, "whole");
        instr1.left = new Ingredient("yellow tissue paper", 2, "whole");

        instr2.text = "Fold all the sheets over at the same time, you can play with the size of the fold so get different effects but 5-6cm is a good start.";
        instr2.left = instr18;
        instr2.right = instr1;

        instr3.text = "Now repeat this fold back the other way.";
        instr3.left = new Ingredient("darker tissue paper", 2, "whole");
        instr3.right = instr2;

        instr4.text = "Continue with this accordion style folding until you have folded all the paper. At this point I like to run something hard like a ruler along the folds to make sure they stay.";
        instr4.left = instr3;

        instr5.text = "Now you can unfold the tissue and separate the yellow pieces from the rest";
        instr5.left = instr4;

        instr6.text = "Fold the yellow tissue back up, it should go back together nice and easy thanks to that little ruler trick. Fold in half and trim to about half the size it was.";
        instr6.left = instr5;

        instr7.text = "Now take a pair of scissors and make lots of long cuts in the yellow tissue. This will now be your flowers centre.";
        instr7.right = instr6;

        instr8.text = "Now take the coloured tissue and fold it in half, cut the ends into whatever shape you would like your petals to be. " +
                      "The most important part here is to make sure you cut quite a long way down the sides as this will make it easier to form your flower.";
        instr8.right = instr7;

        instr9.text = "Now you have your petals and your flowers centre. If you notice any petals that are a little too joined together due to how the paper is folded now is a good time to fix them up.";
        instr9.left = instr8;

        instr10.text = "Unfold all your tissue paper again and lay the yellow tissue back in the centre.";
        instr10.left = instr9;

        instr11.text = "Re-fold the tissue, this can be a little tricky, just try to get it back together as best you can as it doesn’t matter if it is a little messy.";
        instr11.left = instr10;

        instr12.text = "Fold all the tissue in half.";
        instr12.left = instr11;

        instr13.text = "Wrap a pipecleaner through the centre of the folded tissue paper and twist to secure.";
        instr13.left = instr12;

        instr14.text = "Now start with one side and pull up the tissue whilst fluffing it up, separating each layer to create the centre of the flower.";
        instr14.left = instr13;

        instr15.text = "Now do the same with the petal layers. You need to me very gentle so as not to rip the tissue paper.";
        instr15.left = instr14;

        instr16.text = "Once you have finished once side its time to do the other side.";
        instr16.left = instr15;

        instr17.text = "Ta-da, your pretty spring flower.";
        instr17.left = instr16;

        return instr17;
    }

    public Node ex4() {
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
        Instruction instr11 = new Instruction(600);
        Instruction instr12 = new Instruction(1080);
        Instruction instr13 = new Instruction(1080);

        instr13.text = "Ingredients: \n 1/2 cup all-purpose flour\n" +
                " 1/2 teaspoon Creole seasoning \n" +
                " 1 (16 ounce) package boneless, skinless chicken breast tenders\n" +
                " 1 tablespoon olive oil\n" +
                " 1 (10 ounce) can diced tomatoes with green chile peppers\n" +
                " 1/4 cup diced sweet pickles\n" +
                " 2 tablespoons red wine vinegar\n" +
                " 2 tablespoons drained capers\n" +
                " 2 garlic cloves, crushed\n";

        instr1.text = "Mix flour and Creole seasoning together in a shallow bowl";
        instr1.left = new Ingredient("flour", 0.5, "cups");
        instr1.right = new Ingredient("Creole Seasoning", 0.5, "teaspoons");

        instr2.text = "Dredge chicken through the flour mixture, shaking off excess";
        instr2.left = instr1;
        instr2.right = new Ingredient("chicken tenders", 16, "ounces");

        instr3.text = "Heat oil in a skillet over medium-heat.";
        instr3.left = new Ingredient("Olive Oil", 1, "tablespoon");
        instr3.right = instr13;

        instr4.text = "Cook chicken in the hot oil until browned, about 2 minutes per side.";
        instr4.left = instr3;

        instr5.text = "Add diced tomatoes pan";
        instr5.left = new Ingredient("tomatoes", 10, "ounces");
        instr5.right = instr4;

        instr6.text = "Add green chile peppers to pan";
        instr6.left = new Ingredient("green chile peppers", 10, "ounces");
        instr6.right = instr5;

        instr7.text = "Add pickles to pan";
        instr7.left = new Ingredient("pickles", .25, "cups");
        instr7.right = instr6;

        instr8.text = "Add vinegar to pan";
        instr8.left = new Ingredient("vinegar", 1, "tablespoon");
        instr8.right = instr7;

        instr9.text = "Add capers to pan";
        instr9.left = new Ingredient("capers", 2, "tablespoons");
        instr9.right = instr8;

        instr10.text = "Add garlic to pan";
        instr10.left = new Ingredient("garlic", 2, "cloves, crushed");
        instr10.right = instr9;

        instr11.text = "Simmer mixuture until chicken is no longer pink in the center";
        instr11.left = instr10;

        instr12.text = "Finished!";
        instr12.left = instr11;

        return instr12;
    }
                //, about 10 minutes more.
    /*
    Original recipe makes 8 chicken tendersChange Servings




     */
    }
