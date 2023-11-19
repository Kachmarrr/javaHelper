public class ToggleButton {
    private boolean isOn;

    public ToggleButton() {
        this.isOn = false; // За замовчуванням кнопка вимкнена
    }

    public void toggle() {
        isOn = !isOn; // Зміна стану кнопки на протилежний
        if (isOn) {
            System.out.println("Кнопка увімкнена");
        } else {
            System.out.println("Кнопка вимкнена");
        }
    }

    public static void main(String[] args) {
        ToggleButton button = new ToggleButton();

        // Тестуємо кнопку
        button.toggle(); // Увімкнути
        button.toggle(); // Вимкнути
    }
}
