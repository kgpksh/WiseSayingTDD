package org.example;

public class Service {
    Repository repository = new Repository();
    public void save(String content) {
        long id = repository.save();
        System.out.println(id + "번 명언이 등록되었습니다.");
    }
}
