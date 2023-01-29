package seminar_7.presenter;

import seminar_7.model.Model;
import seminar_7.view.ViewCounterAgent;

public class Presenter {
    private Model model;
    private ViewCounterAgent view;

    public Presenter(Model model, ViewCounterAgent view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        view.print();
    }

}
