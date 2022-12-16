package ExamplesMod_8;

public enum Digit {
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);


    private int value;

    Digit(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

   /* @Override
    public String toString() { // перевизначили метод со світчем

        switch (this){

            case ZERO: return " 0";
            case ONE: return " 1";
            case TWO: return " 2";
            case THREE: return " 3";
            case FOUR: return " 4";
            case FIVE: return " 5";
            case SIX: return " 6";
            case SEVEN: return " 7";
            case EIGHT: return " 8";
            case NINE: return " 9";
            case TEN: return " 10";
            default: throw  new IllegalStateException("Not implemented for " + name());
        }


    }
    */

    @Override
    public String toString() { // перевизначили метод і передали в параметри нашу змііну value
return Integer.toString(value);
    }

    // у енама можуть бути такі ж методи як у звичайного классу



    }

