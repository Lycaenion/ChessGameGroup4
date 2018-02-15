package com.company;

import javax.swing.*;

public class Pawn extends Piece {

    public Pawn(boolean color) {
        super(color);
        this.value = 1;

        if (color){
            this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\chessjframe\\src\\com\\company\\bilder\\white_pawn.png");
        }else {
            this.icon = new ImageIcon("C:\\Users\\Jonas\\IdeaProjects\\chessjframe\\src\\com\\company\\bilder\\black_pawn.png");
        }

    }
}
