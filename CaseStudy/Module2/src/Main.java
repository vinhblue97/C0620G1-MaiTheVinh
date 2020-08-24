import controllers.MainController;

import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        MainController controller = new MainController();
        controller.displayMainMenu();
    }
}
