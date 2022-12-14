package ExamplesMod_8;

// используем энам чтобы обьеденить по типу констант дни недели месеца, статусы, сезоны....

public enum DaysOfWeeks {

    SANDAY("Неділя",1)  // у кожному єнаму реалізуємо абстракт метод + геттер транслейт
    {
        @Override
        public  String whotDay(){
            return "Today is a free day!!! " + getTranslate();
    }

    },
    MONDAY("Понеділок",2) {
        @Override
        public  String whotDay(){
            return "Today is a working  day!!! " + getTranslate();
        }

    },
    TUESDAY("Вівторок",3){
        @Override
        public  String whotDay(){
            return "Today is a working  day!!! " + getTranslate();
        }

    },
    WEDNERSDAY("Середа",4){
        @Override
        public  String whotDay(){
            return "Today is a working  day!!! " + getTranslate();
        }

    },
    THURSDAY("Четверг",5){
        @Override
        public  String whotDay(){
            return "Today is a working  day!!! " + getTranslate();
        }

    },
    FREDAY("Пьятниця",6){
        @Override
        public  String whotDay(){
            return "Today is a working  day!!! " + getTranslate();
        }

    },
    SATURDAY("Субота",7)
            {
                @Override
                public  String whotDay(){
                    return "Today is a free day!!! " + getTranslate();
                }




};
    // добавляємо поля в Enam

    private String translate; // в даннов случае переклад
    private int numberOfDay;

    // добавляес конструктор


    DaysOfWeeks(String translate,int numberOfDay){
        this.translate = translate;
        this.numberOfDay = numberOfDay;
    }

    // гетер

    public String getTranslate() {
        return translate;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    // created mathods


    public abstract String whotDay(); // абстракт метод теперь его должен реализовать каждый енам

    public void printi(){

        System.out.println("Enum finished!");
    }

}
