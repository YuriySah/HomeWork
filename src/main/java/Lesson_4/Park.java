package Lesson_4;

public class Park {
    public static Attraction carousel = new Attraction("Карусель", 15, 3);
    public static Attraction rollerCoaster = new Attraction("Американские горки", 25, 10);
    public static Attraction overviewWheel = new Attraction("Колесо обзора", 30, 5);

    public static void main(String[] args) {
        carousel.displayAttractionInfo();
        rollerCoaster.displayAttractionInfo();
        overviewWheel.displayAttractionInfo();
    }

    public static class Attraction extends Park {
        private String nameOfAttraction;
        private int attractionTimeOfWork;
        private int attractionCost;

        public Attraction(String nameOfAttraction, int attractionTimeOfWork, int attractionCost) {
            this.nameOfAttraction = nameOfAttraction;
            this.attractionTimeOfWork = attractionTimeOfWork;
            this.attractionCost = attractionCost;
        }

        public void displayAttractionInfo() {
            System.out.println("Атракцион - " + getNameOfAttraction()+ ", " + " Стоимость - " + getAttractionCost() + "$ "
                    + "за " + getAttractionTimeOfWork() + " минут");
        }

        public int getAttractionCost() {
            return attractionCost;
        }

        public int getAttractionTimeOfWork() {
            return attractionTimeOfWork;
        }

        public String getNameOfAttraction() {
            return nameOfAttraction;
        }

    }
}
