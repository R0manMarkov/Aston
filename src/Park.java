class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    // Внутренний класс Attraction
    public class Attraction {
        private String attractionName;
        private String workingHours;
        private int price;

        public Attraction(String attractionName, String workingHours, int price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("Attraction Name: " + attractionName);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Price: " + price);
            System.out.println();
        }
    }
}