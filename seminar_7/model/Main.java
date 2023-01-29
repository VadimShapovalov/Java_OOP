package seminar_7.model;

import java.util.LinkedList;
import java.util.List;

import seminar_7.presenter.Presenter;
import seminar_7.view.ViewCounterAgent;

/*
Напишите приложение, которое позволяет пользователю управлять своим списком контактов. Используйте наследование, полиморфизм, принципы SOLID.
Контрагент — это либо человек, либо компания.
У каждого контрагента есть список способов связаться: телефон, email, ник в telegram, адрес страницы VK, уличный адрес. Разрешается, что у одного контрагента сколько угодно способов связаться, например, несколько телефонов или несколько адресов.
Программа должна позволять следующие действия:
• Посмотреть список контрагентов
• Найти контрагента по названию. Посмотреть подробную информацию о нём
• Добавить контрагента
• Удалить контрагента
• Добавить новый способ связаться с контрагентом
• Удалить способ связаться с контрагентом
Если задача кажется слишком простой, вы можете выбрать следующие необязательные усложнения:
• Используйте паттерн MVC или MVP для архитектуры приложения
• Решите задачу на языке, отличном от Java
• Возможность сохранять книгу контактов в файл, загружать из файла
*/
public class Main {
    public static void main(String[] args) {
            CounterAgent Alex = new CounterAgent("Alex",
                            new LinkedList<>(List.of(new PhoneNumber("Phone", "89118887766"),
                                            new Address("Address", "Green street 1/1"),
                                            new VK("VK", "@id102425"))));
            CounterAgent John = new CounterAgent("John",
                            new LinkedList<>(
                                            List.of(new PhoneNumber("Phone", "89112222222"),
                                                            new Address("Address", "Yellow street 22/2"),
                                                            new VK("VK", "@id777777"),
                                                            new Telegram("Telegram", "@jonh"))));
            CounterAgent Maks = new CounterAgent("Maks",
                            new LinkedList<>(
                                            List.of(new PhoneNumber("Phone", "89113333333"),
                                                            new Address("Address", "Black street 33/3"),
                                                            new VK("VK", "@id6585849"),
                                                            new Email("Email", "maks3@gmail.com"))));

            List<CounterAgent> agentsList = new LinkedList<>();
            agentsList.add(Alex);
            agentsList.add(John);
            agentsList.add(Maks);

            Model model = new Model(agentsList);
            ViewCounterAgent view = new ViewCounterAgent(model);
            Presenter presenter = new Presenter(model, view);
            presenter.start();

    }
}