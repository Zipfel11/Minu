package utils;

public class Constants {

    public static class Directions {
        public static final int LEFT = 0, UP = 1, RIGHT = 2, DOWN = 3;
    }

    public static class PlayerConstants{
        public static final int IDLE = 0,
                RUNNING = 1,
                JUMPING = 2,
                FALLING = 3,
                GROUND = 4,
                HIT = 5,
                ATTACK_1 = 6,
                ATTACK_JUMP_1 = 7,
                ATTACK_JUMP_2 = 8;

        //return the length of the animations that the player_action has
        public static int getSpriteAmount(int player_action){
            switch (player_action) {
                case RUNNING:
                    return 6;
                case IDLE:
                    return 5;
                case HIT:
                    return 4;
                case JUMPING:
                case ATTACK_1:
                case ATTACK_JUMP_1:
                case ATTACK_JUMP_2:
                    return 3;
                case GROUND:
                    return 2;
                case FALLING:
                default:
                    return 1;
            }
        }

    }

}
