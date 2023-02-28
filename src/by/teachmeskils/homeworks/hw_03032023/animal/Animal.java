package by.teachmeskils.homeworks.hw_03032023.animal;

public abstract class Animal {
    protected String picture; // картинка
    protected String food; // употребляемая еда
    protected int hunger; // уровень голода
    protected Boundaries boundaries; // границы участка класса Boundaries
    protected Location location; // координаты животного класса Location

    public Animal(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        this.picture = picture;
        this.food = food;
        this.hunger = hunger;
        this.boundaries = boundaries;
        this.location = location;
    }

    protected static class Boundaries { // вложенный клас Boundaries (грнаницы участка)
        private int width; // ширина участка
        private int height; // длина участка

        public Boundaries(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "Boundaries{" +
                    "width=" + width +
                    ", height=" + height +
                    '}';
        }
    }

    protected static class Location { // вложенный класс Location (координаты на местности)
        private int x;
        private int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    protected abstract void makeNoise();

    protected abstract void eat();

    protected void sleep() {
        System.out.println("Как спят животные?");
    }

    protected void roam() {
        System.out.println("Животное бродит в поисках еды");
    }
}
