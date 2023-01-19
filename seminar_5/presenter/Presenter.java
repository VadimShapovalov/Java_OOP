package seminar_5.presenter;

import seminar_5.model.AttendanceService;
import seminar_5.view.AttendanceView;

public class Presenter {
    private AttendanceView view;
    private AttendanceService model;

    public Presenter(AttendanceView view, AttendanceService model) {
        this.view = view;
        this.model = model;
    }

    public void start() {
        view.print();
    }

}